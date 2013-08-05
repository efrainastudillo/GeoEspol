package com.geoespol.model;

import java.util.ArrayList;
import java.util.Collection;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.ForeignCollectionField;

public class WifiScanResult {
	/**
	 * @uml.property name="bssids"
	 */
	@ForeignCollectionField
	protected ForeignCollection<BssidResult> bssids;
	protected ArrayList<BssidResult> tempBssids;
	/**
	 * @return the bssids
	 * @uml.property name="bssids"
	 */
	public Collection<BssidResult> getBssids() {
		if (tempBssids != null && tempBssids.size() > 0) {
			return tempBssids;
		} else {
			return bssids;
		}
	}

	public Location getLocation() {
		// TODO Auto-generated method stub
		return null;
	}

}
