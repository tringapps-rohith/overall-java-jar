package overall.DB;

/**
 
 *
 */
import java.sql.*;
import java.util.*;
import java.util.logging.Logger;

public class DBConnection {
	String hostAdd;
	String username;
	String password;
	Logger l = Logger.getLogger("com.api.jar");

	private DBConnection(String hostAdd, String username, String password) {
		this.hostAdd = hostAdd;
		this.username = username;
		this.password = password;
	}

	public static DBConnection getInstance(String hostAdd, String username, String password) {
		return new DBConnection(hostAdd, username, password);
	}

	Connection conn;
	Statement st;
	ResultSet rs;

	void connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(hostAdd, username, password);
			l.info("Connection Established successfully");
			st = conn.createStatement();
			rs = st.executeQuery("select * from student");
			l.info("\nId\t\tName\tCollege");
			while (rs.next()) {
				String s = "rs.getString(1)+\"\\t\\t\"+rs.getString(2)+\"\\t\"+rs.getString(3)";
				l.info(s);
			}
		} catch (Exception e) {
			l.info("Connection failed exception");
		}
	}

	void Close() {
		try {

			rs.close();
			st.close();
			conn.close();
			l.info("Connection Closed....");
		} catch (Exception e) {
			l.info("Connection unable to close exception");
		}
	}

	public static void run() {
		Scanner sin = new Scanner(System.in);
		Logger l = Logger.getLogger("com.api.jar");
		l.info("Enter Host address : ");
		String hostAdd = sin.next();
		l.info("Enter Database Name : ");
		String username = sin.next();
		l.info("Enter password : ");
		String password = sin.next();

		int ch;
		DBConnection d = DBConnection.getInstance(hostAdd, username, password);
		do {
			l.info("\n1.Connection\n2.Close Connection\n3.Exit\n");
			l.info("Enter your choice\n");
			ch = sin.nextInt();
			switch (ch) {
				case 1:

					d.connect();
					break;
				case 2:
					d.Close();
					break;
				default:
					l.info("Enter correct choice\n");
					break;
			}
		} while (ch != 3);
	}
}