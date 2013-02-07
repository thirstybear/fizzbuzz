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
}
