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

        List<String> list2 = Arrays.asList("Nick", "Sergey", "Fedor", "Kirill", "Oleg", "Kirill", "Marina", "Slava", "Marina");
        String expected2 = logicalClass.FindingUniq(list2);
        String actual2 = "Fedor";
        assertEquals(expected2, actual2);
    }
}