package com.example.enumtest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	private Button btButton;

	private enum MONTH{
		JAN, FEB, MAR, APR, MAY, JUN, JUL, SEP, OCT, NOV, DEC;
	}

	//enum �� class ����,�� ���Ϊһ����, ֻ�������Ƚ��ر�һ��.
	private enum Color { 
		RED("��ɫ"), GREEN("��ɫ"), BLUE("��ɫ"), YELLOW("��ɫ"), BLACK("��ɫ"), WHITE("��ɫ"); 
		private final String desc; 

		private Color(String desc) { 
			this.desc = desc; 
		} 

		public String getDesc() { 
			return desc; 
		} 
	} 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btButton = (Button)findViewById(R.id.bt);

		MONTH _month = MONTH.JAN;

		Log.e("", "in create "+_month);

		btButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				for(MONTH mont : MONTH.values())
				{
					Log.e("", ""+mont);
				}
				
				
				for(Color cl : Color.values())
				{
					Log.e("", cl.getDesc());
				}
			}
		});

	}
}
