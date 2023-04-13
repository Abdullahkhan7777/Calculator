package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.tools.jsc.Main;

public class MainActivity extends AppCompatActivity {

    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9 , btn_0, btn_00;
    Button btn_ac, btn_nighttoday, btn_module, btn_divide, btn_multiply, btn_plus, btn_minus, btn_equal, btn_dot;
    TextView input, output;
    String data;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_1 = findViewById(R.id.btn_12);
        btn_2 = findViewById(R.id.btn_22);
        btn_3 = findViewById(R.id.btn_32);
        btn_4 = findViewById(R.id.btn_42);
        btn_5 = findViewById(R.id.btn_52);
        btn_6 = findViewById(R.id.btn_62);
        btn_7 = findViewById(R.id.btn_72);
        btn_8 = findViewById(R.id.btn_82);
        btn_9 = findViewById(R.id.btn_92);
        btn_0 = findViewById(R.id.btn_02);
        btn_00 = findViewById(R.id.btn_002);


        btn_ac = findViewById(R.id.btn_ac2);
        btn_nighttoday = findViewById(R.id.btn_day);
        btn_module = findViewById(R.id.btn_module2);
        btn_divide = findViewById(R.id.btn_divide2);
        btn_multiply = findViewById(R.id.btn_multiply2);
        btn_plus = findViewById(R.id.btn_plus2);
        btn_minus = findViewById(R.id.btn_minus2);
        btn_equal = findViewById(R.id.btn_equal2);
        btn_dot = findViewById(R.id.btn_dot2);

        input = findViewById(R.id.inputText);
        output = findViewById(R.id.outputText);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                data = input.getText().toString();
                input.setText(data + "1");
            }
        });btn_2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                data = input.getText().toString();
                input.setText(data + "2");
            }
        });btn_3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                data = input.getText().toString();
                input.setText(data + "3");
            }
        });btn_4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                data = input.getText().toString();
                input.setText(data + "4");
            }
        });btn_5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                data = input.getText().toString();
                input.setText(data + "5");
            }
        });btn_6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                data = input.getText().toString();
                input.setText(data + "6");
            }
        });btn_7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                data = input.getText().toString();
                input.setText(data + "7");
            }
        });btn_8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                data = input.getText().toString();
                input.setText(data + "8");
            }
        });btn_9.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                data = input.getText().toString();
                input.setText(data + "9");
            }
        });btn_0.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                data = input.getText().toString();
                input.setText(data + "0");
            }
        });btn_00.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                data = input.getText().toString();
                input.setText(data + "00");
            }
        });btn_module.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                data = input.getText().toString();
                input.setText(data + "%");
            }
        });btn_divide.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                data = input.getText().toString();
                input.setText(data + "÷");
            }
        });btn_multiply.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                data = input.getText().toString();
                input.setText(data + "x");
            }
        });btn_plus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                data = input.getText().toString();
                input.setText(data + "+");
            }
        });btn_minus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                data = input.getText().toString();
                input.setText(data + "-");
            }
        });btn_dot.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                data = input.getText().toString();
                input.setText(data + ".");
            }
        });
        btn_ac.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                input.setText("");
                output.setText("");
            }
        });
        btn_nighttoday.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, dayMode.class);
                startActivity(intent);
            }
        });

        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = input.getText().toString();

                data = data.replaceAll("x","*");
                data = data.replaceAll("%", "/100");
                data = data.replaceAll("÷", "/");

                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);

                String finalresult;

                Scriptable scriptable = rhino.initStandardObjects();
                finalresult = rhino.evaluateString(scriptable, data, "Javascript", 1, null).toString();

                output.setText(finalresult);
            }
        });

    }

}
