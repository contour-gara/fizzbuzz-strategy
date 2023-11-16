package org.contourgara;

public class Context {
    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public String execute(Integer num) {
        return strategy.fizzBuzz(num);
    }
}
