package ru.geekbrains.lesson3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView Screen;
    private Button One, Two, Three, Four, Five, Six, Seven, Eight, Nine, Zero, Dot, Plus, Minus, Multiply, Div, Equal, Clear, Del;
    private String input, Answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Screen=findViewById(R.id.screen);
        Del=findViewById(R.id.del);
        Clear=findViewById(R.id.clear);
        Equal=findViewById(R.id.equal);
        Div=findViewById(R.id.div);
        Multiply=findViewById(R.id.multiply);
        Minus=findViewById(R.id.minus);
        Plus=findViewById(R.id.plus);
        Dot=findViewById(R.id.dot);
        Zero=findViewById(R.id.zero);
        Nine=findViewById(R.id.nine);
        Eight=findViewById(R.id.eight);
        Seven=findViewById(R.id.seven);
        Six=findViewById(R.id.six);
        Five=findViewById(R.id.five);
        Four=findViewById(R.id.four);
        Three=findViewById(R.id.three);
        Two=findViewById(R.id.two);
        One=findViewById(R.id.one);

    }
}