package overall.main;

/**
 * Hello world!
 *
 */
import java.util.*;
import java.util.logging.*;
import overall.bank.Bank;
import overall.shape.Shapes;
import overall.student.Student;
import overall.DB.DBConnection;
import overall.coordinate.Coordinate;
import overall.credit.Credit;
import overall.studentGPA.StudentTest;
import overall.calculator.CalcTest;
import overall.contacklinkedlist.StudentList;
import overall.frequency.Frequency;
import overall.setmap.HashSets;
import overall.xo.XO;

public class App {

    public static void main(String[] args) throws Exception {

        Logger l = Logger.getLogger("com.api.jar");
        Scanner sin = new Scanner(System.in);
        int ch;
        do {
            l.info("\n1.Bank\n2.Shapes\n3.Student\n4.Data Base\n5.Coordinate\n6.Credit\n7.Sort GPA\n8.Calculator\n9.Contacts Linked List\n10.File Count\n11.Hast Tree Map and Set\n12.Tic-tac\n13.Exit\n");
            l.info("Enter your choice\n");
            ch = sin.nextInt();
            switch (ch) {
                case 1:
                    Bank.run();
                    break;
                case 2:
                    Shapes.run();
                    break;
                case 3:
                    Student.run();
                    break;
                case 4:
                    DBConnection.run();
                    break;
                case 5:
                    Coordinate.run();
                    break;
                case 6:
                    Credit.run();
                    break;
                case 7:
                    StudentTest.run();
                    break;
                case 8:
                    CalcTest.run();
                    break;
                case 9:
                    StudentList.run();
                    break;
                case 10:
                    Frequency.run();
                    break;
                case 11:
                    HashSets.run();
                    break;
                case 12:
                    XO.run();
                    break;
                case 13:
                    l.info("Thank you\n");
                    break;
                default:
                    l.info("Enter valid input\n");
                    break;
            }
        } while (ch != 13);

    }

}
