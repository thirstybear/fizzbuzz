package acme.rules;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class WhizzRuleTest {
    @Test
    public void convertsMultiplesOf7ToWhizz() throws Exception {
        WhizzRule whizzRule = new WhizzRule();
        assertThat(whizzRule.applyTo(7), is(equalTo("Whizz")));
    }
}
