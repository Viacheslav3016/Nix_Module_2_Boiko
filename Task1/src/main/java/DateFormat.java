import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class DateFormat implements DateI {
    public static final String DATE_FORMAT1 = "dd/MM/yyyy";
    public static final String DATE_FORMAT2 = "MM-dd-yyyy";
    public static final String DATE_FORMAT3 = "yyyy/MM/dd";
    public static final String DATE_FORMAT_OUTPUT = "yyyyMMdd";
    @Override
    public String DateFormatMethod(List<String> list) {
            DateTimeFormatter outputFormat1 = DateTimeFormatter.ofPattern(DATE_FORMAT_OUTPUT);
            DateTimeFormatter inputFormat1 = DateTimeFormatter.ofPattern(DATE_FORMAT1);
            LocalDate localDate = LocalDate.parse(list.get(0), inputFormat1);
            String date1 = localDate.format(outputFormat1);

            DateTimeFormatter inputFormat2 = DateTimeFormatter.ofPattern(DATE_FORMAT2);
            LocalDate localDate2 = LocalDate.parse(list.get(1), inputFormat2);
            String date2 = localDate2.format(outputFormat1);

            DateTimeFormatter inputFormat3 = DateTimeFormatter.ofPattern(DATE_FORMAT3);
            LocalDate localDate3 = LocalDate.parse(list.get(2), inputFormat3);
            String date3 = localDate3.format(outputFormat1);

            return StringJoining(date1,date2,date3);
    }
    public String StringJoining(String str1, String str2, String str3){
        List<String> list1 = Arrays.asList(str1, str2, str3);
        String str = String.join(" ", list1);
        System.out.println(str);
        return str;
    }
}


