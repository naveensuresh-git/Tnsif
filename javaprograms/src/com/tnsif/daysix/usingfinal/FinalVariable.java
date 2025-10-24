package com.tnsif.daysix.usingfinal;

public class FinalVariable {

    // final instance variable must be initialized
    final int x = 100;

    // Declare a static blank final variable.
    final static int Y;

    // Declare & initialize static final variable.
    final static int Z = 10;

    // instance method
    void change() {
        // x = 30; // ❌ cannot reassign final variable
        // Y = 200; // ❌ cannot reassign final static variable
        System.out.println("Cannot change final variables!");
    }

    @Override
    public String toString() {
        return "FinalVar
