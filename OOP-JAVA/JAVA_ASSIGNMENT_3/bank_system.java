import java.util.Scanner;

class account {

    // account details
    long acc_no;
    String name;
    double balance;

    // static variable to track total accounts
    static int totalaccount = 0;

    // constructor
    account(long a, String n, double bal) {
        acc_no = a;
        name = n;
        balance = bal;
        totalaccount++;

        // account creation message
        System.out.println("\n account " + totalaccount + " created");
    }

    // deposit through cash
    double deposit(double amt) {
        System.out.println("deposit through cash");
        System.out.println("balance before deposit:- " + balance);
        balance = balance + amt;
        return balance;
    }

    // withdraw through cash
    double withdraw(double amt) {
        System.out.println("withdraw through cash mode");

        if (balance < amt) {
            return 0;   // insufficient balance
        } else {
            balance = balance - amt;
            return balance;
        }
    }

    // deposit through online (method overloading)
    double deposit(double amt, String online) {
        System.out.println("deposit through " + online);
        System.out.println("balance before deposit:- " + balance);
        balance = balance + amt;
        return balance;
    }

    // withdraw through online (method overloading)
    double withdraw(double amt, String online) {
        System.out.println("withdraw through " + online + " mode");

        if (balance < amt) {
            return 0;  // insufficient balance
        } else {
            balance = balance - amt;
            return balance;
        }
    }

    // display account details
    void display() {
        System.out.println("account details:-");
        System.out.println("account number:- " + acc_no);
        System.out.println("account holder name:- " + name);
        System.out.println("account balance:- " + balance);
    }
}

class bak_system {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // number of accounts
        System.out.print("enter size of account system:- ");
        int n = sc.nextInt();

        account acc[] = new account[n];

        for (int i = 0; i < n; i++) {

            System.out.println("enter account details");

            System.out.print("\nenter account number:- ");
            long a = sc.nextLong();
            sc.nextLine();

            System.out.print("enter account holder name:- ");
            String nam = sc.nextLine();

            System.out.print("enter account balance:- ");
            double bal = sc.nextDouble();

            // create account object
            acc[i] = new account(a, nam, bal);

            // display initial details
            acc[i].display();

            sc.nextLine();

            // deposit mode
            System.out.print("\nenter mode of deposition online or cash:- ");
            String mode = sc.nextLine();

            System.out.print("\nenter deposit amount:- ");
            double d = sc.nextDouble();

            // deposit based on mode
            if (mode.equalsIgnoreCase("cash")) {
                System.out.println("account balance after deposit:- " + acc[i].deposit(d));
            } else {
                System.out.println("account balance after deposit:- " + acc[i].deposit(d, mode));
            }

            sc.nextLine();

            // withdraw mode
            System.out.print("\nenter mode of withdrawal online or cash:- ");
            String mode1 = sc.nextLine();

            System.out.print("\nenter amount to withdraw:- ");
            double w = sc.nextDouble();

            // withdraw based on mode
            double withdraw;

            if (mode1.equalsIgnoreCase("cash")) {
                withdraw = acc[i].withdraw(w);
            } else {
                withdraw = acc[i].withdraw(w, mode1);
            }

            // check insufficient balance
            if (withdraw != 0.0)
                System.out.println("account balance after withdraw:- " + withdraw);
            else
                System.out.println("insufficient balance");
        }

        // total accounts created
        System.out.println("total accounts created:- " + account.totalaccount);

        sc.close();
    }
}