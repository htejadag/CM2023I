package com.example.cm2023i;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Actividad1 extends AppCompatActivity {

    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);

        et1 = findViewById(R.id.txt2_1_1);
    }

    public void Siguiente(View view)
    {
        Intent intent = new Intent(this, Actividad2.class);
        intent.putExtra("dato", et1.getText().toString());
        startActivity(intent);
    }

    public void Volver(View view)
    {
        Intent intent = new Intent(this, LayoutIntermedio.class);
        startActivity(intent);
    }
}