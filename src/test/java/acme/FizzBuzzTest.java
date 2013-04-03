package acme;

import acme.FizzBuzz;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void doesNotConvertInteger1() {
        assertThat(fizzBuzz.forValue(1), is(equalTo("1")));
    }

    @Test
    public void doesNotConvertInteger2() {
        assertThat(fizzBuzz.forValue(2), is(equalTo("2")));
    }

    @Test
    public void convertsMultiplesOf3ToFizz() {
        assertThat(fizzBuzz.forValue(3), is(equalTo("Fizz")));
        assertThat(fizzBuzz.forValue(6), is(equalTo("Fizz")));
        assertThat(fizzBuzz.forValue(9), is(equalTo("Fizz")));
    }

    @Test
    public void convertsMultiplesOf5ToBuzz() {
        assertThat(fizzBuzz.forValue(5), is(equalTo("Buzz")));
        assertThat(fizzBuzz.forValue(10), is(equalTo("Buzz")));
        assertThat(fizzBuzz.forValue(20), is(equalTo("Buzz")));
    }

    @Test
    public void convertsMultiplesOfBoth3And5ToFizzbuzz() {
        assertThat(fizzBuzz.forValue(15), is(equalTo("FizzBuzz")));
        assertThat(fizzBuzz.forValue(30), is(equalTo("FizzBuzz")));
        assertThat(fizzBuzz.forValue(45), is(equalTo("FizzBuzz")));
    }

    @Test
    public void convertsMultiplesOf7ToWhizz() {
        assertThat(fizzBuzz.forValue(7), is(equalTo("Whizz")));
        assertThat(fizzBuzz.forValue(14), is(equalTo("Whizz")));
    }

    @Test
    public void convertsMultiplesOfBoth3And7ToFizzWhizz() {
        assertThat(fizzBuzz.forValue(21), is(equalTo("FizzWhizz")));
    }

    @Test
    public void convertsMultiplesOfBoth5And7ToBuzzWhizz() {
        assertThat(fizzBuzz.forValue(35), is(equalTo("BuzzWhizz")));
    }
}
