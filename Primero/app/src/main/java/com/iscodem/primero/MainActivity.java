package com.iscodem.primero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.iscodem.primero.model.Persona;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Para LOG";
    EditText _edtNombres, _edtApellidos, _edtEdad;
    TextView _tvPregunta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _edtNombres = (EditText) findViewById(R.id.edtNombres);
        _edtApellidos = (EditText) findViewById(R.id.edtApellidos);
        _edtEdad = (EditText) findViewById(R.id.edtEdad);
        _tvPregunta = (TextView) findViewById(R.id.tvPregunta);
    }

    public void mensaje(View v){
        Persona persona = new Persona();

        persona.setNombres(_edtNombres.getText().toString());
        persona.setApellidos(_edtApellidos.getText().toString());
        persona.setEdad(Integer.parseInt(_edtEdad.getText().toString()));

        Log.i(TAG, "El primer log: "+persona.getEdad());
        Toast.makeText(this, "Bienvenidos al curso de Android." + persona.getNombres(), Toast.LENGTH_SHORT).show();
    }
}
