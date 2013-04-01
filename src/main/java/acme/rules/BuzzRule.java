package acme.rules;

public class BuzzRule implements ConversionRule {
    public String applyTo(int i) {
        if (i % 5 == 0) return "Buzz";
        return "";
    }
}


