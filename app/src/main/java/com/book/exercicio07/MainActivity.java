package com.book.exercicio07;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText vara;
    private EditText varb;
    private EditText varc;
    private TextView resultado;
    double delta, x1, x2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vara             = findViewById(R.id.valorA);
        varb             = findViewById(R.id.valorB);
        varc             = findViewById(R.id.valorC);
        resultado = findViewById(R.id.calculoResultado);
    }

    public void calculo(View v){

        String var001 = vara.getText().toString();
        String var002 = varb.getText().toString();
        String var003 = varc.getText().toString();

        double a = Double.parseDouble(var001);
        double b = Double.parseDouble(var001);
        double c = Double.parseDouble(var001);



        delta = (b * b) - (-4 * (a * c));

        if (delta >= 0){
            x1 = ((-(b) + Math.sqrt(delta)) / 2 * a);
            x2 = ((-(b) - Math.sqrt(delta)) / 2 * a);
            resultado.setText("x1 = " + x1 + " " + "x2 = " + x2);
        } else {
            resultado.setText("Delta não possui raiz!");
        }

    }

}
