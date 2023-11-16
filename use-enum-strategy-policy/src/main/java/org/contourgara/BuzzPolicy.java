package org.contourgara;

public class BuzzPolicy {
    private final Policy policy;

    public BuzzPolicy() {
        policy = new Policy();
        policy.addRule(new ConcreteRuleMultipleOf5());
    }

    public boolean complyWithAll(Integer num) {
        return policy.complyWithAll(num);
    }
}
