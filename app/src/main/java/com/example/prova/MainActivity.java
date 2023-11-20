package com.example.prova;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText number1;
    private EditText number2;
    private TextView txtResult;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.Numero1);
        number2 = findViewById(R.id.Numero2);
        txtResult = findViewById(R.id.Risultato);



        final Button buttonSomma = findViewById(R.id.BottoneSomma);
        buttonSomma.setOnClickListener(v -> {
            // Code here executes on main thread after user presses button
            String strNum1 = number1.getText().toString();
            String strNum2 = number2.getText().toString();
            int n1 = Integer.parseInt(strNum1);
            int n2 = Integer.parseInt(strNum2);
            int res = n1 + n2;
            String strStr = String.valueOf(res);
            txtResult.setText(strStr);
        });

        final Button buttonDifferenza = findViewById(R.id.BottoneDifferenza);
        buttonDifferenza.setOnClickListener(v -> {
            // Code here executes on main thread after user presses button
            String strNum1 = number1.getText().toString();
            String strNum2 = number2.getText().toString();
            int n1 = Integer.parseInt(strNum1);
            int n2 = Integer.parseInt(strNum2);
            int res = n1 - n2;
            String strStr = String.valueOf(res);
            txtResult.setText(strStr);
        });

        final Button buttonMoltiplicazione = findViewById(R.id.BottoneMoltiplicazione);
        buttonMoltiplicazione.setOnClickListener(v -> {
            // Code here executes on main thread after user presses button
            String strNum1 = number1.getText().toString();
            String strNum2 = number2.getText().toString();
            int n1 = Integer.parseInt(strNum1);
            int n2 = Integer.parseInt(strNum2);
            int res = n1 * n2;
            String strStr = String.valueOf(res);
            txtResult.setText(strStr);
        });

        final Button buttonDivisione = findViewById(R.id.BottoneDivisione);
        buttonDivisione.setOnClickListener(v -> {
            // Code here executes on main thread after user presses button
            String strNum1 = number1.getText().toString();
            String strNum2 = number2.getText().toString();
            int n1 = Integer.parseInt(strNum1);
            int n2 = Integer.parseInt(strNum2);
            int res = n1 / n2;
            String strStr = String.valueOf(res);
            txtResult.setText(strStr);
        });
    }

}