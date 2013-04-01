package acme;

import acme.rules.BuzzRule;
import acme.rules.ConversionRule;
import acme.rules.DefaultRule;
import acme.rules.FizzRule;

public class FizzBuzz {

    private final ConversionRule stringProcessor;

    public FizzBuzz() {
        stringProcessor = new DefaultRule(new FizzRule(new BuzzRule()));
    }

    public String forValue(int i) {
        return stringProcessor.addToString(i, "");
    }

 }
