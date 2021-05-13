package com.example.tp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    //Metodo para ir para atras
    public void atras(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}