public class FizzBuzz {

    private final IntToString stringProcessor;

    public FizzBuzz() {
        stringProcessor = new Default();
        IntToString fizz = new Fizz();
        fizz.addNext(new Buzz());
        stringProcessor.addNext(fizz);
    }

    public String forValue(int i) {
        return stringProcessor.addToString(i, "");
    }

    abstract class IntToString {
        protected IntToString next = null;

        public void addNext(IntToString processor) {
            next = processor;
        }

        public abstract String addToString(int i, String valueSoFar);
    }

    class Fizz extends IntToString {
        public String addToString(int i, String valueSoFar) {
            if (i % 3 == 0) valueSoFar += "Fizz";
            if (next != null) {
                return next.addToString(i, valueSoFar);
            }
            return valueSoFar;
        }
    }

    class Buzz extends IntToString {
        public String addToString(int i, String valueSoFar) {
            if (i % 5 == 0) valueSoFar += "Buzz";
            if (next != null) {
                return next.addToString(i, valueSoFar);
            }
            return valueSoFar;
        }
    }


    class Default extends IntToString {
        public String addToString(int i, String valueSoFar) {
            String result = null;
            if (next != null) {
                result = next.addToString(i, valueSoFar);
            }

            if (result == null || result.equals("")) {
                return String.valueOf(i);
            }
            return result;
        }
    }
}
