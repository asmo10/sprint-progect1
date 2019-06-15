package repl.it;

import java.util.Scanner;

public class _092_ParseJSONFile {

	public static void main(String[] args) {

	    Scanner scan = new Scanner(System.in);
			String json = scan.nextLine();

		String fname="";
//		int fnameind=json.indexOf(("firstName"));
//		System.out.println(fnameind);
		fname=json.substring(json.indexOf("firstName")+11,json.indexOf("lastName")-3);
//		System.out.println(fname);
		fname=fname.trim();
		fname=fname.replaceAll("\"","");

		String lname="";
		
		int lnameind=json.indexOf(("lastName"));
		lname=json.substring(json.indexOf("lastName")+10,json.indexOf("role")-3);
//		System.out.println(lname);

		lname=lname.trim();
		lname=lname.replaceAll("\"","");
		
		System.out.println("First name: "+fname);
		System.out.println("Last name: "+lname);

		
//		{"id": 1934, "firstName": "James", "lastName": "May", "role": "student-team-member"}
		
		
	}

}
