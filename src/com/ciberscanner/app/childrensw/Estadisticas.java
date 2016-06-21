package com.ciberscanner.app.childrensw;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Estadisticas extends Activity {
	// --------------------------------------------------------------------
	// Variables
	private TextView titulo;

	// --------------------------------------------------------------------
	// Constructor
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_estadistica);

		titulo = (TextView) findViewById(R.id.txt_title);
		titulo.setText("Estadisticas");
	}

	// --------------------------------------------------------------------
	//

	public void back(View v) {
		finish();
	}

	// --------------------------------------------------------------------
	//
	public void gotoMapa(View v) {
		Intent inicio = new Intent(this, Mapa.class);
		startActivity(inicio);
	}
	// --------------------------------------------------------------------
	//

}