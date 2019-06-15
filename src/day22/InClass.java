package day22;

public class InClass {

	public static void main(String[] args) {


		 //012345678901234567890123456789
String song = "Name : Ba Ba Black Sheep Ba";

String target = "Ba";

int indexOfBa = song.indexOf("Ba");
System.out.println(indexOfBa);

//indexOf(string, beginningIndex)
int indexOf2Ba = song.indexOf("Ba" , indexOfBa+2); // +2 because "Ba" has 2 characters
System.out.println(indexOf2Ba);

int indexOf3Ba = song.indexOf("Ba" , indexOf2Ba+2);
System.out.println(indexOf3Ba);

	}

}
