package com.geoespol.activities;

import java.util.ArrayList;
import java.util.HashMap;

import com.geoespol.R;
import com.geoespol.listviewDesign.ListVAdapter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class MainTasksActivity extends Activity{
	public static final String KEY_SONG = "song"; // parent node
    public static final String KEY_ID = "id";
    public static final String KEY_TITLE = "title";
    public static final String KEY_ARTIST = "artist";
    public static final String KEY_DURATION = "duration";
    public static final String KEY_THUMB_URL = "thumb_url";
    
    ListView listview;
	ListVAdapter adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_tasks);
		 ArrayList<HashMap<String, String>> songsList = new ArrayList<HashMap<String, String>>();
		 HashMap<String, String> aulas= new HashMap<String, String>();
		 HashMap<String, String> ir_a= new HashMap<String, String>();
		 HashMap<String, String> buscar= new HashMap<String, String>();
		 
		 aulas.put(KEY_ID, "aulas");
		 aulas.put(KEY_TITLE, "Aulas");
		 aulas.put(KEY_ARTIST, "Ver aulas de mis materias");
		 aulas.put(KEY_DURATION, "0");
		 aulas.put(KEY_THUMB_URL,Integer.toString(R.drawable.ic_aulas));
		 
		 ir_a.put(KEY_ID, "ira");
		 ir_a.put(KEY_TITLE, "Ir A..");
		 ir_a.put(KEY_ARTIST, "Lugar en el mapa donde ir");
		 ir_a.put(KEY_DURATION, "0");
		 ir_a.put(KEY_THUMB_URL,Integer.toString(R.drawable.ic_pushpin));
		 
		 buscar.put(KEY_ID, "buscar");
		 buscar.put(KEY_TITLE, "Buscar");
		 buscar.put(KEY_ARTIST, "Buscar Aula o Lugar de interés");
		 buscar.put(KEY_DURATION, "0");
		 buscar.put(KEY_THUMB_URL,Integer.toString(R.drawable.ic_search));
		 songsList.add(aulas);
		 songsList.add(ir_a);
		 songsList.add(buscar);
		 
		 listview = (ListView)findViewById(R.id.listvmaintasks);
		 adapter = new ListVAdapter(this, songsList);
		 listview.setAdapter(adapter);
		 
		 
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}
}
