package acme.rules;

abstract public class ConversionRule {
    protected final ConversionRule next;

    public ConversionRule() {
        this.next = null;
    }

    public ConversionRule(ConversionRule next) {
        this.next = next;
    }

    public abstract String convert(int i);
}
