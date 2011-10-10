/*
 * Magentoid2
 * 
 * @author	Ivica Tadić <ivica.tadic@ymail.com>
 */
package com.ivica.magentoid.core;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.util.ByteArrayBuffer;

public class Client {

	protected static final MagentoidApp mApp = MagentoidApp.getInstance();
	private DefaultHttpClient httpClient;
	private static final String magentoUrl = MagentoidApp.MAGENTO_URL;
	private static final String appCode = MagentoidApp.MAGENTO_APP_CODE;

	Client() {
		createHttpClient();
	}

	Client(DefaultHttpClient httpClient) {
		this.httpClient = httpClient;
	}

	private void createHttpClient() {
		BasicHttpParams params = new BasicHttpParams();
		SchemeRegistry schemeRegistry = new SchemeRegistry();
		schemeRegistry.register(new Scheme("http", PlainSocketFactory
				.getSocketFactory(), 80));

		final SSLSocketFactory sslSocketFactory = SSLSocketFactory
				.getSocketFactory();
		schemeRegistry.register(new Scheme("https", sslSocketFactory, 443));

		ClientConnectionManager cm = new ThreadSafeClientConnManager(params,
				schemeRegistry);

		httpClient = new DefaultHttpClient(cm, params);
		httpClient.getCookieStore().getCookies();

		BasicClientCookie cookie = new BasicClientCookie("app_code", appCode);
		cookie.setDomain(magentoUrl.split("://")[1]); // get rid of 'http' or
		// 'https' in URL
	}

	public InputStream fetchUrl(String strUrl) throws ClientProtocolException,
			IOException {

		HttpGet httpget = new HttpGet(magentoUrl + strUrl);
		HttpResponse response;
		response = httpClient.execute(httpget);

		return response.getEntity().getContent();
	}
	
	public InputStream fetchUrlCached(String strUrl) throws ClientProtocolException,
	IOException {
		return null;
	}

	public InputStream fetchUrlPost(String strUrl, List<NameValuePair> pairs)
			throws ClientProtocolException, IOException {

		HttpPost post = new HttpPost(magentoUrl + strUrl);
		post.setEntity(new UrlEncodedFormEntity(pairs));
		HttpResponse response;
		response = httpClient.execute(post);

		return response.getEntity().getContent();
	}

	public String fetchFile(String url) {
		String fileName = MagentoidApp.DATA_DATA_COM_IVICA_MAGENTOID
				+ String.valueOf(url.hashCode());

		try {
			HttpGet httpget = new HttpGet(url);
			HttpResponse response;
			response = httpClient.execute(httpget);

			InputStream is = response.getEntity().getContent();

			BufferedInputStream bis = new BufferedInputStream(is);
			ByteArrayBuffer baf = new ByteArrayBuffer(50);

			int current = 0;
			while ((current = bis.read()) != -1) {
				baf.append((byte) current);
			}

			FileOutputStream fos = new FileOutputStream(fileName);
			fos.write(baf.toByteArray());
			fos.close();

		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return fileName;
	}

}
