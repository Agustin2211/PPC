package com.example.tp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textViewResultados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textViewResultados = findViewById(R.id.textView);
        textViewResultados.setMovementMethod(new ScrollingMovementMethod());

    }

    //Metodo para ir para atras
    public void atras(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}