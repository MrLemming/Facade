package org.example;

public class Main {
    public static final String A = "11001"; // A = 25
    public static final String B = "101"; // B = 5

    public static void main(String[] args) {
        BinOps binOps = new BinOps();
        System.out.println(binOps.sum(A, B));
        System.out.println(binOps.mult(A, B));
    }
}
