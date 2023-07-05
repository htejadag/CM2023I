package com.example.cm2023i;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Almacenamiento1 extends AppCompatActivity {

    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almacenamiento1);

        et1 = findViewById(R.id.txt2_2_1);

        SharedPreferences sp = getSharedPreferences("prueba", Context.MODE_PRIVATE);
        et1.setText(sp.getString("nombre", ""));
    }

    public void Guardar(View view)
    {
        SharedPreferences sp = getSharedPreferences("prueba", Context.MODE_PRIVATE);
        SharedPreferences.Editor objEditor = sp.edit();
        objEditor.putString("nombre", et1.getText().toString());
        objEditor.apply(); // commit();
        //finish();
        Toast.makeText(this, "Se guardó correctamente", Toast.LENGTH_SHORT).show();
    }

    public void Mostrar(View view)
    {
        // Pensaba usarlo pero ya no
    }

    public void Volver(View view)
    {
        Intent intent = new Intent(this, LayoutIntermedio.class);
        startActivity(intent);
    }
}