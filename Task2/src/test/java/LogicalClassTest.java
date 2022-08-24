import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LogicalClassTest {
    @Test
    void findingUniq() {
        LogicalClass logicalClass = new LogicalClass();
        List<String> list = Arrays.asList("Dima", "Masha", "Slava", "Nick", "Oleg", "Masha", "Marina", "Slava", "Marina");
        String expected = logicalClass.FindingUniq(list);
        String actual = "Masha";
        assertEquals(expected, actual);
    }
}