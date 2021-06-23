package com.example.ppc_tpfinalcursada_kowalski_fargnoli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity4 extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    RadioButton SI;
    RadioButton NO;

    Boolean buleano;

    /* NO SIRVE
    EditText paciente;
    EditText riesgoRecurrente;
    int riesgoRecurrenteInt;
    EditText riesgoProgreso;
    */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        RadioGroup SIoNO = findViewById(R.id.radioGroup);
        SI = findViewById(R.id.si);
        NO = findViewById(R.id.no);

        SIoNO.setOnCheckedChangeListener(this);

        Button atras = findViewById(R.id.atras4);
        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), MainActivity.class);
                startActivity(i);
            }
        });

        EditText editText = findViewById(R.id.riesgoRecurrente);
        editText.setFilters(new InputFilter[]{ new InputFilterMinMax("1" , "10")});

        EditText editText1 = findViewById(R.id.riesgoProgeso);
        editText1.setFilters(new InputFilter[]{ new InputFilterMinMax("1" , "10")});

        //NO SIRVE
        /*
        paciente = findViewById(R.id.editTextTextPersonName);
        riesgoRecurrente = findViewById(R.id.riesgoRecurrente);
        riesgoRecurrenteInt = Integer.valueOf(riesgoRecurrente.getText().toString());


        riesgoProgreso = findViewById(R.id.riesgoProgeso);
        */


    }

    public void onCheckedChanged(RadioGroup arg0, int arg1){
        if (SI.isChecked()){
            buleano = Boolean.TRUE;
        }else{
            buleano = Boolean.FALSE;
        }
    }


    //NO SIRVE
    /*
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("riesgoRecurrente", riesgoRecurrenteInt);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        riesgoRecurrenteInt = savedInstanceState.getInt("riesgoRecurrente");
        riesgoRecurrente.setText(String.valueOf(riesgoRecurrenteInt));
    }
    */
}