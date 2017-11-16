package befaster.solutions;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SumTest {

    @Test
    public void compute_sum() {
        assertThat(FizzBuzz.fizzBuzz(1), equalTo("1"));
        assertThat(FizzBuzz.fizzBuzz(13), equalTo("fizz"));
        assertThat(FizzBuzz.fizzBuzz(12), equalTo("fizz"));
		assertThat(FizzBuzz.fizzBuzz(123), equalTo("fizz fake deluxe"));
		assertThat(FizzBuzz.fizzBuzz(345), equalTo("fizz buzz fake deluxe"));
		assertThat(FizzBuzz.fizzBuzz(354), equalTo("fizz buzz deluxe"));
        assertThat(Sum.sum(0, 0), equalTo(0));
    }
}