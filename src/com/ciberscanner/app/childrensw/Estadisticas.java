package com.ciberscanner.app.childrensw;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Estadisticas extends Activity {
	// --------------------------------------------------------------------
	// Variables
	private TextView titulo;
	private ConstrolUser cu;

	// --------------------------------------------------------------------
	// Constructor
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_estadistica);

		titulo = (TextView) findViewById(R.id.txt_title);
		titulo.setText("Estadisticas");
		cu = new ConstrolUser(this);

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

	// --------------------------------------------------------------------
	//
	public void gotoCuenta() {

		if (!cu.getUsuario().getEmail().isEmpty()) {
			Intent inicio = new Intent(this, Cuenta.class);
			startActivity(inicio);
		} else {
			Toast.makeText(getApplicationContext(), "Solo usuarios registrados pueden entrar a esta sección",
					Toast.LENGTH_LONG).show();
		}

	}

}