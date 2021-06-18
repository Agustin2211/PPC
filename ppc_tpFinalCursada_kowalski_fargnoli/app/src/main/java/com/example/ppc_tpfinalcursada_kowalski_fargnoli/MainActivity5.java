package com.example.ppc_tpfinalcursada_kowalski_fargnoli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }

    public void Atras (View view){
        Intent i = new Intent(this, MainActivity4.class);
        startActivity(i);
    }
}