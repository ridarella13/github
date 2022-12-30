import org.junit.jupiter.api.Test;
import org.testng.asserts.Assertion;

public class NewTest {
    @Test
    void newTest() {
        int i = 3;
        Assertion.assertTrue(i > 2);
    }
