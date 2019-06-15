package package1;

public class Class1 {

	public static void main(String[] args) {
//		int a = 10, b=20, c=30;
//		String name1 = "Adem", name2="Jill", name3="Odi";
//		// new line in printing statement \n
//		System.out.println(name1 
//				+"\n"+name2
//				+"\n"+name3);
		double m=500;
		double c=4.99;
		double r=0.99;
		double b=350;

				String name=" Arto";
				String lastName=" Smarto ";
				String sentence1="The account holder";
				String sentcombo1= sentence1 + name + lastName + "has" + " "+ m + " in personal bank account.";
				String morning=" In the morning he bought a candy for "+c
						+" than he recieved "+ r
						+" rebate."+"\n"+" Next morning he bought a bike for "+b;
				String final2="How mach "+name+" still has in his account in the end of the day?";
				String ans= "Answer:";
				
				
						
				System.out.println(sentcombo1+"\n"
						+morning+"\n"
						+final2+"\n"
						+ans
						+(m-c+r-b));
	}

}
