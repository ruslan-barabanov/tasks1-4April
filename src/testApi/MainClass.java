package testApi;

import java.util.Random;

public class MainClass {
    public static void main(String[] args) {
        Random rnd = new Random();
        int s = rnd.nextInt(6);
        System.out.println(s);
    }
}
