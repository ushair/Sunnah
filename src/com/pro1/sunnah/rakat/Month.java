package com.pro1.sunnah.rakat;

import com.pro1.sunnah.Time_activity;
import com.pro1.sunnah.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ImageView;

public class Month extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_month);
			ImageView imn = (ImageView) findViewById(R.id.namazview);
		
		if(Time_activity.u==0)
		{
		imn.setImageResource(R.drawable.jan);
		}
		else if(Time_activity.u==1)
		{
			imn.setImageResource(R.drawable.feb);
			}
		else if(Time_activity.u==2)
		{
			imn.setImageResource(R.drawable.mar);
			}
		else if(Time_activity.u==3)
		{
			imn.setImageResource(R.drawable.apr);
				}
		else if(Time_activity.u==4)
		{
			imn.setImageResource(R.drawable.may);
			}
		else if(Time_activity.u==5)
		{
			imn.setImageResource(R.drawable.jun);
			}
		else 	if(Time_activity.u==6)
		{
		imn.setImageResource(R.drawable.jul);
		}
		else if(Time_activity.u==7)
		{
			imn.setImageResource(R.drawable.aug);
			}
		else if(Time_activity.u==8)
		{
			imn.setImageResource(R.drawable.sep);
			}
		else if(Time_activity.u==9)
		{
			imn.setImageResource(R.drawable.oct);
				}
		else if(Time_activity.u==10)
		{
			imn.setImageResource(R.drawable.nov);
			}
		else if(Time_activity.u==11)
		{
			imn.setImageResource(R.drawable.dec);
			}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.month, menu);
		return true;
	}

}
