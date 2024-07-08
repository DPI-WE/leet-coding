import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SumTest {

    @Test
    public void testSumZeroPlusZeroEqualsZero() {
        assertEquals(0, Sum.sum(0, 0));
    }

    @Test
    public void testSumOnePlusTwoEqualsThree() {
        assertEquals(3, Sum.sum(1, 2));
    }
}
