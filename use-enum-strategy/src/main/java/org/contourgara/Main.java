package org.contourgara;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; ++i) {
            System.out.println(Type.getTypeByRemainder(i % 15).execute(i));
        }
    }
}
