package acme.rules;

public class FizzRule implements ConversionRule {
    public String applyTo(int i) {
        if (i % 3 == 0) return "Fizz";
        return "";
    }
}

