
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
         final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Main.class.getSimpleName());
        logger.info("Start of the programm");
        LogicalClass logicalClass = new LogicalClass();
        List<String> list = Arrays.asList("Dima", "Masha", "Slava", "Nick", "Oleg", "Masha", "Marina", "Slava", "Marina");
        logicalClass.FindingUniq(list);
        logger.info("end of the programm");
    }
}
