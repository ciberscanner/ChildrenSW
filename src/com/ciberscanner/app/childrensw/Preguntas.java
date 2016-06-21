package com.ciberscanner.app.childrensw;

import java.util.ArrayList;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class Preguntas extends Activity {
	// --------------------------------------------------------------------
	// Variables
	private TextView titulo;
	private Context ctx;

	private ArrayList<Question> listq = new ArrayList<Question>();

	private ListView listView;

	// --------------------------------------------------------------------
	// Constructor
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_preguntas);
		ctx = this;

		titulo = (TextView) findViewById(R.id.txt_title);
		titulo.setText("Preguntas");

		listView = (ListView) findViewById(R.id.listView1);

		setLista();
		
	}

	// --------------------------------------------------------------------
	//
	public void back(View v) {
		finish();
	}

	// --------------------------------------------------------------------
	//
	private void setLista() {
		Question uno = new Question("¿Quién es un Niño?",
				"El Artículo 1 de la Convención de las Naciones Unidas sobre los Derechos del Niño define al niño como «todo ser humano menor de dieciocho años de edad, salvo que, en virtud de la ley que le sea aplicable, haya alcanzado antes la mayoría de edad».");
		Question dos = new Question("¿Qué es la Explotación Sexual Comercial de Niños, Niñas y Adolescentes?",
				"Comprende el abuso sexual por parte de un adulto y una remuneración en metálico o en especie para el niño o para un tercero o terceros. El niño es tratado como objeto sexual y como mercancía. La explotación sexual comercial de niños, niñas y adolescentes constituye una forma de coerción y de violencia contra los niños, que puede equipararse al trabajo forzoso y a una forma contemporánea de esclavitud");
		Question tres = new Question("Prostitución infantil",
				"La prostitución infantil tiene lugar cuando alguien se beneficia con una transacción comercial en la que un niño, niña o adolescente es ofrecido con fines sexuales. Es posible que los niños sean controlados por un intermediario que se ocupa de la transacción o la supervisa, o por un explotador que negocia directamente con el niño. Los niños también se ven involucrados en la prostitución cuando tienen relaciones sexuales a fin de cubrir sus necesidades básicas como comida, refugio o seguridad, o a cambio de favores tales como calificaciones más altas en la escuela o dinero extra para comprar bienes de consumo. Estos actos pueden ocurrir en lugares muy diferentes, como burdeles, bares, clubes, casas, hoteles o en la calle.");
		Question cuatro = new Question("Turismo Sexual con Niños, Niñas y Adolescentes",
				"El turismo sexual con niños es la explotación sexual comercial de niños por parte de personas que viajan de un lugar a otro y allí se involucran en actos sexuales con menores. A menudo estas personas viajan de un país más rico a otro menos desarrollado, pero los turistas sexuales también pueden ser personas que viajan dentro de su país o región. Los turistas sexuales que abusan de los niños son muy heterogéneos: pueden ser casados o solteros, varones o mujeres, turistas adinerados o con poco presupuesto. Los turistas sexuales pueden ser extranjeros o personas que viajan dentro de su propio país. Algunos turistas sexuales que abusan de niños (agresores preferenciales y pederastas) buscan niños específicamente; no obstante, la mayoría son agresores ocasionales que no necesariamente prefieren a los niños para sus actividades sexuales sino que aprovechan una situación en la que los menores quedan a su disposición.");
		Question cinco = new Question(
				"Código de Conducta para la Protección de los Niños contra la Explotación Sexual Comercial en el Turismo",
				"El Código de Conducta fue iniciado por ECPAT Suecia en 1998 en cooperación con operadores turísticos escandinavos y la Organización Mundial del Turismo (OMT). El Código urge a las empresas que lo adoptan a comprometerse a: \n1. Establecer una política corporativa ética contra la explotación sexual de losniños;\n2. Educar y capacitar al personal tanto en el país de origen como en losdestinos turísticos;\n3. Introducir una cláusula en los contratos con los proveedores que estipule elcomún rechazo de la explotación sexual comercial de los niños;\n4. Desarrollar materiales informativos y de concientización tales comocatálogos, folletos, pósters, vídeos en los vuelos, etiquetas en los billetes,páginas web de inicio, etc.;\n5. Proporcionar información a «personas clave» de los destinos turísticos;\n6. Informar en forma anual sobre la implementación de estos criterios.");
		Question seis = new Question("¿De qué Manera Afecta a los Niños la Explotación Sexual Comercial?",
				"La explotación sexual comercial, en todas sus formas, compromete seriamente el derecho del niño a disfrutar de su infancia y de su juventud, así como también su posibilidad de llevar una vida digna, productiva y gratificante. Puede tener consecuencias graves, duraderas y hasta potencialmente fatales para el bienestar y el desarrollo físico, psicológico, espiritual, emocional y social del niño.");

		listq.add(uno);
		listq.add(dos);
		listq.add(tres);
		listq.add(cuatro);
		listq.add(cinco);
		listq.add(seis);
				
		setList( new String[] {uno.getName(), dos.getName(), tres.getName(), cuatro.getName(),cinco.getName(),seis.getName()});
	}

	// --------------------------------------------------------------------
		//
	private void setList(String[] values) {

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
				android.R.id.text1, values);

		
		listView.setAdapter(adapter);

		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

				dialog(listq.get(position).getDescription());

			}

		});
	}

	// --------------------------------------------------------------------
	//
	private void dialog(String ms) {
		final Dialog dialog = new Dialog(ctx); 
		dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
		dialog.getWindow().setBackgroundDrawable(null);
		dialog.setContentView(R.layout.message);
		//dialog.setTitle("Title...");
		

		TextView text = (TextView) dialog.findViewById(R.id.m_description);
		text.setText(ms);

		TextView dialogButton = (TextView) dialog.findViewById(R.id.dialogButtonOK);

		dialogButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				dialog.dismiss();
			}
		});

		dialog.show();
	}

}