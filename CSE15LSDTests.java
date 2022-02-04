import static org.junit.Assert.*;
import org.junit.*;

public class CSE15LSDTests {
    @Test
    public void test1() {
        int[] arr1 = {1, 2, 3, 4, 5, 1};
        assertEquals(3, CSE15LSDProgram.maxNumIdx(arr1));
    }

    @Test
    public void test2() {
        int[] arr2 = {};
        assertEquals(-1, CSE15LSDProgram.maxNumIdx(arr2));
    }
}
