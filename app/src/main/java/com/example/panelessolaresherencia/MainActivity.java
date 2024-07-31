package com.example.panelessolaresherencia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PanelSolar monocristalino = new PanelSolarMonocristalino(20.0);
        PanelSolar policristalino = new PanelSolarPolicristalino(15.0);

        double horasDeSol = 8.0;
        String energiaMonocristalino = monocristalino.generarEnergia(horasDeSol);
        String energiaPolicristalino = policristalino.generarEnergia(horasDeSol);

        TextView textView = findViewById(R.id.textView);

        String resultado = monocristalino.getInfo() + "\n" + energiaMonocristalino + "\n\n" + policristalino.getInfo() + "\n" + energiaMonocristalino;
        textView.setText(resultado);
    }
}