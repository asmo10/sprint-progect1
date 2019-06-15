package _225_OOP_18_TableGenerator_1;

public class Test {

	public static void main(String[] args) {
		MultiplicationTable m = new MultiplicationTable();
		 int [] mult = {0,9,18};
				   
//				    returns:false
		System.out.println(m.checkTable(9, mult));
	}
}
