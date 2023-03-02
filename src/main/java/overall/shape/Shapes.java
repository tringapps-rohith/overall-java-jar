package overall.shape;

import java.util.*;
import java.util.logging.*;

public class Shapes {
        /**
         * 
         */
        public void display()
        {
                return "Shapes class";
        }
        public static void run() {
                int ch = 5;
                Scanner sin = new Scanner(System.in);
                Logger l = Logger.getLogger("com.api.jar");
                try {
                        do {

                                l.info("\n1.Rectangle\n2.Circle\n3.Triangle\n4.Exit\n");
                                l.info("Enter your choice\n");
                                ch = sin.nextInt();

                                switch (ch) {
                                        case 1:
                                                double le;
                                                double b;
                                                l.info("Enter length and breadth\n");
                                                le = sin.nextDouble();
                                                b = sin.nextDouble();
                                                Rectangle r = new Rectangle(le, b);
                                                l.log(Level.INFO, () -> "\nArea of Rectangle :" + r.area());
                                                l.log(Level.INFO, () -> "\nPerimeter of Rectangle :" + r.perimeter());
                                                break;
                                        case 2:
                                                double ra;
                                                l.info("Enter radius\n");
                                                ra = sin.nextDouble();
                                                Circle c = new Circle(ra);
                                                l.log(Level.INFO, () -> "\nArea of Circle :" + c.area());
                                                l.log(Level.INFO, () -> "\nPerimeter of Circle :" + c.perimeter());
                                                break;
                                        case 3:
                                                double a;
                                                double br;
                                                double c1;
                                                double h;
                                                l.info("\nEnter height and breadth\n");
                                                h = sin.nextDouble();
                                                br = sin.nextDouble();
                                                l.info("\nEnter side a and c\n");
                                                a = sin.nextDouble();
                                                c1 = sin.nextDouble();
                                                Triangle t = new Triangle(a, br, c1, h);
                                                l.log(Level.INFO, () -> "\nArea of Triangle :" + t.area());
                                                l.log(Level.INFO, () -> "\nPerimeter of Traingle :" + t.perimeter());
                                                break;
                                        default:
                                                if (ch != 4) {
                                                        l.info("Enter valid input\n");
                                                }
                                                break;
                                }

                        } while (ch != 4);
                } catch (InputMismatchException e) {
                        l.log(Level.INFO, () -> "Error Occur :" + e);
                }
        }
}
