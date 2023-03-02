package overall.xo;

import java.util.*;
import java.util.logging.*;

public class XO {
	Logger l = Logger.getLogger("com.api.jar");

	String[][] a;

	void initial(String[][] a) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = "_";
			}
		}
	}

	void display(String[][] a) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				l.info(a[i][j] + " ");
			}
			l.info("\n");
		}
	}

	int diagonal(String[][] a, String sym) {
		int count1 = 0;
		int count2 = 0;

		for (int i = 0; i < 3; i++) {
			if (a[i][i].equals(sym)) {
				count1++;
			}
			if (a[i][2 - i].equals(sym)) {
				count2++;
			}
		}
		if (count1 == 3 || count2 == 3) {
			return 1;
		}

		return -1;
	}

	int horizontal(String[][] a, String sym) {
		int count1 = 0;
		for (int i = 0; i < 3; i++) {
			count1 = 0;
			for (int j = 0; j < 3; j++) {
				if (a[i][j].equals(sym) && count1 < 3) {
					count1++;
					if (count1 == 3) {
						return 1;
					}
				} else {
					break;
				}
			}
		}

		return -1;
	}

	int vertical(String[][] a, String sym) {
		int count1 = 0;
		for (int i = 0; i < 3; i++) {
			count1 = 0;
			for (int j = 0; j < 3; j++) {
				if (a[j][i].equals(sym) && count1 < 3) {
					count1++;
					if (count1 == 3) {
						return 1;
					}
				} else {
					break;
				}
			}
		}

		return -1;
	}

	public static void run() {
		Logger l = Logger.getLogger("com.api.jar");

		Scanner sin = new Scanner(System.in);
		XO x = new XO();
		String[][] a = new String[3][3];
		x.initial(a);
		x.display(a);
		int count = 0;
		int stop = 1;
		while (stop==1) {
			l.info("User 1:Enter the position(1-9)\n");

			int u1 = sin.nextInt();

			int i1 = (u1 - 1) / 3;
			int j1 = (u1 - 1) % 3;

			a[i1][j1] = "X";
			count += 1;

			int diares1 = x.diagonal(a, "X");
			int hrres1 = x.horizontal(a, "X");
			int vres1 = x.vertical(a, "X");
			if (diares1 == 1 || hrres1 == 1 || vres1 == 1 && stop == 1) {

				x.display(a);
				l.info("Player 1 wins\n");
				stop=0;
			} else if (count == 9 && stop == 1) {

				x.display(a);
				l.info("Draw");
				stop=0;
			}
			if(stop!=0)
			{
			l.info("User 2:Enter the position\n");
			int u2 = sin.nextInt();

			int i2 = (u2 - 1) / 3;
			int j2 = (u2 - 1) % 3;

			a[i2][j2] = "O";
			count += 1;

			int diares2 = x.diagonal(a, "O");
			int hrres2 = x.horizontal(a, "O");
			int vres2 = x.vertical(a, "O");

			if (diares2 == 1 || hrres2 == 1 || vres2 == 1 && stop == 1) {
				x.display(a);
				l.info("Player 2 wins\n");
				stop=0;
			}
			x.display(a);
			}
		}
	}
}
