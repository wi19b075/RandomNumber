import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void test_Given_AppIsStarted_When_PrintingWelcomeMessage_Then_CorrectOutputExpected() {
        //arrange
        String expected = "Hello Random Number";

        //act
        String actual = Main.getMessage();

        //assert
        Assertions.assertEquals(expected, actual);

    }
}
