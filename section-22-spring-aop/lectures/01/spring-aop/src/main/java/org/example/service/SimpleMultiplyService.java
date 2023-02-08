package org.example.service;

public class SimpleMultiplyService implements MultiplyService {

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }
}
