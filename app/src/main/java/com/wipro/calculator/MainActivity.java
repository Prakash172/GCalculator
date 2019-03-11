package com.wipro.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText num1, num2;
    Button add, multiply, divide, subtract;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.fno);
        num2 = findViewById(R.id.sno);
        display = findViewById(R.id.display);
        add = findViewById(R.id.add);
        subtract = findViewById(R.id.subtract);
        divide = findViewById(R.id.divide);
        multiply = findViewById(R.id.multiply);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add();
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtract();
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                divide();
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multiply();
            }
        });

    }

    public void add()
    {
        if (!TextUtils.isEmpty(num1.getText()) && !TextUtils.isEmpty(num2.getText())) {
            double a = Double.parseDouble(num1.getText().toString());
            double b = Double.parseDouble(num2.getText().toString());
            display.setText(String.valueOf(a + b));
        } else Toast.makeText(this, "Please enter some number", Toast.LENGTH_SHORT).show();
    }
    public void subtract()
    {
        if (!TextUtils.isEmpty(num1.getText()) && !TextUtils.isEmpty(num2.getText())) {
            double a = Double.parseDouble(num1.getText().toString());
            double b = Double.parseDouble(num2.getText().toString());
            display.setText(String.valueOf(a - b));
        } else Toast.makeText(this, "Please enter some number", Toast.LENGTH_SHORT).show();
    }

    public void divide()
    {
        if (!TextUtils.isEmpty(num1.getText()) && !TextUtils.isEmpty(num2.getText())) {
            double a = Double.parseDouble(num1.getText().toString());
            double b = Double.parseDouble(num2.getText().toString());
            display.setText(String.valueOf(a / b));
        } else Toast.makeText(this, "Please enter some number", Toast.LENGTH_SHORT).show();
    }

    public void multiply()
    {
        if (!TextUtils.isEmpty(num1.getText()) && !TextUtils.isEmpty(num2.getText())) {
            double a = Double.parseDouble(num1.getText().toString());
            double b = Double.parseDouble(num2.getText().toString());
            display.setText(String.valueOf(a * b));
        } else Toast.makeText(this, "Please enter some number", Toast.LENGTH_SHORT).show();
    }

}
