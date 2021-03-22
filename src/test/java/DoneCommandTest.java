import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoneCommandTest {
    @Test
    public void getTypeCheck() {
        assertEquals("done", new DoneCommand(1).getType());
    }
}
