package day32_ReturnMethod;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bigerNum = GiveMeBigerNumber(2,100);
		System.out.println(bigerNum);
	}

	public static int GiveMeBigerNumber(int f, int s) {
		return f > s ? f : s;
	}

}
