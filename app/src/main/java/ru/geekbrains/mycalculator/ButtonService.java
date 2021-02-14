package ru.geekbrains.mycalculator;

public interface ButtonService {
    void buttonNumberClicked(String number);
    void buttonOperandClicked(String operand);
    void buttonEvenClicked();
    void buttonBackspaceClicked();
    void buttonClearClicked();
    void buttonMemoryAddClicked();
    void buttonMemoryRemoveClicked();
    void buttonMemoryClearClicked();
    String getMemory();
    String getResult();
}
