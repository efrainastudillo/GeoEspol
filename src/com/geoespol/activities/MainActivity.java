package com.geoespol.activities;


import com.geoespol.R;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar= getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        
        btn=(Button)findViewById(R.id.btnUsuarioEspol);
        btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(), UserEspolActivity.class);
				startActivity(intent);
			}
		});
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    @Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		
//		case R.id.quitOption:
//			log.debug( "quitting app");
//
//			finish();
//
//			return true;
//			
//		case R.id.main_new_project_option:
//			log.debug( "new project");
//			Intent npi = new Intent(this, ProjectActivity.class);
//			npi.putExtra(ProjectActivity.START_MODE, ProjectActivity.START_NEW);
//			startActivity(npi);
//			break;
			
		case R.id.main_wifi_scan:
			//log.debug( "starting sample scan activity");
			//Intent scanIntent = new Intent(this, SampleScanActivity.class);
			//startActivity(scanIntent);
			
			break;
			
//		case R.id.main_sensors_option:
//			log.debug("starting sensors test activity");
//			Intent sensorsIntent=new Intent(this,SensorsActivity.class);
//			startActivity(sensorsIntent);
//			
//			break;
			
			
		case R.id.main_export_option:
			//log.debug("starting export db activity");
			Intent exportIntent=new Intent(this,DBActivity.class);
			startActivity(exportIntent);
			
			
			break;
			
		case R.id.main_settings_option:
			//log.debug("starting preferences activity");
			//Intent prefsIntent=new Intent(this,PreferencesActivity.class);
			//startActivity(prefsIntent);
			break;
			
		case R.id.main_menu_step_calibrate:
			//log.debug("calibrating sensors");
			//Intent calibrateIntent=new Intent(this,CalibratorActivity.class);
			//startActivity(calibrateIntent);
			break;
			
		default:
			//log.debug("could not identify sender: "+item.getItemId());
			return super.onOptionsItemSelected(item);
		}
		
		return false;

	}
    
}
