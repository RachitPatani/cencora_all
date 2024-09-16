package com.sample.begin.impl;

import com.sample.begin.repo.Program;

public class CalculateProgram implements Program {
    public CalculateProgram() {
        System.out.println("CalculatorProgram constructor");
    }

    public void compile() {
        System.out.println("Compiling in CalculatorProgram");
    }
}