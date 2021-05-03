package bank;

public class Client {
    private String name;
    private int amountOfСredits;

    public Client(String name, int amountOfСredits) {
        this.name = name;
        this.amountOfСredits = amountOfСredits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountOfСredits() {
        return amountOfСredits;
    }

    public void setAmountOfСredits(int amountOfСredits) {
        this.amountOfСredits = amountOfСredits;
    }

    public void changeTypeClientAndGetHistory(int type, Client client, Bank bankHistory) {
        switch (type) {
            case 1:
                bankHistory.getClientHistoryCatalog().checkCreditHistory(ClientType.INDIVIDUAL, client);
                break;
            case 2:
                bankHistory.getClientHistoryCatalog().checkCreditHistory(ClientType.LEGALENTITY, client);
                break;
        }
    }
}
