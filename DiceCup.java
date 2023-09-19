
public class DiceCup {

	public static void main(String[] args) {
		var cup = new DiceCup();

		System.out.println(cup.getSum());

		System.out.println(cup.die1.getValue());
		System.out.println(cup.die2.getValue());
	}

	Die die1 = new Die();
	Die die2 = new Die();

	public int getSum() {
		die1.roll();
		die2.roll();

		var sum = die1.getValue() + die2.getValue();

		return sum;

	}
}
