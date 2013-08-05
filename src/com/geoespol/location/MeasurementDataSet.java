package com.geoespol.location;

import java.util.Vector;

import android.graphics.PointF;

public class MeasurementDataSet {

	public static final String VALUE_X = null;
	public static final String VALUE_Y = null;
	public float rssi;
	public float y;
	public float x;

	public MeasurementDataSet(float x, float y, Object level) {
		// TODO Auto-generated constructor stub
	}

	public int getRssi() {
		// TODO Auto-generated method stub
		return 0;
	}

	public float getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	public float getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	public PointF getPointF() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Object getMaximumValue(Vector<MeasurementDataSet> data,
			String valueY) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Object getMinimumValue(Vector<MeasurementDataSet> data,
			String valueY) {
		// TODO Auto-generated method stub
		return null;
	}

}
