package acme;

public class FizzBuzz {

    private final IntToString stringProcessor;

    public FizzBuzz() {
        stringProcessor = new Default(new Fizz(new Buzz()));
    }

    public String forValue(int i) {
        return stringProcessor.addToString(i, "");
    }

    abstract class IntToString {
        protected final IntToString next;

        public IntToString() {
            this.next = null;
        }

        public IntToString(IntToString next) {
            this.next = next;
        }

        public abstract String addToString(int i, String valueSoFar);
    }

    class Fizz extends IntToString {
        Fizz() {
            super();
        }

        Fizz(IntToString next) {
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

    class Buzz extends IntToString {
        Buzz() {
        }

        Buzz(IntToString next) {
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


    class Default extends IntToString {
        Default() {
        }

        Default(IntToString next) {
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
