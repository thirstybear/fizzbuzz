package acme;

import acme.rules.BuzzRule;
import acme.rules.ConversionRule;
import acme.rules.DefaultRule;
import acme.rules.FizzRule;

import java.util.ArrayList;

public class FizzBuzz {

    private final ConversionRule stringProcessor;
    private DefaultRule defaultRule;
    private ArrayList<ConversionRule> ruleList = new ArrayList<ConversionRule>();

    public FizzBuzz() {
        this.defaultRule = new DefaultRule();
        add(new FizzRule());
        add(new BuzzRule());

        stringProcessor = new DefaultRule(new FizzRule(new BuzzRule()));
    }

    private void add(ConversionRule newRule) {
        ruleList.add(newRule);
    }

    public String forValue(int i) {
        StringBuffer result = new StringBuffer();

        for(ConversionRule rule: ruleList) {
            result.append(rule.addToString(i, ""));
        }

        if (result.length() == 0) return defaultRule.addToString(i, "");

        return result.toString();
    }

}
