package com.ivica.magentoid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.ivica.magentoid.configuration.Configuration;
import com.ivica.magentoid.core.MagentoidApp;

public class MagentoidActivity extends Activity {
    
	MagentoidApp mApp;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        this.mApp = (MagentoidApp) getApplicationContext();

        Configuration configuration = new Configuration();
        configuration.load(320, 480);
        
        if (configuration.ds == null) {
            Toast.makeText(this, "Ništa", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, configuration.ds.getGeneral().getCopyright(), Toast.LENGTH_LONG).show();
        }
        
    }
}