package com.example.ppc_tpfinalcursada_kowalski_fargnoli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void Calcular (View view){
        Intent i = new Intent(this, MainActivity4.class);
        startActivity(i);
    }

    public void Atras (View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}