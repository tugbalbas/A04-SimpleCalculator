package com.tugbaalbas.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //global tanımlamalarımızı yapıyoruz
    EditText number1Text;
    EditText number2Text;
    TextView resultText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1Text = findViewById(R.id.number1Text);
        number2Text = findViewById(R.id.number2Text);
        resultText = findViewById(R.id.resultText);
    }

    //onClick methodlarımızı buraya yazıyoruz

    public void sum(View view){
        //kullanıcının yazdığı şeyi almak için;
        //String myString = number1Text.getText().toString(); // Integera çevir ->

        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {
            resultText.setText("Enter Number!");
        }else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 + number2;

            resultText.setText("Result: " + result); // Stringe çeviriyoruz bunu da. onun için de Result yazdık başına. başında string olunca direkt stringe çeviriyor
        }
    }

    public void deduct(View view){
        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {
            resultText.setText("Enter Number!");
        }else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 - number2;

            resultText.setText("Result: " + result); // Stringe çeviriyoruz bunu da. onun için de Result yazdık başına. başında string olunca direkt stringe çeviriyor
        }
    }

    public void multiply(View view){
        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {
            resultText.setText("Enter Number!");
        }else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 * number2;

            resultText.setText("Result: " + result); // Stringe çeviriyoruz bunu da. onun için de Result yazdık başına. başında string olunca direkt stringe çeviriyor
        }
    }

    public void divide(View view){
        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {
            resultText.setText("Enter Number!");
        }else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 / number2;

            resultText.setText("Result: " + result); // Stringe çeviriyoruz bunu da. onun için de Result yazdık başına. başında string olunca direkt stringe çeviriyor
        }
    }

}