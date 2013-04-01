package acme.rules;

public class BuzzRule extends ConversionRule {
    public BuzzRule() {
    }

    BuzzRule(ConversionRule next) {
        super(next);
    }

    public String convert(int i) {
        if (i % 5 == 0) return "Buzz";
        return "";
    }
}


