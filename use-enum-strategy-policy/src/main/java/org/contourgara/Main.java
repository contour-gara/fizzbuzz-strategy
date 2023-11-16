package org.contourgara;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; ++i) {
            if (new FizzBuzzPolicy().complyWithAll(i)) {
                System.out.println(Type.FIZZBUZZ.execute(i));
            } else if (new FizzPolicy().complyWithAll(i)) {
                System.out.println(Type.FIZZ.execute(i));
            } else if (new BuzzPolicy().complyWithAll(i)) {
                System.out.println(Type.BUZZ.execute(i));
            } else {
                System.out.println(Type.NUMBER.execute(i));
            }
        }
    }
}
