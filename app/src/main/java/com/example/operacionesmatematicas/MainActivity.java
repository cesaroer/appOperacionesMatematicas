package com.example.operacionesmatematicas;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Declaramos los elementos de las vistas
    EditText primerCampo, segundoCampo;
    TextView etiResultado;

    //Variables globales
    int num1, num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Iniciamos nuestras variables igualandolas a los id que tenemos en el XML
        primerCampo = findViewById(R.id.primerCampo);
        segundoCampo = findViewById(R.id.segundoCampo);
        etiResultado = findViewById(R.id.etiResultado);



    }

    @Override
    public void finishFromChild(Activity child) {
        super.finishFromChild(child);


    }

    //Vamos a usar un metódo para todos los botones solo distiguiendo por su id
    public void onClick(View view) {
        //Pasamos a nuestras variables globales los valores que tengan como texto los texviews
        num1 = Integer.parseInt(primerCampo.getText().toString());
        num2 = Integer.parseInt(segundoCampo.getText().toString());

        switch (view.getId()){
            case R.id.buttonPlus: sumar();
            break;
            case  R.id.buttonMinus: restar();
            break;
            case R.id.buttonMultiply: multiplicar();
            break;
            case R.id.buttonDiv: dividir();
            break;
        }

    }


    public void sumar(){
        int suma = num1 + num2;
        etiResultado.setText("El resultado de la suma es" + suma);
    }
    public void restar(){
        int resta = num1 - num2;
        etiResultado.setText("El resultado de la resta es: " + resta);
    }
    public void multiplicar(){
        int multiplicacion = num1 * num2;
        etiResultado.setText("El resultado de la multiplicacion es: " + multiplicacion);
    }
    public void dividir(){

        //Validamos que els egundo numero no sea 0 o menor

        if (num2 > 0){
            double division = (double) num1 / (double)num2;
            etiResultado.setText("el resultado de la division es: " + division);
        }else{
            //Desplegaremos una advertencia con un Toast
            Toast.makeText(this,"Advertencia",Toast.LENGTH_LONG).show();

            etiResultado.setText("El segundo numero debe ser mayor a 0 para la división");
        }


    }


}
