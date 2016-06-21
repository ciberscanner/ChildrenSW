package com.ciberscanner.app.childrensw;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Inicio extends Activity {
	// --------------------------------------------------------------------
	// Variables

	// --------------------------------------------------------------------
	// Constructor
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_inicio);
	}

	// --------------------------------------------------------------------
	//
	public void gotoDenuncia(View v) {
		Intent inicio = new Intent(this, Denuncia.class);
		startActivity(inicio);
	}

	// --------------------------------------------------------------------
	//
	public void gotoPreguntas(View v) {
		Intent inicio = new Intent(this, Preguntas.class);
		startActivity(inicio);
	}

	// --------------------------------------------------------------------
	//
	public void gotoInformacion(View v) {
		Intent inicio = new Intent(this, Informacion.class);
		startActivity(inicio);
	}

	// --------------------------------------------------------------------
	//
	public void gotoRegistro(View v) {
		Intent inicio = new Intent(this, Registro.class);
		startActivity(inicio);
	}

	// --------------------------------------------------------------------
	//
	public void gotoIndicadores(View v) {
		Intent inicio = new Intent(this, Estadisticas.class);
		startActivity(inicio);
	}

}