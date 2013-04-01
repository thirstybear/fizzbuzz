package acme;

import acme.rules.ConversionRule;

public class FizzBuzz {

    private final ConversionRule stringProcessor;

    public FizzBuzz() {
        stringProcessor = new DefaultRule(new FizzRule(new BuzzRule()));
    }

    public String forValue(int i) {
        return stringProcessor.addToString(i, "");
    }


    class FizzRule extends ConversionRule {
        FizzRule() {
            super();
        }

        FizzRule(ConversionRule next) {
            super(next);
        }

        public String addToString(int i, String valueSoFar) {
            if (i % 3 == 0) valueSoFar += "Fizz";
            if (next != null) {
                return next.addToString(i, valueSoFar);
            }
            return valueSoFar;
        }
    }

    class BuzzRule extends ConversionRule {
        BuzzRule() {
        }

        BuzzRule(ConversionRule next) {
            super(next);
        }

        public String addToString(int i, String valueSoFar) {
            if (i % 5 == 0) valueSoFar += "Buzz";
            if (next != null) {
                return next.addToString(i, valueSoFar);
            }
            return valueSoFar;
        }
    }


    class DefaultRule extends ConversionRule {
        DefaultRule() {
        }

        DefaultRule(ConversionRule next) {
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
}
