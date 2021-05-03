package mapProject;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Integer, Integer> myHashMap = new HashMap<>();
        Map<Integer, Integer> myHashMapResult = new HashMap<>();
        Random generator = new Random();

        for (int i = 0; i <= 100; i++) {
            int num = generator.nextInt(99) + 1;
            myHashMap.put(i, num);
        }

        for (Map.Entry<Integer, Integer> entry : myHashMap.entrySet()) {
            int val = entry.getValue();
            int count = myHashMapResult.getOrDefault(val, 0);
            myHashMapResult.put(val, count + 1);
        }

        List<Integer> list = new ArrayList<Integer>();
        int maxValue = Collections.max(myHashMapResult.values());
        for (Map.Entry<Integer, Integer> entry : myHashMapResult.entrySet()) {
            if (entry.getValue() == maxValue) {
                list.add(entry.getKey());

            }
        }

        for (Integer item : list) {
            System.out.print(item + " ");
        }
        System.out.format("повторяется %d раз\n", maxValue);
    }
}
