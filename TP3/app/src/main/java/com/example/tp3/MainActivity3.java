package com.example.tp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class MainActivity3 extends AppCompatActivity {

    private Button boton1, boton2, boton3, boton4, boton5, boton6;

    private ImageView imagen1, imagen2, imagen3, imagen4, imagen5, imagen6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //Botones e Imagenes Para Compartir

        boton1 = findViewById(R.id.button);
        imagen1 = findViewById(R.id.imageView);
        imagen1.buildDrawingCache();
        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.unnamed);

        boton2 = findViewById(R.id.button2);
        imagen2 = findViewById(R.id.imageView2);
        boton3 = findViewById(R.id.button3);
        imagen3 = findViewById(R.id.imageView3);
        boton4 = findViewById(R.id.button4);
        imagen4 = findViewById(R.id.imageView4);
        boton5 = findViewById(R.id.button5);
        imagen5 = findViewById(R.id.imageView5);
        boton6 = findViewById(R.id.button6);
        imagen6 = findViewById(R.id.imageView6);

        //Acciones para compartir

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   ByteArrayOutputStream bytes = new ByteArrayOutputStream();
                   bitmap1.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
                   File f = new File( Environment.getExternalStorageDirectory() + File.separator + "tmp" + File.separator + "unnamed.jpg");
                   try {
                           f.createNewFile();
                           FileOutputStream fo = new FileOutputStream(f);
                           fo.write(bytes.toByteArray());
                       } catch (Exception e) {
                           e.printStackTrace();
                    }

                //compartir imagen
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("image/jpeg");
                share.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(f));
                startActivity(Intent.createChooser(share, "Compartir Imagen"));

            }
        });
    }


    //Metodo para ir para atras
    public void atras(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        }
}
