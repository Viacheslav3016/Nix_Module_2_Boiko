import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DateFormatTest {

    @Test
    void dateFormatMethod() {
        DateFormat dateFormat = new DateFormat();
        List<String> list1 = Arrays.asList("05/04/2022", "04-05-2022", "2022/04/05");
        String expected = dateFormat.DateFormatMethod(list1);
        String actual = "20220405 20220405 20220405";
        assertEquals(expected, actual);

        List<String> list2 = Arrays.asList("01/02/2002", "02-01-2002", "2002/02/01");
        String expected2 = dateFormat.DateFormatMethod(list2);
        String actual2 = "20020201 20020201 20020201";
        assertEquals(expected2, actual2);
    }

    @Test
    void stringJoining() {
    }
}