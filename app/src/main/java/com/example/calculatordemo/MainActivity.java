package com.example.calculatordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstNumber, secondNumber;
    TextView answer;

    Button plus;
    double num1,num2, result;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNumber = (EditText) findViewById(R.id.firstNumber);
        secondNumber= (EditText) findViewById(R.id.secondNumber);


        plus = (Button) findViewById(R.id.button1);


        TextView answer = findViewById(R.id.answer);

       plus.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

              num1= new Double(firstNumber.getText().toString());

              num2= new Double(secondNumber.getText().toString());

               result = num1+num2;

                answer.setText(Double.toString(result));
           }
       });







    }
}