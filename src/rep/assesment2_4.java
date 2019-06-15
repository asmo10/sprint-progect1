package rep;

public class assesment2_4 {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		System.out.println(appearsTwice("laptop","I would like to buy a new laptop, because my laptop is too old."));
	}

	/**
	 * @param target   - string that you need to check.
	 * @param sentence - string where you need to lookup for the target string.
	 * @return
	 */
	public static boolean appearsTwice(String target, String sentence) {
		int count = 0;
		sentence=sentence.replace(",", " ");
		String[] st = sentence.split(" ");
		for (int i = 0; i < st.length; i++) {
			if (st[i].equals(target))
				++count;
			System.out.println(count);
		}
		if (count == 2)return true;
		else return false;
	}
}
