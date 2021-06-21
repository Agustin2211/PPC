package com.example.ppc_tpfinalcursada_kowalski_fargnoli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

    Button calcular4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    };

        /*
    // Agregar listener al botón

        https://parzibyte.me/blog/2019/02/25/validar-edittext-android-seterror-tooltip/
    calcular4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Quitamos los errores
            etNumero.setError(null);
            String posibleNumero = etNumero.getText().toString();
            // Vemos si está vacío...
            // Notación yoda: https://parzibyte.me/blog/2018/09/24/notacion-yoda-en-programacion/
            if ("".equals(posibleNumero)) {
                // Primer error
                etNumero.setError("Introduce un número");
                // Le damos focus
                etNumero.requestFocus();
                // Y terminamos la ejecución
                return;
            }
            // En caso de que hayan puesto algo, convertimos a entero
            int numero = Integer.parseInt(posibleNumero);
            // Comparar si está en el rango
            if (numero >= 5 && numero <= 60) {
                // La validación termina y hacemos lo que vayamos a hacer
                Toast.makeText(MainActivity.this, "Todo correcto", Toast.LENGTH_SHORT).show();
            } else {
                // Si no, entonces indicamos el error y damos focus
                etNumero.setError("Número fuera de rango");
                etNumero.requestFocus();
            }
        }
    })}; */

    public void Atras (View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}