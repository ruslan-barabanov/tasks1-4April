package listNameA1qa;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListStream {

    public void stringStartA(List<String> list) {
        list.stream().filter(s -> s.startsWith("a"))
                .forEach(result -> System.out.print(result + " "));

        System.out.println();
    }

    public void stringAllUpperCase(List<String> list) {
        Set<String> upperCaseNames = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
        System.out.println(upperCaseNames);
    }

    public void changeObject(List<String> list) {
        Stream.concat(
                Stream.concat(
                        list.stream().limit(2),
                        Stream.of("auto")
                ), list.stream().skip(3)
        ).collect(Collectors.toList()).
                forEach(result -> System.out.print(result + " "));

        System.out.println();
    }

    public void abcReverse(List<String> list) {
        list.stream().sorted((o1, o2) -> -o1.compareTo(o2)).collect(Collectors.toList()).
                forEach(result -> System.out.print(result + " "));
    }
}
