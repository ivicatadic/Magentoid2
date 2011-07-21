package com.ivica.magentoid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.ivica.magentoid.core.MagentoidApp;

public class MagentoidActivity extends Activity {
    
	MagentoidApp mApp;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        this.mApp = (MagentoidApp) getApplicationContext();
        String state = mApp.getMyState();
        
        Toast.makeText(this, state, Toast.LENGTH_LONG).show();
    }
}