package org.contourgara;

import java.util.HashSet;
import java.util.Set;

public class Policy {
    private final Set<Rule> rules = new HashSet<>();

    public boolean complyWithAll(Integer num) {
        for (Rule rule : rules) {
            if (!rule.ok(num)) return false;
        }
        return true;
    }

    public void addRule(Rule rule) {
        rules.add(rule);
    }
}
