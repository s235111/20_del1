public class Test {
	public int value;

	public static void main(String[] args) {
		Test obj = new Test();
		obj.test();
	}

	public void test() {
		String str;
		String content = "";

		int i;
		for (i = 0; i < 1000; i++) {
			// roll die
			// safe sum
			// plot char
			var val = (java.lang.Math.random() * 6) + 1;
			var val2 = (java.lang.Math.random() * 6) + 1;
			var sum = val + val2;
			value = (int) val;
			// System.out.println(value);
			str = Integer.toString(value);
			content = content + str;
			// System.out.println(content);

		}
		int ones = content.length() - content.replaceAll("1", "").length();
		int twos = content.length() - content.replaceAll("2", "").length();
		int threes = content.length() - content.replaceAll("3", "").length();
		int fours = content.length() - content.replaceAll("4", "").length();
		int fives = content.length() - content.replaceAll("5", "").length();
		int sixs = content.length() - content.replaceAll("6", "").length();
		int sevens = content.length() - content.replaceAll("7", "").length();
		int eights = content.length() - content.replaceAll("8", "").length();
		int nines = content.length() - content.replaceAll("9", "").length();
		int tens = content.length() - content.replaceAll("10", "").length();
		int elevens = content.length() - content.replaceAll("11", "").length();
		int twevels = content.length() - content.replaceAll("12", "").length();
		System.out.println(twos);
		System.out.println(threes);
		System.out.println(fours);
		System.out.println(fives);
		System.out.println(sixs);
		System.out.println(sevens);
		System.out.println(eights);
		System.out.println(nines);
		System.out.println(tens);
		System.out.println(elevens);
		System.out.println(twevels);

		// Creating the Bar chart

	}
}
