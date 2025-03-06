    import java.util.*;

class Bank {  
    public int acc_no;
    public float bal;
    public String name, address;

    void set(int acc_no, float bal, String name, String address) {
        this.acc_no = acc_no;
        this.bal = bal;
        this.name = name;
        this.address = address;
        show();
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Acc no: " + acc_no);
        System.out.println("Balance: " + bal);
        System.out.println("Address: " + address);
    }

    void bank(int ch, Scanner scanner) {
        switch (ch) {
            case 1:
                System.out.println("Enter amount you want to deposit: ");
                float deposit = scanner.nextFloat();
                if (deposit > 0) {
                    bal += deposit;
                    show();
                } else {
                    System.out.println("Invalid deposit amount. Must be positive.");
                }
                break;
            case 2:
                System.out.println("Enter amount you want to withdraw: ");
                float withdraw = scanner.nextFloat();
                if (withdraw > 0 && withdraw <= bal) {
                    bal -= withdraw;
                    show();
                } else if (withdraw > bal) {
                    System.out.println("Insufficient balance!");
                } else {
                    System.out.println("Invalid withdrawal amount. Must be positive.");
                }
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many users?");
        int use = scanner.nextInt();
        Bank[] ob = new Bank[use];
        int acc = 1000;

        for (int i = 0; i < use; i++) {
            scanner.nextLine();
            System.out.println("Enter Details of "+ ++i +" customer:");
            System.out.println("Enter name:");
            String name = scanner.nextLine();
            System.out.println("Enter Address:");
            String address = scanner.nextLine();
            System.out.println("Enter balance:");
            float balance = scanner.nextFloat();
            acc++;

            ob[i] = new Bank();
            ob[i].set(acc, balance, name, address);

            System.out.println("What do you want to do? 1. Deposit 2. Withdraw");
            int choice = scanner.nextInt();
            ob[i].bank(choice, scanner);
        }

        scanner.close();
    }
}
