package acme.rules;

public class DefaultRule implements ConversionRule {
    public String convert(int i) {
        return String.valueOf(i);
    }
}

