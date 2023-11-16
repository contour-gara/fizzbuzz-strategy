package org.contourgara;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; ++i) {
            if (i % 15 == 0) {
                System.out.println(new Context(new ConcreteStrategyFizzBuzz()).execute(i));
            } else if (i % 3 == 0) {
                System.out.println(new Context(new ConcreteStrategyFizz()).execute(i));
            } else if (i % 5 == 0) {
                System.out.println(new Context(new ConcreteStrategyBuzz()).execute(i));
            } else {
                System.out.println(new Context(new ConcreteStrategyNumber()).execute(i));
            }
        }
    }
}
