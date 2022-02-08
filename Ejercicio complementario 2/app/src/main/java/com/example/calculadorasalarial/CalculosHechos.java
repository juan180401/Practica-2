package com.example.calculadorasalarial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CalculosHechos extends AppCompatActivity {
    private TextView empleadofinal;
    private TextView sadev;
    private TextView is;
    private TextView af;
    private TextView ren;
    private TextView satotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculos_hechos);
        empleadofinal=(TextView)findViewById(R.id.Empleado);
        sadev=(TextView)findViewById(R.id.Devengado);
        is=(TextView)findViewById(R.id.isss1);
        af=(TextView)findViewById(R.id.afp1);
        ren=(TextView)findViewById(R.id.renta1);
        satotal=(TextView)findViewById(R.id.salaneto1);

        Bundle bundle = getIntent().getExtras();
        String noem=bundle.getString("Nombre");
        String sade=bundle.getString("SalaDeven");
        String iseg=bundle.getString("Isss");
        String ap=bundle.getString("Afp");
        String re=bundle.getString("Renta");
        String sn=bundle.getString("SalaNeto");

        empleadofinal.setText(noem);
        sadev.setText(sade);
        is.setText(iseg);
        af.setText(ap);
        ren.setText(re);
        satotal.setText(sn);
    }



    public void otravez(View s){
        Intent ss=new Intent(this, MainActivity.class);
        startActivity(ss);
    }
}