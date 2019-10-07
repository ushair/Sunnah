package com.pro1.sunnah;

import com.pro1.sunnah.rakat.Month;
import android.os.Bundle;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Time_activity extends ListActivity implements OnItemClickListener {
	public static long u ;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_time_activity);
		ListView listview = (ListView) findViewById(android.R.id.list);

		listview.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.months)));
listview.setOnItemClickListener(this);
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		
		return true;
	}

	

	public void onItemClick(AdapterView<?> adap, View v, int pos, long id) {
		
		{	
			Intent intent = new Intent(v.getContext(), Month.class);
			Time_activity.u=id;
			startActivity(intent);
		}}

}
