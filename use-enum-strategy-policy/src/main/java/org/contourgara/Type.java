package org.contourgara;

public enum Type {
    FIZZ(new ConcreteStrategyFizz()),
    BUZZ(new ConcreteStrategyBuzz()),
    FIZZBUZZ(new ConcreteStrategyFizzBuzz()),
    NUMBER(new ConcreteStrategyNumber());

    private final Strategy strategy;

    Type(Strategy strategy) {
        this.strategy = strategy;
    }

    public String execute(Integer num) {
        return strategy.fizzBuzz(num);
    }
}
