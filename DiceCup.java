
public class DiceCup {

	Die die1 = new Die();
	Die die2 = new Die();

	public void rollDice() {
		die1.roll();
		die2.roll();

	}

	public int getSum() {

		var sum = die1.getValue() + die2.getValue();

		return sum;

	}

}
