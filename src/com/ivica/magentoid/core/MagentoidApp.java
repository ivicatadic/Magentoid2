package com.ivica.magentoid.core;

import android.app.Application;

public class MagentoidApp extends Application {
	
	public MagentoidApp() {
		this.myState = "Ovo je moje stanje :)";
	}
	
	private String myState;

	public void setMyState(String myState) {
		this.myState = myState;
	}

	public String getMyState() {
		return myState;
	}

}
