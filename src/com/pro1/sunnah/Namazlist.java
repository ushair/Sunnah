package com.pro1.sunnah;


import com.pro1.sunnah.rakat.Rakat;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class Namazlist extends ListActivity implements OnItemClickListener {
	public static long u ;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_namazlist);
		ListView listview = (ListView) findViewById(android.R.id.list);

		listview.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.namaz)));
listview.setOnItemClickListener(this);
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.namazlist, menu);
		
		return true;
	}

	

	@Override
	public void onItemClick(AdapterView<?> adap, View v, int pos, long id) {
		
		{	
			Intent intent = new Intent(v.getContext(), Rakat.class);
			Namazlist.u=id;
			startActivityForResult(intent,0);
		}}
	}
		
	


