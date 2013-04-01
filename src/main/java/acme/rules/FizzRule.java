package acme.rules;

public class FizzRule extends ConversionRule {
    public FizzRule() {
        super();
    }

    public FizzRule(ConversionRule next) {
        super(next);
    }

    public String addToString(int i, String valueSoFar) {
        if (i % 3 == 0) valueSoFar += "Fizz";
        if (next != null) {
            return next.addToString(i, valueSoFar);
        }
        return valueSoFar;
    }
}

