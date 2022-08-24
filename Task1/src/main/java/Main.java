import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("05/04/2022");
        list.add("04-05-2022");
        list.add("2022/04/05");
        list.add("2022.04.05");
        DateFormat dateFormat = new DateFormat();
        dateFormat.DateFormatMethod(list);
    }
}
