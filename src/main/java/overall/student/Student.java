package overall.student;

import java.util.*;
import java.util.logging.*;

public class Student {
        Logger l = Logger.getLogger("com.api.jar");

        private String name;
        private String grade;
        private double gpa;

        public Student() {
        }

        public Student(String name, String grade, double gpa) {
                this.name = name;
                this.grade = grade;
                this.gpa = gpa;
        }

        public double updateGPA(double newgpa) {
                this.gpa = newgpa;
                return this.gpa;
        }

        public void display() {
                String disp = "\nStudent name: " + name + "\nGrade: " + grade + "\nCurrent GPA: " + gpa;
                l.info(disp);
        }

        /**
         * 
         */
        public static void run() {
                Scanner sin = new Scanner(System.in);
                Logger l = Logger.getLogger("com.api.jar");
                try {
                        l.info("Enter name\n");
                        String name = sin.next();
                        l.info("Enter grade\n");
                        String grade = sin.next();
                        l.info("Enter GPA\n");
                        double gpa = sin.nextDouble();
                        Student s = new Student(name, grade, gpa);
                        s.display();
                        l.info("\nEnter the GPA to update\n");
                        double newgpa = sin.nextDouble();
                        s.updateGPA(newgpa);

                        s.display();
                        String finaldisp = "\n" + name + " has a " + s.updateGPA(newgpa) + " GPA";
                        l.info(finaldisp);
                } catch (InputMismatchException e) {
                        l.info("Input MisMatch Exception");
                }
        }
}
