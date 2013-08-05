package com.geoespol.listviewDesign;

import java.util.ArrayList;
import java.util.HashMap;

import com.geoespol.R;
import com.geoespol.activities.MainTasksActivity;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListVAdapter extends BaseAdapter{
	private Activity activity;
    private ArrayList<HashMap<String, String>> data;
    private static LayoutInflater inflater=null;
    //public ImageLoader imageLoader; 
    
	public ListVAdapter(Activity a, ArrayList<HashMap<String, String>> d) {
		// TODO Auto-generated constructor stub
		this.activity = a;
		this.data = d;
		inflater = (LayoutInflater)this.activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return data.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View vi = convertView;
		
		if(convertView == null)
			vi = inflater.inflate(R.layout.list_row, null);
		
		
		TextView title = (TextView)vi.findViewById(R.id.title); // title
        TextView artist = (TextView)vi.findViewById(R.id.artist); // artist name
        TextView duration = (TextView)vi.findViewById(R.id.duration); // duration
        ImageView thumb_image=(ImageView)vi.findViewById(R.id.list_image); // thumb image
        HashMap<String, String> item = new HashMap<String, String>();
        item = data.get(position);
        //vi.setId(Integer.parseInt(item.get(MainTasksActivity.KEY_ID)));
        // Setting all values in listview
        title.setText(item.get(MainTasksActivity.KEY_TITLE));
        artist.setText(item.get(MainTasksActivity.KEY_ARTIST));
        duration.setText(item.get(MainTasksActivity.KEY_DURATION));
       // imageLoader.DisplayImage(song.get(CustomizedListView.KEY_THUMB_URL), thumb_image);
		Drawable img = this.activity.getResources().getDrawable(Integer.parseInt(item.get(MainTasksActivity.KEY_THUMB_URL)));
        thumb_image.setImageDrawable(img);
        return vi;
	}

}
