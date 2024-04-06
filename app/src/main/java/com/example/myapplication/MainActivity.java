package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.StringCharacterIterator;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {
    private EditText nombre;
    private EditText apellido;
    private EditText cc;
    private TextView resultado;
    private TextView resultado2;
    private TextView resultado3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = findViewById(R.id.resultado2);
        apellido = findViewById(R.id.apellido);
        cc = findViewById(R.id.CC);
        Button consulta = findViewById(R.id.consultar);
        consulta.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
               int  consulta = Integer.parseInt(nombre.getText().toString()) ;
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
}
    }
