package com.example.cm2023i;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LayoutIntermedio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_intermedio);
    }

    public void Opcion1(View view)
    {
        Intent intent = new Intent(this, Actividad1.class);
        startActivity(intent);
    }

    public void Opcion2(View view)
    {
        Intent intent = new Intent(this, Almacenamiento1.class);
        startActivity(intent);
    }

    public void Volver(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}