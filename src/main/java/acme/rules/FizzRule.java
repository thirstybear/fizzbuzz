package acme.rules;

public class FizzRule implements ConversionRule {
    public String convert(int i) {
        if (i % 3 == 0) return "Fizz";
        return "";
    }
}

