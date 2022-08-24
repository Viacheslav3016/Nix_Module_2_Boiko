import java.util.HashSet;
import java.util.List;

public class LogicalClass implements FindingUniqElements {
    private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(LogicalClass.class.getSimpleName());
    @Override
    public String FindingUniq(List<String> list) {
        HashSet<String> uniqName = new HashSet<>(list);
        for (String i: uniqName) {
            if (uniqName.contains(i)){
                System.out.println(i);
                return i;
            }
            logger.info("Уникальный элемент найден - " + i);
        }
        return null;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
