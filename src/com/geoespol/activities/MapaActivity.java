package com.geoespol.activities;

import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.views.MapView;

import android.app.Activity;
import android.os.Bundle;

public class MapaActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		MapView mapa=new MapView(this, 256);
        mapa.setTileSource(TileSourceFactory.MAPNIK);
        mapa.setClickable(true);
        mapa.setMultiTouchControls(true);
        mapa.setBuiltInZoomControls(true);
        mapa.getController().setZoom(14);
        mapa.getController().animateTo(-2.177515, -79.906311);//Guayaquil
        //mapa.getController().setCenter(new GeoPoint(76.906311,2.177515));
        mapa.setUseDataConnection(true);
        setContentView(mapa); 
	}
}
