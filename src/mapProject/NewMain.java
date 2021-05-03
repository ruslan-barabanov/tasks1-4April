package mapProject;

import java.util.*;

public class NewMain {

    public static void main(String[] args) {

        Map<Integer, Integer> myHashMap = new HashMap<>();

        int occurency = 1;
        for (int i = 1; i <= 100; i++) {
            int value = new Random().nextInt(i);
            if (myHashMap.containsKey(value)) {
                myHashMap.put(value, myHashMap.get(value) + 1);
            } else {
                myHashMap.put(value, occurency);
            }
        }
        System.out.println(myHashMap);

        int maxValue = Collections.max(myHashMap.values());
        for (Map.Entry<Integer, Integer> entry : myHashMap.entrySet()) {
            if (entry.getValue() == maxValue) {
                System.out.print(entry.getKey()+" ");
                System.out.format("повторяется %d раз\n", maxValue);
            }
        }
    }
}