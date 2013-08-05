package com.geoespol.model.helpers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import android.widget.Toast;

import com.geoespol.R;
import com.geoespol.model.AccessPoint;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

public class DatabaseHelper extends OrmLiteSqliteOpenHelper{

	// name of the database file for your application -- change to something appropriate for your app
	public static final String DATABASE_NAME = "wificompass.db";

	// any time you make changes to your database objects, you may have to increase the database version
	private static final int DATABASE_VERSION = 25;
	
	protected Context context;
	protected static final Class<?>[] ormClasses = {AccessPoint.class};
	public DatabaseHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
		this.context = context;
	}
	
	public DatabaseHelper(Context context, String name){
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		this.context = context;
	}

	@Override
	public void onCreate(SQLiteDatabase arg0, ConnectionSource arg1) {
		// TODO Auto-generated method stub
		try {
			for(int i = ormClasses.length ; i != 0 ; i--){
				TableUtils.createTable(this.getConnectionSource(), ormClasses[i]);
			}
		} catch (Exception e) {
			// TODO: handle exception
			Toast.makeText(context, R.string.error_create_table, Toast.LENGTH_LONG);
		}
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, ConnectionSource arg1, int arg2,
			int arg3) {
		// TODO Auto-generated method stub
		
	}

}
