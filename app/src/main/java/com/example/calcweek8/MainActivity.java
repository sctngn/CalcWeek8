package com.example.calcweek8;

import static java.lang.Math.round;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText textInputFirstNum, textInputSecondNum;
    private TextView textOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        textInputFirstNum = findViewById(R.id.inputFirstNum);
        textInputSecondNum = findViewById(R.id.inputSecondNum);

        textOutput = findViewById(R.id.answerNumberField);
    }

    public void plus(View view) {
        String firstNumStr = textInputFirstNum.getText().toString();
        String secondNumStr = textInputSecondNum.getText().toString();

        // Check if the inputs are not empty
        if (!firstNumStr.isEmpty() && !secondNumStr.isEmpty()) {
            double firstNum = Double.parseDouble(firstNumStr);
            double secondNum = Double.parseDouble(secondNumStr);

            double result = firstNum + secondNum;
            String roundedResult = String.format("%.2f", result);


            textOutput.setText(String.valueOf(result));
        } else {
            textOutput.setText("Please enter both numbers");
        }
    }

    public void minus(View view) {
        String firstNumStr = textInputFirstNum.getText().toString();
        String secondNumStr = textInputSecondNum.getText().toString();

        if (!firstNumStr.isEmpty() && !secondNumStr.isEmpty()) {
            double firstNum = Double.parseDouble(firstNumStr);
            double secondNum = Double.parseDouble(secondNumStr);

            double result = firstNum - secondNum;
            String roundedResult = String.format("%.2f", result);
            textOutput.setText(roundedResult);
        } else {
            textOutput.setText("Please enter both numbers");
        }
    }

    public void divide(View view) {
        String firstNumStr = textInputFirstNum.getText().toString();
        String secondNumStr = textInputSecondNum.getText().toString();

        if (!firstNumStr.isEmpty() && !secondNumStr.isEmpty()) {
            double firstNum = Double.parseDouble(firstNumStr);
            double secondNum = Double.parseDouble(secondNumStr);

            if (secondNum != 0) { //Avoid 0 division
                double result = firstNum / secondNum;
                String roundedResult = String.format("%.2f", result);
                textOutput.setText(roundedResult);
            } else {
                textOutput.setText("Cannot divide by zero");
            }
        } else {
            textOutput.setText("Please enter both numbers");
        }
    }

    public void multiply(View view) {
        String firstNumStr = textInputFirstNum.getText().toString();
        String secondNumStr = textInputSecondNum.getText().toString();

        if (!firstNumStr.isEmpty() && !secondNumStr.isEmpty()) {
            double firstNum = Double.parseDouble(firstNumStr);
            double secondNum = Double.parseDouble(secondNumStr);

            double result = firstNum * secondNum;
            String roundedResult = String.format("%.2f", result);
            textOutput.setText(roundedResult);
        } else {
            textOutput.setText("Please enter both numbers");
        }
    }
}
