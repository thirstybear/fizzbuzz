package acme.rules;

public class WhizzRule implements ConversionRule {
    public String applyTo(int i) {
        return i % 7 == 0 ? "Whizz" : "";
    }
}
