package com.example.widget2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    // declaro datos ...
    private ProgressBar barra;
    private CheckBox calificaciones, productos;
    private TextView texto;
    private int progreso; // el progreso de mi barra

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        barra = (ProgressBar)findViewById(R.id.pb);
        calificaciones =(CheckBox)findViewById(R.id.ch1);
        productos = (CheckBox)findViewById(R.id.ch2);
        texto = (TextView)findViewById(R.id.tv);

    }
    // Rellenar el ProgressBar
    public void Charge(View view)
    {
        final Timer t = new Timer(); // Creo un temporizador.
        TimerTask tarea = new TimerTask() // Creo mi tarea.
        {
            @Override
            public void run() // Proceso que voy a ejecutar
                    // Rellena la barra de progreso
            {
                progreso++;
                barra.setProgress(progreso); // rellenamos la barra;

            }
        };
        t.schedule(tarea, 0, 100);
    }
    public void Menu(View view)
    {
        if(calificaciones.isChecked() && productos.isChecked())
        {
            texto.setText("Seleccione una sola opcion");
        }
        else
        {
            if(calificaciones.isChecked())
            {
                // abre la activity de calificaciones
                Intent i = new Intent(this, calificaciones_act.class);
                startActivity(i); // inicia la actividad
            }
            if(productos.isChecked())
            {
                // abres productos...
                Intent i = new Intent(this, Productos_act.class);
                startActivity(i);
            }
        }
    }
}