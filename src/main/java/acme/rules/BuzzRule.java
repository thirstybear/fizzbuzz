package acme.rules;

public class BuzzRule implements ConversionRule {
    public String convert(int i) {
        if (i % 5 == 0) return "Buzz";
        return "";
    }
}


