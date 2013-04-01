package acme;

import acme.rules.BuzzRule;
import acme.rules.ConversionRule;
import acme.rules.DefaultRule;
import acme.rules.FizzRule;

import java.util.ArrayList;

public class FizzBuzz {

    private DefaultRule defaultRule;
    private ArrayList<ConversionRule> ruleList = new ArrayList<ConversionRule>();

    public FizzBuzz() {
        this.defaultRule = new DefaultRule();
        add(new FizzRule());
        add(new BuzzRule());
    }

    private void add(ConversionRule newRule) {
        ruleList.add(newRule);
    }

    public String forValue(int i) {
        String convertedValue = applyNonDefaultRules(i);

        if (noRulesWereApplied(convertedValue)) return defaultRule.convert(i);
        else return convertedValue;
    }

    private boolean noRulesWereApplied(String convertedValue) {
        return convertedValue.equals("");
    }

    private String applyNonDefaultRules(int i) {
        StringBuffer result = new StringBuffer();
        for(ConversionRule rule: ruleList) {
             result.append(rule.convert(i));
        }
        return result.toString();
    }
}
