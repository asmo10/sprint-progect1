package repl.it;

import java.util.Scanner;

public class _052TipCalculator {

	public static void main(String[] args) {
		
		boolean split;
		int nump; 
		double checkam, tip;
		String q;
		tip=0;
		nump=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("split or not");
		String sp = scan.next();
		split= sp.equalsIgnoreCase("yes");
		if (split) System.out.println("number of peaple?");
		if (split) nump=scan.nextInt();
		System.out.println("check amount?");
		checkam=scan.nextDouble();
		System.out.println("service quality?");
		q=scan.next();
		if(q.equalsIgnoreCase("poor")) tip=0.05;
		else if(q.equalsIgnoreCase("fair")) tip=0.1;
		else if(q.equalsIgnoreCase("good")) tip=0.15;
		else if(q.equalsIgnoreCase("grait")) tip=0.20;
		else if(q.equalsIgnoreCase("excellent")) tip=0.25;
		
		
		if (split) System.out.println("number of peaple "+nump);
		System.out.println("Total to pay " +(checkam+(checkam*tip)));
		System.out.println("Total tip " +checkam*tip);
		if (split) System.out.println("Total per person "+(checkam+checkam*tip)/nump);
			if (split) System.out.println("Tip per person "+checkam*tip/nump);

	
	}

}
