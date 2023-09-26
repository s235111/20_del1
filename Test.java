public class Test {
	public static void main(String[] args) {
		Test obj = new Test();
		obj.test();
	}

	public void test() {
		String str;
		String content = "";
		Die die = new Die();

		int i;
		for (i = 0; i < 1000; i++) {
			die.roll();
			var value = die.getValue();

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
		System.out.println(ones);
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
