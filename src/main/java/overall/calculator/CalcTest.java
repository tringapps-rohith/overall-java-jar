package overall.calculator;

import java.util.*;
import java.util.logging.*;

public class CalcTest {
         private CalcTest() {
    throw new IllegalStateException("calctest class");
  }
        public static void run() {
                Logger l = Logger.getLogger("com.api.jar");

                Scanner sin = new Scanner(System.in);
                l.info("Enter first number\n");
                double a = sin.nextDouble();
                l.info("Enter second number\n");
                double b = sin.nextDouble();
                int ch;
                do {
                        l.info("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit\n");
                        l.info("Enter your choice\n");
                        ch = sin.nextInt();
                        switch (ch) {
                                case 1:
                                        Addition add = new Addition();

                                        add.setA(a);
                                        add.setB(b);
                                        l.log(Level.INFO, () -> "Addition of 2 numbers is... " + add.calculate());
                                        break;
                                case 2:
                                        Subtraction s = new Subtraction();

                                        s.setA(a);
                                        s.setB(b);
                                        l.log(Level.INFO, () -> "Subtraction of 2 numbers is... " + s.calculate());
                                        break;
                                case 3:
                                        Multiplication m = new Multiplication();

                                        m.setA(a);
                                        m.setB(b);
                                        l.log(Level.INFO, () -> "Multiplication of 2 numbers is... " + m.calculate());
                                        break;
                                case 4:
                                        Division d = new Division();

                                        d.setA(a);
                                        d.setB(b);
                                        l.log(Level.INFO, () -> "Multiplication of 2 numbers is... " + d.calculate());
                                        break;

                                case 5:
                                        l.info("Thank You\n");
                                        break;
                                default:
                                        l.info("Invalid Input\n");
                                        break;
                        }
                } while (ch != 5);
        }
}
