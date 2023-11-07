package com.example.prova;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
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


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int risultato = 0;

        number1 = (EditText) findViewById(R.id.Numero1);
        number2 = (EditText) findViewById(R.id.Numero2);
        txtResult = (TextView) findViewById(R.id.Risultato);



        final Button button = findViewById(R.id.BottoneSomma);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                String strNum1 = number1.getText().toString();
                String strNum2 = number2.getText().toString();
                int n1 = Integer.parseInt(strNum1);
                int n2 = Integer.parseInt(strNum2);
                int res = n1 + n2;
                String strStr = String.valueOf(res);
                txtResult.setText(strStr);
            }
        });

    }

}