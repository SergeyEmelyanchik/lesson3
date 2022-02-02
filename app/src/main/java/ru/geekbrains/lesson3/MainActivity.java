package ru.geekbrains.lesson3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView Screen;
    private Button one, two, three, four, five, six, seven, eight, nine, zero, dot, plus, minus, multiply, div, equal, clear, del;
    private String input, Answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Screen = findViewById(R.id.screen);
        del = findViewById(R.id.del);
        clear = findViewById(R.id.clear);
        equal = findViewById(R.id.equal);
        div = findViewById(R.id.div);
        multiply = findViewById(R.id.multiply);
        minus = findViewById(R.id.minus);
        plus = findViewById(R.id.plus);
        dot = findViewById(R.id.dot);
        zero = findViewById(R.id.zero);
        nine = findViewById(R.id.nine);
        eight = findViewById(R.id.eight);
        seven = findViewById(R.id.seven);
        six = findViewById(R.id.six);
        five = findViewById(R.id.five);
        four = findViewById(R.id.four);
        three = findViewById(R.id.three);
        two = findViewById(R.id.two);
        one = findViewById(R.id.one);
    }

    /* @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("Screen", Screen.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Screen.setText(savedInstanceState.getString("Screen"));
    }*/
            public void onClick (View view){
                Button button = (Button) view;
                String data = button.getText().toString();//объявляем строковые данные для получения текста кнопок
                switch (data) {
                    case "AC":
                        input = "";
                        break;

                    case "*":
                        Result();
                        input += "*";
                        break;
                    case "=":
                        Result();
                        Answer = input;
                        break;
                    case "DEL":
                        String newText = input.substring(0, input.length() - 1);
                        input = newText;
                        break;
                    default:
                        if (input == null) {
                            input = "";
                        }
                        if (data.equals("+") || data.equals("-") || data.equals("/")) {
                            Result();
                        }
                        input += data;

                }
                Screen.setText(input);
            }

            private void Result () {
                if (input.split("\\*").length == 2) {
                    String number[] = input.split("\\*");
                    try {
                        double multiply = Double.parseDouble(number[0]) * Double.parseDouble(number[1]);
                        input = multiply + "";
                    } catch (Exception e) {

                    }
                } else if (input.split("/").length == 2) {
                    String number[] = input.split("/");
                    try {
                        double div = Double.parseDouble(number[0]) / Double.parseDouble(number[1]);
                        input = div + "";
                    } catch (Exception e) {
                    }
                } else if (input.split("\\+").length == 2) {
                    String number[] = input.split("\\+");
                    try {
                        double plus = Double.parseDouble(number[0]) + Double.parseDouble(number[1]);
                        input = plus + "";
                    } catch (Exception e) {
                    }
                } else if (input.split("-").length > 1) {
                    String number[] = input.split("-");
                    if (number[0] == "" && number.length == 2) {
                        number[0] = 0 + "";
                    }
                    try {
                        double minus = 0;
                        if (number.length == 2) {
                            minus = Double.parseDouble(number[0]) - Double.parseDouble(number[1]);
                        } else if (number.length == 3) {
                            minus = -Double.parseDouble(number[1]) - Double.parseDouble(number[2]);
                        }
                        input = minus + "";

                    } catch (Exception e) {
                    }
                }
                String n[] = input.split("\\.");
                if (n.length > 1) {
                    if (n[1].equals("0")) {
                        input = n[0];
                    }
                }
                Screen.setText(input);
            }
        }