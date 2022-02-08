package com.example.calculadorasalarial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
      private EditText NomEmpl;
      private EditText HorTra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NomEmpl=(EditText)findViewById(R.id.nom);
        HorTra=(EditText)findViewById(R.id.horas);
    }
    public void calcular(View v){
        String Empl=NomEmpl.getText().toString();
        int horas=Integer.parseInt(HorTra.getText().toString());
        double SalarioDevengado= Math.round((horas * 8.50)*(100.0))/100.0;
        double isss= Math.round((SalarioDevengado*0.02)*(100.0))/100.0;
        double afp= Math.round((SalarioDevengado*0.03)*(100.0))/100.0;
        double renta=Math.round((SalarioDevengado*0.04)*(100.0))/100.0;
        double descuen=Math.round((isss+afp+renta)*(100.0))/100.0;
        double salaneto=Math.round((SalarioDevengado-descuen)*(100.0))/100.0;
        Intent s=new Intent(this, CalculosHechos.class);
        s.putExtra("Nombre", Empl);
        s.putExtra("Isss", String.valueOf(isss));
        s.putExtra("Afp", String.valueOf(afp));
        s.putExtra("Renta", String.valueOf(renta));
        s.putExtra("SalaNeto", String.valueOf(salaneto));
        s.putExtra("SalaDeven", String.valueOf(SalarioDevengado));
        startActivity(s);
    }
}