package org.example.ambiguityproblem;

public class Addition {

    public Addition(int a, int b) {
        System.out.println("inside constructor INT");
    }

    public Addition(double a, double b) {
        System.out.println("inside constructor DOUBLE");
    }

    public Addition(String a, String b) {
        System.out.println("inside constructor STRING");
    }
}
