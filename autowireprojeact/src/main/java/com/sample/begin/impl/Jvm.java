package com.sample.begin.impl;

import com.sample.begin.repo.Program;



public class Jvm implements Program {
    public Jvm() {
        System.out.println("Jvm Constructor");
    }

    public void compile() {
        System.out.println("Compiling Program");
    }
}
