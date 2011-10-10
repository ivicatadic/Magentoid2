/*
 * Magentoid2
 * 
 * @author	Ivica Tadić <ivica.tadic@ymail.com>
 */
package com.ivica.magentoid.configuration;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

import com.ivica.magentoid.configuration.ds.ConfigurationDS;
import com.ivica.magentoid.core.MagentoidApp;
import com.ivica.magentoid.core.Model;

public class Configuration extends Model {

	private final static String CONFIGURATION = "/xmlconnect/configuration/index/app_code/%s/screen_size/%sx%s";

	public ConfigurationDS ds;

	public void load(Integer width, Integer height) {
		String preparedUrl = String.format(CONFIGURATION,
				MagentoidApp.MAGENTO_APP_CODE, width, height);

		try {
			ds = serializer.read(ConfigurationDS.class, client
					.fetchUrl(preparedUrl));
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
