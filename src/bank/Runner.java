package bank;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter customer name: ");
        String name = sc.nextLine();

        System.out.println("Enter amount of credits: ");
        while (!sc.hasNextInt()) {
            System.out.println("Enter integer, please!");
            sc.nextLine();
        }
        int amountOfCredits = sc.nextInt();
        System.out.println("Enter ClientType (1 = INDIVIDUAL), (2 = LEGALENTITY): ");

        int type = sc.nextInt();
        Client client = new Client(name, amountOfCredits);
        Bank bankHistory = new Bank();
        client.changeTypeClientAndGetHistory(type, client, bankHistory);
        sc.close();
    }
}
