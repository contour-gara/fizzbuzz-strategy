package org.contourgara;

public class ConcreteRuleMultipleOf5 implements Rule {
    public boolean ok(Integer num) {
        return num % 5 == 0;
    }
}
