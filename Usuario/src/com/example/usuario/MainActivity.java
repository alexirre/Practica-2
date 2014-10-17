package com.example.usuario;



import com.example.calcu.R;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	
	private EditText usuario;
	private EditText password;
	private TextView ingreso;
	
	private Button entrar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		this.usuario = (EditText) findViewById(R.id.usuario);
		this.password = (EditText) findViewById(R.id.pass);
		this.ingreso = (TextView) findViewById(R.id.ingresar);
		this.entrar = (Button) findViewById(R.id.login);
		
		
		
	}

	
	public void btnLoginOnClick(View v){
	    if(usuario.getText().toString()==("root") && password.getText().toString()==("moviles")){
	    	this.ingreso.setText("Usuario y Contraseña correctas");
	    }else{
	    	this.ingreso.setText("Usuario y Contraseña incorrectas");
	    }
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
