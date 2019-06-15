package day8;

public class review {

	public static void main(String[] args) {
	int score=10;
		/*
		 * System.out.println("score++ "+score++); System.out.println("score "+score );
		 * System.out.println("++score "+ ++score);
		 * System.out.println("score--"+score--); System.out.println("score "+score);
		 */
	
	int result=score++;
	System.out.println("result is "+result);
	
	score = score++ + ++score ;
	System.out.println(score);
	
	}

}
