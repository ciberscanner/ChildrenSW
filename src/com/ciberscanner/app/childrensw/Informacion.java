package com.ciberscanner.app.childrensw;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Informacion extends Activity {
	// --------------------------------------------------------------------
	// Variables
	private TextView titulo;

	
	// --------------------------------------------------------------------
	// Constructor
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_informacion);
		
		titulo=(TextView)findViewById(R.id.txt_title);
		titulo.setText("Acerca de");
	}

	// --------------------------------------------------------------------
		//
		public void back(View v) {
			finish();
		}
}
