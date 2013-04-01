package acme.rules;

public class DefaultRule extends ConversionRule {
    public DefaultRule() {
    }

    public DefaultRule(ConversionRule next) {
        super(next);
    }

    public String addToString(int i, String valueSoFar) {
        String result = null;
        if (next != null) {
            result = next.addToString(i, valueSoFar);
        }

        if (stringIsEmptyOrNull(result)) {
            return String.valueOf(i);
        }
        return result;
    }

    private boolean stringIsEmptyOrNull(String result) {
        return result == null || result.equals("");
    }
}

