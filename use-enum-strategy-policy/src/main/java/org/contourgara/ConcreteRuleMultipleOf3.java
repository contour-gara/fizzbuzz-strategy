package org.contourgara;

public class ConcreteRuleMultipleOf3 implements Rule {
    public boolean ok(Integer num) {
        return num % 3 == 0;
    }
}
