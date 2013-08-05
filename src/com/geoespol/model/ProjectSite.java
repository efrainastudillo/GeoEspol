package com.geoespol.model;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.misc.BaseDaoEnabled;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = ProjectSite.TABLE_NAME)
public class ProjectSite extends BaseDaoEnabled<ProjectSite, Integer>{

	public static final String TABLE_NAME= "sites";
	
	@DatabaseField(generatedId = true)
	protected int id;
	/**
	 * @uml.property  name="accessPoints"
	 */
	@ForeignCollectionField
	protected ForeignCollection<AccessPoint> accessPoints;

	/**
	 * @uml.property  name="scanResults"
	 */
	@ForeignCollectionField
	protected ForeignCollection<WifiScanResult> scanResults;
	/**
	 * @return  the accessPoints
	 * @uml.property  name="accessPoints"
	 */
	public ForeignCollection<AccessPoint> getAccessPoints() {
		return accessPoints;
	}

	/**
	 * @return  the scanResults
	 * @uml.property  name="scanResults"
	 */
	public ForeignCollection<WifiScanResult> getScanResults() {
		return scanResults;
	}

	public boolean isBssidSelected(Object bssid) {
		// TODO Auto-generated method stub
		return false;
	}

}
