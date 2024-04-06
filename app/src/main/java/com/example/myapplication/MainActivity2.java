package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    private TextView resultado2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        int resultado = getIntent().getIntExtra("resultado", 0);
        resultado2 = findViewById(R.id.resultado2);
        resultado2.setText("Nombre: " + resultado);
    }



    public void volver(View view){
        Intent c=new Intent(this, MainActivity.class);
        startActivity(c);
    }




}




