package org.contourgara;

public class FizzBuzzPolicy {
    private final Policy policy;

    public FizzBuzzPolicy() {
        policy = new Policy();
        policy.addRule(new ConcreteRuleMultipleOf3());
        policy.addRule(new ConcreteRuleMultipleOf5());
    }

    public boolean complyWithAll(Integer num) {
        return policy.complyWithAll(num);
    }
}
