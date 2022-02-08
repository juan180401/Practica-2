package com.example.ejercicio1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.util.Log;


public class MainActivity extends AppCompatActivity {
    private TextView contador;
    private int cuenta=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contador = findViewById(R.id.contador);

    }



    public void sumar(View view) {
        //captura valor del txtView que en ese momento es 0
        String con = contador.getText().toString();
        //lo convierte a numero
        int cont = Integer.parseInt(con);
        if (cont <= 8) {
            cuenta = cuenta + 1;
            contador.setText(String.valueOf(cuenta));
        }
        //al llegar al numero 9 se reinicia el contador
        else if (cont == 9) {
            cuenta = 0;
            contador.setText(String.valueOf(cuenta));
        }
    }
          @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("resul", cuenta);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        cuenta = savedInstanceState.getInt("resul");
        contador.setText(String.valueOf(cuenta));
    }
}

