package com.example.prova;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.QuickContactBadge;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnCalcola;
    private EditText number1;
    private EditText number2;
    private TextView txtResult;
    private Button evento;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int risultato = 0;

        number1 = (EditText) findViewById(R.id.Numero1);
        number2 = (EditText) findViewById(R.id.Numero2);
        txtResult =

        final Button button = findViewById(R.id.BottoneSomma);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button

            }
        });

    }

}