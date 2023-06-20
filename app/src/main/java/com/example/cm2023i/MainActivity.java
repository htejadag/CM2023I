package com.example.cm2023i;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ControlesBasicos(View view)
    {
        Intent intent = new Intent(this, LayoutBasico.class);
        startActivity(intent);
    }

    public void ControlesIntermedios(View view)
    {

    }

    public void ControlesAvanzados(View view)
    {

    }
}