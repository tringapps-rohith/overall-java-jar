package overall.bank;

import java.util.*;
import java.util.logging.Logger;
import java.util.logging.*;

public class Bank {
        Logger l = Logger.getLogger("com.api.jar");
        private String name;
        private int accno;
        private double balance;

        public Bank() {
        }

        public Bank(String name, int accno, double balance) {
                this.name = name;
                this.accno = accno;
                this.balance = balance;
        }

        public void withDraw(double amount) {

                this.balance -= amount;

        }

        public void deposit(double amount) {
                this.balance += amount;

        }

        public double balance() {
                return this.balance;
        }

        public static void run() {
                Scanner sin = new Scanner(System.in);
                Logger l = Logger.getLogger("com.api.jar");
                try {
                        l.info("Enter username\n");
                        String name = sin.next();
                        l.info("Enter account no\n");
                        int accno = sin.nextInt();
                        l.info("Enter your amount that your account has\n");
                        double balance = sin.nextDouble();

                        double amount;
                        int ch = 5;
                        Bank b = new Bank(name, accno, balance);
                        do {
                                l.info("\n1.User Details\n2.Deposit\n3.Withdrawl\n4.Check Balance\n5.Exit\n");
                                l.info("Enter your choice\n");
                                ch = sin.nextInt();
                                double res;
                                switch (ch) {
                                        case 1:
                                                res = b.balance();
                                                l.log(Level.INFO, () -> "Username: " + name + "\nAccount no: " + accno
                                                                + "\nAmount: " + res);
                                                break;
                                        case 2:
                                                l.info("Enter the amount to be deposit\n");
                                                amount = sin.nextDouble();
                                                if (amount < 100) {

                                                        l.info("Minimum deposit is Rs.100. So, your deposit failed");
                                                } else {
                                                        b.deposit(amount);
                                                        res = b.balance();
                                                        l.log(Level.INFO, () -> "Your total amount is... " + res);
                                                }
                                                break;
                                        case 3:
                                                l.info("Enter the amount to be withdrawl\n");
                                                amount = sin.nextDouble();
                                                try {
                                                        if (b.balance() > amount && amount > 100) {

                                                                b.withDraw(amount);
                                                                l.log(Level.INFO, () -> "Your current balance is... "
                                                                                + b.balance());
                                                        } else {
                                                                l.info("Amount cant be withdrawl");

                                                        }
                                                } catch (InputMismatchException e) {
                                                        l.log(Level.INFO, () -> "Error occur: " + e);
                                                }

                                                break;
                                        case 4:
                                                res = b.balance();
                                                l.log(Level.INFO, () -> "Balance is... " + res);
                                                break;
                                        case 5:
                                                l.info("Thank you");
                                                break;
                                        default:
                                                l.info("Enter valid input");
                                                break;
                                }
                        } while (ch != 5);
                } catch (InputMismatchException e) {
                        l.info("Input Mismatched Exception\n");
                }
        }
}