import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SumTest {


    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    private Sum sum;

    @Before
    public void setUp() throws Exception {
        sum = new Sum();
    }

    @Test
    public void sumShouldReturnSummationOfTwoNumber() throws Exception {
        int result = sum.sum(10, 15);

        assertThat(result, is(25));
    }

    @Test
    public void sumillegalarrgument() throws Exception {
        expectedException.expect(IllegalArgumentException.class);
        int sum1 = sum.sum(null, -5);

    }

    @Test
    public void sumnegative() throws Exception {
        int result = sum.sum(-2, -5);
        assertThat(result, is(-7));
    }
    // how to deal with sumnegative -0


}