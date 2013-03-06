import acme.FizzBuzz;

public class Main {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i=1; i < 101; i++) {
            System.out.println(fizzBuzz.forValue(i));
        }

    }
}
