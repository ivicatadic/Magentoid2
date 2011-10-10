/*
 * Magentoid2
 * 
 * @author	Ivica Tadić <ivica.tadic@ymail.com>
 */
package com.ivica.magentoid.customer;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

import com.ivica.magentoid.core.MessageDS;
import com.ivica.magentoid.core.Model;

public class Customer extends Model {
	
	private final static String CUSTOMER_IS_LOGGINED = "/xmlconnect/customer/isloggined";
	
	public MessageDS ds;
	
	public MessageDS fetchCustomerIsLoggined() {
		try {
			ds = serializer.read(MessageDS.class,
					client.fetchUrl(CUSTOMER_IS_LOGGINED));
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return ds;
	}

}
