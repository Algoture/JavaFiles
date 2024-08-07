import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class AtmJava {
    static Scanner sc = new Scanner(System.in);
    Map<Double, String> state = new HashMap<>();
    String name;
    Long mobNo;
    static int newPin;
    static double amount;
    static int tries = 1, k = 0;

    
    public void statement() {
        System.out.println("========|Statement|========");
        for (Map.Entry<Double, String> m : state.entrySet()) {
            System.out.println(m.getKey() + "" + m.getValue());
        }
    }
    public void createAccount() {
        System.out.print("ENTER YOUR NAME:");
        name = sc.nextLine();
        sc.nextLine();
        System.out.println();
        System.out.print("ENTER YOUR MOBILE NUMBER:");
        mobNo = sc.nextLong();
        System.out.println();
        System.out.print("SET A PIN FOR YOUR ACCOUNT:");
        newPin = sc.nextInt();
        System.out.println();
        System.out.println("\nYOUR ACCOUNT HAS BEEN SUCCESSFULLY CREATED\n");
        System.out.println(
                "____________________________________________________________________________________________________");
        System.out.print("ENTER AMOUNT YOU WANT TO DEPOSIT:");
        amount = sc.nextInt();
        state.put(amount, " Initial Balance");
        System.out.println("YOUR ACCOUNT BALANCE IS:" + amount);
        System.out.println(
                "____________________________________________________________________________________________________");
    }

    public void accountProcess() {
        while (tries <= 3) {
            System.out.print("\n\nENTER YOUR SECRET PIN:");
            int pin = sc.nextInt();
            System.out.println();
            tries++;
            if (pin == newPin && tries <= 3) {
                do {
                    System.out.println("\t\t##### YOUR ACCOUNT #####\n");
                    System.out.print(
                            "1.CHECK ACCOUNT BALANCE\n2.DEPOSIT CASH\n3.WITHDRAW CASH\n4.Statement\n5.Exit\nENTER YOUR CHOICE:");
                    int transaction_Type = sc.nextInt();
                    System.out.println(
                            "____________________________________________________________________________________________________");
                    if (transaction_Type == 1) {
                        System.out.println("\nYOUR ACCOUNT BALANCE IS:" + amount);
                    } else if (transaction_Type == 2) {
                        System.out.print("\nENTER AMOUNT TO DEPOSIT:");
                        Double deposit = sc.nextDouble();
                        state.put(deposit, " Amount Deposited");
                        amount += deposit;
                        System.out.println("\nYOUR ACCOUNT BALANCE IS:" + amount);
                        
                    } else if (transaction_Type == 3) {
                        System.out.print("\nENTER AMOUNT TO WITHDRAW:");
                        Double withdraw = sc.nextDouble();
                        state.put(withdraw," Amount Withdrawn");
                        amount -= withdraw;
                        System.out.println("\nYOUR ACCOUNT BALANCE IS:" + amount);
                    } else if (transaction_Type == 4) {
                        statement();
                    } else if (transaction_Type == 5) {
                        System.out.println("\nTHANK YOU FOR USING OUR ATM SERVICE\n");
                        System.exit(0);
                    } else {
                        System.out.println("PLEASE ENTER A VALID OPTION...\n");
                        continue;
                    }

                    System.out.println(
                            "____________________________________________________________________________________________________");
                    System.out.print("\nDO YOU WANT TO CONTINUE THE TRANSACTION?\n1.YES\n2.NO\nENTER YOUR CHOICE:");
                    int transaction = sc.nextInt();
                    if (transaction == 2) {
                        k++;
                    }
                } while (k != 1);
                {
                    System.out.println("\nTHANK YOU FOR USING OUR ATM SERVICE\n");
                    System.exit(0);
                }
            } else if (pin != 1201 && tries <= 3) {
                System.out.println("\nPLEASE TRY AGAIN");
            } else {
                System.out.println("INCORRECT PIN.YOUR ACCOUNT WILL BE BLOCKED FOR 24 HOURS\n\n");
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        AtmJava atm = new AtmJava();

        System.out.println(
                "____________________________________________________________________________________________________");
        System.out.println("\n\t\t##### WELCOME #####");
        System.out.println(
                "____________________________________________________________________________________________________");
        System.out.println("CREATE A NEW ACCOUNT.\n");
        System.out.print(
                "1.CREATE ACCOUNT IN SAVINGS ACCOUNT\n\n2.CREATE ACCOUNT IN CURRENT ACCOUNT\n\nENTER YOUR CHOICE:");
        int createAccountChoice = sc.nextInt();
        if (createAccountChoice == 1) {
            System.out.println("\nCREATE SAVINGS ACCOUNT\n");
            atm.createAccount();
            atm.accountProcess();
        } else if (createAccountChoice == 2) {
            System.out.println("\nCREATE CURRENT ACCOUNT\n");
            atm.createAccount();
            atm.accountProcess();
        } else {
            System.out.println("PLEASE ENTER A VALID OPTION");
        }
    }
}