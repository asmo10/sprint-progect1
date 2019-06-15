package repl.it;

import java.util.Scanner;

public class _074SMSmessage {

	public static void main(String[] args) {


	    Scanner scan = new Scanner(System.in);
	    String message=scan.nextLine();
	    String sender;
	    String phoneNumber;
	    String messageBody;

	    //Sender:"<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}"

	   
	    int firstVariable = message.indexOf("<");
	    int secondVariable = message.indexOf(">");
	    int thirdVariable = message.indexOf("[");
	    int fourthdVariable = message.indexOf("]");
	    int fifthVariable = message.indexOf("{");
	    int sixthdVariable = message.indexOf("}");
	    sender = "" + message.substring(firstVariable+1,secondVariable);
	    phoneNumber = "" + message.substring(thirdVariable+1,fourthdVariable);
	    messageBody = "" + message.substring(fifthVariable+1,sixthdVariable);
	    
	    System.out.println("Sender: "+sender);
	    System.out.println("Phone Number: "+phoneNumber);
	    System.out.println("Message body: "+messageBody);

	}

}
