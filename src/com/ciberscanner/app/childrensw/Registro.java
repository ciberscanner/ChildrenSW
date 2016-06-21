package com.ciberscanner.app.childrensw;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Registro extends Activity {
	// --------------------------------------------------------------------
	// Variables
	private TextView titulo;

	
	// --------------------------------------------------------------------
	// Constructor
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_registro);
		
		titulo=(TextView)findViewById(R.id.txt_title);
		titulo.setText("Registro");
	}

	// --------------------------------------------------------------------
		//
		public void back(View v) {
			finish();
		}
}
