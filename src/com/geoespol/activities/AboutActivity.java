package com.geoespol.activities;


import com.geoespol.R;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

public class AboutActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.usuario_espol);
		ActionBar actionBar= getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        //actionBar.get
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}
}
