package com.example.widget2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class calificaciones_act extends AppCompatActivity {
    private RatingBar calificacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calificaciones);
        calificacion = (RatingBar)findViewById(R.id.rt);
    }
    public void Calificar1(View view)
    {
        calificacion.setNumStars(6); // Cambiar numeros de estrellas
        calificacion.setRating(5);
        float rat = calificacion.getRating();

    }
}