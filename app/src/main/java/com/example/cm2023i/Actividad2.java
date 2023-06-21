package com.example.cm2023i;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Actividad2 extends AppCompatActivity {

    EditText et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        et2 = findViewById(R.id.txt2_1_2);
        String dd = getIntent().getStringExtra("dato");
        et2.setText(dd);
    }

    public void Regresar(View view)
    {
        Intent intent = new Intent(this, Actividad1.class);
        startActivity(intent);
    }
}