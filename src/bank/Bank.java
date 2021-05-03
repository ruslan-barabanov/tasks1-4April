package bank;

public class Bank {

    ClientHistoryCatalog clientHistoryCatalog = new ClientHistoryCatalog();

    public ClientHistoryCatalog getClientHistoryCatalog() {
        return clientHistoryCatalog;
    }

    class ClientHistoryCatalog {

        double a;

        void checkCreditHistory(ClientType clientType, Client client) {


            System.out.println("Dear Customer: " + client.getName());
            switch (clientType) {
                case INDIVIDUAL:
                    if (0 < client.getAmountOfСredits() && client.getAmountOfСredits() <= 3) {
                        a = Math.random() * 4;
                        if (client.getAmountOfСredits() <= a && a <= 4) {
                            System.out.println("Loan approved + ");
                            client.setAmountOfСredits(client.getAmountOfСredits() + 1);
                        } else {
                            System.out.println("Loan denied - ");
                        }
                        break;
                    }

                case LEGALENTITY:
                    if (0 < client.getAmountOfСredits() && client.getAmountOfСredits() <= 6.66) {
                        a = Math.random() * 6.66;
                        if (client.getAmountOfСredits() <= a && a <= 6.66) {
                            System.out.println("Loan approved + ");
                            client.setAmountOfСredits(client.getAmountOfСredits() + 1);
                        } else {
                            System.out.println("Loan denied - ");
                        }
                        break;
                    }

                default:
                    throw new RuntimeException("Incorrect client type");
//                }
//            System.out.println("Dear Customer: " + client.getName());
//            if (clientType == ClientType.LEGALENTITY) {
//                if (client.getAmountOfСredits() == 1) {
//                    a = Math.random() * 4;
//                    if (1 <= a && a <= 4) {
//                        System.out.println("Loan approved + ");
//
//                    } else {
//                        System.out.println("Loan denied - ");
//                    }
//                }
//                if (client.getAmountOfСredits() == 0) {
//                    System.out.println("Loan approved + ");
//                }
//                if (client.getAmountOfСredits() == 2) {
//                    a = Math.random() * 4;
//                    if (2 <= a && a <= 4) {
//                        System.out.println("Loan approved + ");
//                    } else {
//                        System.out.println("Loan denied - ");
//                    }
//                }
//                if (client.getAmountOfСredits() == 3) {
//                    a = Math.random() * 4;
//                    if (3 <= a && a <= 4) {
//                        System.out.println("Loan approved + ");
//                    } else {
//                        System.out.println("Loan denied - ");
//                    }
//                }
//                if (client.getAmountOfСredits() > 3) {
//                    System.out.println("Loan denied - ");
//                }
//            }
//            if (clientType == ClientType.INDIVIDUAL) {
//                if (client.getAmountOfСredits() == 1) {
//                    a = Math.random() * 6.66;
//                    if (1 <= a && a <= 6.66) {
//                        System.out.println("Loan approved + ");
//                    } else {
//                        System.out.println("Loan denied - ");
//                    }
//                }
//                if (client.getAmountOfСredits() == 0) {
//                    System.out.println("Loan approved + ");
//                }
//                if (client.getAmountOfСredits() == 2) {
//                    a = Math.random() * 6.66;
//                    if (2 <= a && a <= 6.66) {
//                        System.out.println("Loan approved + ");
//                    } else {
//                        System.out.println("Loan denied - ");
//                    }
//                }
//                if (client.getAmountOfСredits() == 3) {
//                    a = Math.random() * 6.66;
//                    if (3 <= a && a <= 6.66) {
//                        System.out.println("Loan approved + ");
//                    } else {
//                        System.out.println("Loan denied - ");
//                    }
//                }
//                if (client.getAmountOfСredits() == 4) {
//                    a = Math.random() * 6.66;
//                    if (4 <= a && a <= 6.66) {
//                        System.out.println("Loan approved + ");
//                    } else {
//                        System.out.println("Loan denied - ");
//                    }
//                }
//                if (client.getAmountOfСredits() == 5) {
//                    a = Math.random() * 6.66;
//                    if (5 <= a && a <= 6.66) {
//                        System.out.println("Loan approved + ");
//                    } else {
//                        System.out.println("Loan denied - ");
//                    }
//                }
//                if (client.getAmountOfСredits() == 6) {
//                    a = Math.random() * 6.66;
//                    if (6 <= a && a <= 6.66) {
//                        System.out.println("Loan approved + ");
//                    } else {
//                        System.out.println("Loan denied - ");
//                    }
//                }
//                if (client.getAmountOfСredits() > 6) {
//                    System.out.println("Loan denied - ");
//                }
            }
        }
    }
}
