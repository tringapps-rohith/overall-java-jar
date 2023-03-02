package overall.coordinate;

import java.util.*;
import java.util.logging.*;

public class Coordinate implements cloneable {
        private String x;
        private String y;

        public Coordinate(String x, String y) {
                this.x = x;
                this.y = y;
        }

        public Coordinate() {
        }

        public boolean check(String x1, String y1) {
                return x.equals(x1) && y.equals(y1);
        }

        public Object cloning() throws CloneNotSupportedException {
                return super.cloneable();
        }

        public static void run() throws CloneNotSupportedException {
                Scanner sin = new Scanner(System.in);
                Logger l = Logger.getLogger("com.api.jar");
                try {
                        l.info("Enter x1 coordinate\n");
                        String x = sin.next();
                        l.info("Enter y1 coordinate\n");
                        String y = sin.next();
                        Coordinate c = new Coordinate(x, y);
                        Coordinate c1 = (Coordinate) c.clone();
                        l.info("Enter x2 and y2 coordinates\n");
                        String x1 = sin.next();
                        String y1 = sin.next();
                        boolean res = c1.check(x1, y1);
                        String output = Boolean.toString(res);
                        l.log(Level.INFO, () -> output);
                } catch (InputMismatchException e) {
                        l.log(Level.INFO, () -> "Error Occur :" + e);
                }

        }
}
