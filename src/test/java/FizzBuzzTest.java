import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {
    @Test
    public void fizzBuzz1Is1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.forValue(1), is(equalTo("1")));
    }

    @Test
    public void fizzBuzz2Is2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.forValue(2), is(equalTo("2")));
    }

    @Test
    public void fizzBuzzXpleOf3IsFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.forValue(3), is(equalTo("Fizz")));
        assertThat(fizzBuzz.forValue(6), is(equalTo("Fizz")));
        assertThat(fizzBuzz.forValue(9), is(equalTo("Fizz")));
    }

    @Test
    public void fizzBuzz5IsBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.forValue(5), is(equalTo("Buzz")));
    }}
