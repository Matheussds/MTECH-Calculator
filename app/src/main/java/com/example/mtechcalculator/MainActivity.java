package com.example.mtechcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double num1,num2,res;
    EditText et_valor1;
    EditText et_valor2;
    TextView tv_resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button btn_somar=findViewById(R.id.btn_soma);
//        Button btn_subtrair=findViewById(R.id.btn_subtrai);
//        Button btn_multiplicar=findViewById(R.id.btn_multiplica);
//        Button btn_dividir=findViewById(R.id.btn_divide);

        et_valor1 = (EditText)findViewById(R.id.et_valor1);
        et_valor2 = (EditText)findViewById(R.id.et_valor2);
        tv_resultado = (TextView)findViewById(R.id.tv_resultado);

    }

    public void somar(View view) {
        num1=Double.parseDouble(et_valor1.getText().toString());
        num2=Double.parseDouble(et_valor2.getText().toString());
        res=num1+num2;
        tv_resultado.setText(String.valueOf(res));
    }

    public void subtrair(View view) {
        num1=Double.parseDouble(et_valor1.getText().toString());
        num2=Double.parseDouble(et_valor2.getText().toString());
        res=num1-num2;
        tv_resultado.setText(String.valueOf(res));
    }

    public void multiplicar(View view) {
        num1=Double.parseDouble(et_valor1.getText().toString());
        num2=Double.parseDouble(et_valor2.getText().toString());
        res=num1*num2;
        tv_resultado.setText(String.valueOf(res));
    }

    public void dividir(View view) {
        num1=Double.parseDouble(et_valor1.getText().toString());
        num2=Double.parseDouble(et_valor2.getText().toString());
        res=num1/num2;
        tv_resultado.setText(String.valueOf(res));
    }

}