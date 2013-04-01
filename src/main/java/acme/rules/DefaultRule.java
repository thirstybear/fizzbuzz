package acme.rules;

public class DefaultRule extends ConversionRule {
    public String convert(int i) {
        return String.valueOf(i);
    }
}

