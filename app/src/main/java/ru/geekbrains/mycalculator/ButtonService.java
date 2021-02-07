package ru.geekbrains.mycalculator;

import androidx.annotation.NonNull;

public interface ButtonService {
    void ButtonNumberClicked(@NonNull String number);
    void ButtonOperandClicked(@NonNull String operand);
    void ButtonEvenClicked();
    void ButtonBackspaceClicked();
    void ButtonClearClicked();
    void ButtonMemoryAddClicked();
    void ButtonMemoryRemoveClicked();
    void ButtonMemoryClearClicked();
    String getMemory();
    String getResult();
}
