package befaster.solutions;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SumTest {

    @Test
    public void compute_sum() {
        assertThat(FizzBuzz.fizzBuzz(1), equalTo("1"));
        assertThat(FizzBuzz.fizzBuzz(15), equalTo("fizz buzz"));
        assertThat(FizzBuzz.fizzBuzz(5131), equalTo("fizz buzz"));
        assertThat(FizzBuzz.fizzBuzz(31), equalTo("fizz"));
        assertThat(FizzBuzz.fizzBuzz(13), equalTo("fizz"));
        assertThat(FizzBuzz.fizzBuzz(12), equalTo("fizz"));
        assertThat(FizzBuzz.fizzBuzz(5), equalTo("buzz"));
        assertThat(FizzBuzz.fizzBuzz(10), equalTo("buzz"));
        assertThat(FizzBuzz.fizzBuzz(511), equalTo("buzz"));
        assertThat(FizzBuzz.fizzBuzz(555), equalTo("fizz buzz fake deluxe"));
        assertThat(FizzBuzz.fizzBuzz(5555), equalTo("buzz fake deluxe"));
        assertThat(FizzBuzz.fizzBuzz(22), equalTo("deluxe"));
        assertThat(FizzBuzz.fizzBuzz(11), equalTo("fake deluxe"));
        assertThat(FizzBuzz.fizzBuzz(1111), equalTo("fake deluxe"));

        assertThat(FizzBuzz.fizzBuzz(33), equalTo("fizz fake deluxe"));
        assertThat(FizzBuzz.fizzBuzz(222), equalTo("fizz deluxe"));


        assertThat(Sum.sum(0, 0), equalTo(0));
    }
}