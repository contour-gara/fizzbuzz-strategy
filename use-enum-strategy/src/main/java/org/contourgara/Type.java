package org.contourgara;

import java.util.Arrays;

public enum Type {
    ZERO(0, new ConcreteStrategyFizzBuzz()),
    ONE(1, new ConcreteStrategyNumber()),
    TWO(2, new ConcreteStrategyNumber()),
    THREE(3, new ConcreteStrategyFizz()),
    FOUR(4, new ConcreteStrategyNumber()),
    FIVE(5, new ConcreteStrategyBuzz()),
    SIX(6, new ConcreteStrategyFizz()),
    SEVEN(7, new ConcreteStrategyNumber()),
    EIGHT(8, new ConcreteStrategyNumber()),
    NINE(9, new ConcreteStrategyFizz()),
    TEN(10, new ConcreteStrategyBuzz()),
    ELEVEN(11, new ConcreteStrategyNumber()),
    TWELVE(12, new ConcreteStrategyFizz()),
    THIRTEEN(13, new ConcreteStrategyNumber()),
    FOURTEEN(14, new ConcreteStrategyNumber());

    private final Integer remainder;
    private final Strategy strategy;

    Type(Integer remainder, Strategy strategy) {
        this.remainder = remainder;
        this.strategy = strategy;
    }

    public static Type getTypeByRemainder(Integer remainder) {
        return Arrays.stream(Type.values())
                .filter(type -> type.getRemainder().equals(remainder))
                .findFirst()
                .orElse(null);
    }

    public String execute(Integer num) {
        return strategy.fizzBuzz(num);
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public Integer getRemainder() {
        return remainder;
    }
}
