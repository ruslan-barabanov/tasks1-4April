package listNameA1qa;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
            ListStream listStream = new ListStream();
            List<String> list= Arrays.asList("a1qa", "alpha", "sigma", "beta", "omega");
            listStream.stringStartA(list);
            listStream.stringAllUpperCase(list);
    }
}
