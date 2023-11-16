package org.contourgara;

public class FizzPolicy {
    private final Policy policy;

    public FizzPolicy() {
        policy = new Policy();
        policy.addRule(new ConcreteRuleMultipleOf3());
    }

    public boolean complyWithAll(Integer num) {
        return policy.complyWithAll(num);
    }
}
