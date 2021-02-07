package ru.geekbrains.mycalculator;

import androidx.annotation.NonNull;

public interface ButtonService {
    void ButtonNumberClicked(@NonNull String number);
    void ButtonOperandClicked(@NonNull String operand);
    void ButtonEvenClicked(@NonNull String even);
    void ButtonMemoryAddClicked(@NonNull String memory);
    void ButtonMemoryRemoveClicked(@NonNull String memory);
    void ButtonMemoryClearClicked(@NonNull String memory);
    String getMemory();
    String getResult();
}
