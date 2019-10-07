package com.pro1.sunnah.rakat;

import com.pro1.sunnah.Namazlist;
import com.pro1.sunnah.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.LinearLayout;

public class Rakat extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rakat);
		LinearLayout ly = (LinearLayout) findViewById(R.id.LinearLayout1);
		if(Namazlist.u==0)
		{
		ly.setBackgroundResource(R.drawable.fajar);
		}
		else if(Namazlist.u==1)
		{
			ly.setBackgroundResource(R.drawable.zohar);	
		}
		else if(Namazlist.u==2)
		{
		ly.setBackgroundResource(R.drawable.asar);
		}
		else if(Namazlist.u==3)
		{
		ly.setBackgroundResource(R.drawable.magrib);
		}
		else if(Namazlist.u==4)
		{
		ly.setBackgroundResource(R.drawable.isha);
		}
		else if(Namazlist.u==5)
		{
		ly.setBackgroundResource(R.drawable.jummah);
		}
	}
		
		

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.rakat, menu);
		return true;
	}

}
