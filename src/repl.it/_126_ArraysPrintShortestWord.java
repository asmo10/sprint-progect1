package repl.it;
import java.util.Scanner;

public class _126_ArraysPrintShortestWord {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String[] str = { scan.next(), scan.next(), scan.next(), scan.next(), scan.next(), scan.next() };

		String minW = str[0];
		for (int i = 1; i < str.length; i++) {
			int m = str[i].length();
			if (str[i].length() < minW.length())
				minW = str[i];

		}
		System.out.println(minW);
	}
}
