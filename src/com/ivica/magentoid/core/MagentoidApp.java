package com.ivica.magentoid.core;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.ivica.magentoid.configuration.Configuration;
import com.ivica.magentoid.customer.Customer;

public class MagentoidApp extends Application {

	public static MagentoidApp mApp;

	// public static final String MAGENTO_URL =
	// "http://surgeworks4u.com/vitaminfix110";
	public static final String MAGENTO_URL = "http://magentoivica.loc";
	// public static final String MAGENTO_APP_CODE = "vitand1";
	public static final String MAGENTO_APP_CODE = "defand1";
	public static final String DATA_DATA_COM_IVICA_MAGENTOID = "/data/data/com.ivica.magentoid/";

	public static final Client client = new Client();

	private Configuration configuration;
	private Customer customer;

	@Override
	public void onCreate() {
		super.onCreate();

		if (MagentoidApp.mApp == null) {
			MagentoidApp.mApp = this;
		}
	}

	public static MagentoidApp getInstance() {
		return mApp;
	}

	public boolean isOnline() {
		ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo ni = cm.getActiveNetworkInfo();
		if (ni != null && ni.isAvailable() && ni.isConnected()) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * Public getters and setters
	 */
	public void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
	}

	public Configuration getConfiguration() {
		if (configuration == null) {
			configuration = new Configuration();
			configuration.load(320, 480);
		}

		return configuration;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Customer getCustomer() {
		if (customer == null) {
			customer = new Customer();
		}
		return customer;
	}

}
