package com.example.cm2023i;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TextoBasico1 extends AppCompatActivity {

    // Declarar los controles a utilizar
    EditText txt1, txt2, txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_texto_basico1);

        // Setear los controles a sus respectivas variables
        txt1 = findViewById(R.id.txt1_1_1);
        txt2 = findViewById(R.id.txt1_1_2);
        txt3 = findViewById(R.id.txt1_1_3);
    }


    public void Mostrar(View view)
    {
        String msg = txt1.getText() + " - " + txt2.getText() + " - " + txt3.getText();
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}