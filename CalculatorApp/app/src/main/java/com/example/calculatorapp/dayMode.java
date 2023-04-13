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

public class dayMode extends AppCompatActivity {

    Button btn_1, btn_2, btn_3, btn_4,btn_5, btn_6, btn_7, btn_8, btn_9, btn_0, btn_00;
    Button btn_ac, btn_day, btn_module, btn_divide, btn_multiply, btn_minus, btn_plus, btn_equal, btn_dot;

    String store;

    TextView input, output;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_mode);

        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_0 = findViewById(R.id.btn_0);
        btn_00 = findViewById(R.id.btn_00);

        btn_ac = findViewById(R.id.btn_ac);
        btn_day = findViewById(R.id.btn_night);
        btn_module = findViewById(R.id.btn_module);
        btn_divide = findViewById(R.id.btn_divide);
        btn_multiply = findViewById(R.id.btn_multiply);
        btn_minus = findViewById(R.id.btn_minus);
        btn_plus = findViewById(R.id.btn_plus);
        btn_equal = findViewById(R.id.btn_equal);
        btn_dot = findViewById(R.id.btn_dot);

        input = findViewById(R.id.inputText2);
        output = findViewById(R.id.outputText2);



        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                store = input.getText().toString();
                input.setText(store + "1");
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                store = input.getText().toString();
                input.setText(store + "2");
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                store = input.getText().toString();
                input.setText(store + "3");
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                store = input.getText().toString();
                input.setText(store + "4");
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                store = input.getText().toString();
                input.setText(store + "5");
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                store = input.getText().toString();
                input.setText(store + "6");
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                store = input.getText().toString();
                input.setText(store + "7");
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                store = input.getText().toString();
                input.setText(store + "8");
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                store = input.getText().toString();
                input.setText(store + "9");
            }
        });
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                store = input.getText().toString();
                input.setText(store + "0");
            }
        });
        btn_00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                store = input.getText().toString();
                input.setText(store + "00");
            }
        });
        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                store = input.getText().toString();
                input.setText(store + "/");
            }
        });
        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                store = input.getText().toString();
                input.setText(store + "x");
            }
        });
        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                store = input.getText().toString();
                input.setText(store + "+");
            }
        });
        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                store = input.getText().toString();
                input.setText(store + "-");
            }
        });
        btn_module.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                store = input.getText().toString();
                input.setText(store + "%");
            }
        });
        btn_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                store = input.getText().toString();
                input.setText(store + "");
            }
        });
        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                store = input.getText().toString();
                input.setText(store + ".");
            }
        });
        btn_day.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dayMode.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                store = store.replaceAll("x", "*");
                store = store.replaceAll("%", "/100");

                org.mozilla.javascript.Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);

                String finalresult = "";
                Scriptable scriptable = rhino.initSafeStandardObjects();
                finalresult = rhino.evaluateString(scriptable,store,"Javascript", 1,null).toString();

                output.setText(finalresult);
            }
        });
    }
}
