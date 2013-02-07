public class FizzBuzz {
    public String forValue(int i) {
        String result = "";
        if (i % 3 == 0) result = "Fizz";
        if (i % 5 == 0) result += "Buzz";
        if (result.equals("")) result = String.valueOf(i);
        return result;
    }
}
