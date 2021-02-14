package ru.geekbrains.mycalculator;

public class Calculator implements ButtonService {

    double num1 = 0;
    double num2 = 0;
    double result = 0;
    String operand = null;

    @Override
    public void buttonNumberClicked(String number) {
        MainActivity.textView.append(number);
    }

    @Override
    public void buttonOperandClicked(String op) {
        num1 = Double.parseDouble(getResult());
        operand = op;
        MainActivity.textView.setText("");
    }

    @Override
    public void buttonEvenClicked() {
        num2 = Double.parseDouble(getResult());
        switch (operand) {
            case ("-"):
                result = num1 - num2;
                MainActivity.textView.setText(Double.toString(result));
                break;
            case ("+"):
                result = num1 + num2;
                MainActivity.textView.setText(Double.toString(result));
                break;
            case ("*"):
                result = num1 * num2;
                MainActivity.textView.setText(Double.toString(result));
                break;
            case ("/"):
                result = num1 / num2;
                MainActivity.textView.setText(Double.toString(result));
                break;
            case ("%"):
                break;
        }
    }

    @Override
    public void buttonBackspaceClicked() {

    }

    @Override
    public void buttonClearClicked() {
        operand = null;
        result = 0;
        MainActivity.textView.setText("");
    }

    @Override
    public void buttonMemoryAddClicked() {

    }

    @Override
    public void buttonMemoryRemoveClicked() {

    }

    @Override
    public void buttonMemoryClearClicked() {

    }

    @Override
    public String getMemory() {
        return null;
    }

    @Override
    public String getResult() {
        return MainActivity.textView.getText().toString();
    }
}
