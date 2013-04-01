package acme.rules;

public class DefaultRule extends ConversionRule {
    public DefaultRule() {
    }

    public DefaultRule(ConversionRule next) {
        super(next);
    }

    public String convert(int i) {
        return String.valueOf(i);
    }
}

