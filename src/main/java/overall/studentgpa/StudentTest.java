package overall.studentgpa;

import java.util.*;
import java.util.logging.*;

class StudentGPA {
        String name;
        int age;
        double gpa;

        public StudentGPA(String name, int age, double gpa) {
                this.name = name;
                this.age = age;
                this.gpa = gpa;
        }

        public StudentGPA() {
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getName() {
                return this.name;
        }

        public void setAge(int age) {
                this.age = age;
        }

        public int getAge() {
                return this.age;
        }

        public void setGPA(double gpa) {
                this.gpa = gpa;
        }

        public double getGPA()

        {
                return this.gpa;
        }

        public String toString() {
                return this.name + " " + this.age + " " + this.gpa;
        }
}

public class StudentTest {
        public static void run() {
                Scanner sin = new Scanner(System.in);
                Logger l = Logger.getLogger("com.api.jar");
                l.info("Enter the no of students\n");
                int n = sin.nextInt();
                StudentGPA[] s = new StudentGPA[n];
                for (int i = 0; i < n; i++) {
                        int res = i + 1;
                        l.info("\nStudent " + res + " details\n");
                        s[i] = new StudentGPA();
                        l.info("Enter name :");
                        String name = sin.next();
                        s[i].setName(name);
                        l.info("Enter age :");
                        int age = sin.nextInt();
                        s[i].setAge(age);
                        l.info("Enter GPA :");
                        double gpa = sin.nextDouble();
                        s[i].setGPA(gpa);
                }
                for (int i = 0; i < n; i++) {
                        int res = i + 1;
                        l.log(Level.INFO, () -> "\n\nStudent " + res + " details");
                        String d1 = "\nName :" + s[i].getName() + "\nAge :" + s[i].getAge() + "\nGPA :" + s[i].getGPA();
                        l.info(d1);
                }

                ArrayList<StudentGPA> al = new ArrayList<StudentGPA>();
                for (int i = 0; i < n; i++) {
                        StudentGPA a = s[i];
                        al.add(a);
                }
                Collections.sort(al, new Comparator<StudentGPA>() {
                        public int compare(StudentGPA s1, StudentGPA s2) {
                                if (s1.getGPA() < s2.getGPA()) {
                                        return 1;
                                } else if (s1.getGPA() == s2.getGPA()) {
                                        return 0;
                                }
                                return -1;
                        }
                });
                l.info("\nStudents sorted by their GPA");
                for (int j = 0; j < n; j++) {
                        int res = j + 1;
                        String s12 = " " + al.get(j);
                        l.info(s12);
                }

        }
}
