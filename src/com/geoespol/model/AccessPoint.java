package com.geoespol.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.misc.BaseDaoEnabled;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = AccessPoint.TABLE_NAME)
public class AccessPoint extends BaseDaoEnabled<AccessPoint, Integer>{
	public final static String TABLE_NAME = "accesspoint";
	
	@DatabaseField(generatedId=true)
	protected int id = 0;
	/**
	 * @uml.property  name="bssid"
	 */
	@DatabaseField
	protected String bssid;
	
	/**
	 * @uml.property  name="ssid"
	 */
	@DatabaseField
	protected String ssid;
	
	/**
	 * @uml.property  name="capabilities"
	 */
	@DatabaseField
	protected String capabilities;
	
	public AccessPoint(BssidResult bssidResult) {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBssid() {
		return bssid;
	}

	public void setBssid(String bssid) {
		this.bssid = bssid;
	}

	public String getSsid() {
		return ssid;
	}

	public void setSsid(String ssid) {
		this.ssid = ssid;
	}

	public String getCapabilities() {
		return capabilities;
	}

	public void setCapabilities(String capabilities) {
		this.capabilities = capabilities;
	}

	

}
