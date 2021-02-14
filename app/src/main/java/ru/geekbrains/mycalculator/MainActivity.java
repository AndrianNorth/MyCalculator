package ru.geekbrains.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ButtonService buttonService;
    static TextView textView;
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
    private Button buttonClear;
    private Button buttonMinus;
    private Button buttonPlus;
    private Button buttonDiv;
    private Button buttonMult;
    private Button buttonPercent;
    private Button buttonEven;


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
        buttonClear = findViewById(R.id.button_clear);
        buttonMinus = findViewById(R.id.button_minus);
        buttonPlus = findViewById(R.id.button_plus);
        buttonDiv = findViewById(R.id.button_div);
        buttonMult = findViewById(R.id.button_mult);
        buttonPercent = findViewById(R.id.button_percent);
        buttonEven = findViewById(R.id.button_even);

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
        buttonClear.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
        buttonMult.setOnClickListener(this);
        buttonPercent.setOnClickListener(this);
        buttonEven.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_0:
                buttonService.buttonNumberClicked("0");
                break;
            case R.id.button_1:
                buttonService.buttonNumberClicked("1");
                break;
            case R.id.button_2:
                buttonService.buttonNumberClicked("2");
                break;
            case R.id.button_3:
                buttonService.buttonNumberClicked("3");
                break;
            case R.id.button_4:
                buttonService.buttonNumberClicked("4");
                break;
            case R.id.button_5:
                buttonService.buttonNumberClicked("5");
                break;
            case R.id.button_6:
                buttonService.buttonNumberClicked("6");
                break;
            case R.id.button_7:
                buttonService.buttonNumberClicked("7");
                break;
            case R.id.button_8:
                buttonService.buttonNumberClicked("8");
                break;
            case R.id.button_9:
                buttonService.buttonNumberClicked("9");
                break;
            case R.id.button_point:
                buttonService.buttonNumberClicked(",");
                break;
            case R.id.button_even:
                buttonService.buttonEvenClicked();
                break;
            case R.id.button_clear:
                buttonService.buttonClearClicked();
                break;
            case R.id.button_plus:
                buttonService.buttonOperandClicked("+");
                break;
            case R.id.button_minus:
                buttonService.buttonOperandClicked("-");
                break;
            case R.id.button_mult:
                buttonService.buttonOperandClicked("*");
                break;
            case R.id.button_div:
                buttonService.buttonOperandClicked("/");
                break;
            case R.id.button_percent:
                buttonService.buttonOperandClicked("%");
                break;
            case R.id.button_backspace:
                buttonService.buttonBackspaceClicked();
                break;
            case R.id.button_mc:
                buttonService.buttonMemoryClearClicked();
                break;
            case R.id.button_mcplus:
                buttonService.buttonMemoryAddClicked();
                break;
            case R.id.button_mcminus:
                buttonService.buttonMemoryRemoveClicked();
                break;
        }
    }
}