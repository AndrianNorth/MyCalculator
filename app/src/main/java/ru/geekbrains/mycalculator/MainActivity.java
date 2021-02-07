package ru.geekbrains.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ButtonService buttonService;
    private TextView textView;
    private Button button0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonService = new Calculator();
        button0 = findViewById(R.id.button_0);
        button1 = findViewById(R.id.button_1);
        button2 = findViewById(R.id.button_2);
        button3 = findViewById(R.id.button_3);
        button4 = findViewById(R.id.button_4);
        button5 = findViewById(R.id.button_5);
        button6 = findViewById(R.id.button_6);
        button7 = findViewById(R.id.button_7);
        button8 = findViewById(R.id.button_8);
        button9 = findViewById(R.id.button_9);
        textView = findViewById(R.id.textView);
        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        switch (view.getId()) {
            case R.id.button_0:
                buttonService.ButtonNumberClicked("0");
                break;
            case R.id.button_1:
                buttonService.ButtonNumberClicked("1");
                break;
            case R.id.button_2:
                buttonService.ButtonNumberClicked("2");
                break;
            case R.id.button_3:
                buttonService.ButtonNumberClicked("3");
                break;
            case R.id.button_4:
                buttonService.ButtonNumberClicked("4");
                break;
            case R.id.button_5:
                buttonService.ButtonNumberClicked("5");
                break;
            case R.id.button_6:
                buttonService.ButtonNumberClicked("6");
                break;
            case R.id.button_7:
                buttonService.ButtonNumberClicked("7");
                break;
            case R.id.button_8:
                buttonService.ButtonNumberClicked("8");
                break;
            case R.id.button_9:
                buttonService.ButtonNumberClicked("9");
                break;
            case R.id.button_point:
                buttonService.ButtonNumberClicked(",");
                break;
            case R.id.button_even:
                buttonService.ButtonEvenClicked();
                break;
            case R.id.button_clear:
                buttonService.ButtonClearClicked();
                break;
            case R.id.button_plus:
                buttonService.ButtonOperandClicked("+");
                break;
            case R.id.button_minus:
                buttonService.ButtonOperandClicked("-");
                break;
            case R.id.button_mult:
                buttonService.ButtonOperandClicked("@string/_mult");
                break;
            case R.id.button_div:
                buttonService.ButtonOperandClicked("@string/_div");
                break;
            case R.id.button_percent:
                buttonService.ButtonOperandClicked("%");
                break;
            case R.id.button_backspace:
                buttonService.ButtonBackspaceClicked();
                break;
            case R.id.button_mc:
                buttonService.ButtonMemoryClearClicked();
                break;
            case R.id.button_mcplus:
                buttonService.ButtonMemoryAddClicked();
                break;
            case R.id.button_mcminus:
                buttonService.ButtonMemoryRemoveClicked();
                break;
        }
    }
}