package acme.rules;

public class DefaultRule implements ConversionRule {
    public String applyTo(int i) {
        return String.valueOf(i);
    }
}

