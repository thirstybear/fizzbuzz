package acme.rules;

public class BuzzRule extends ConversionRule {
    public BuzzRule() {
    }

    BuzzRule(ConversionRule next) {
        super(next);
    }

    public String addToString(int i, String valueSoFar) {
        if (i % 5 == 0) valueSoFar += "Buzz";
        if (next != null) {
            return next.addToString(i, valueSoFar);
        }
        return valueSoFar;
    }
}


