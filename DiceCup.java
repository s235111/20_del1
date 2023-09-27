public class DiceCup {

	private Die die1 = new Die();
	private Die die2 = new Die();

	public void rollDice() {
		die1.roll();
		die2.roll();
	}

	public int getSum() {
		return die1.getValue() + die2.getValue();
	}

	public boolean getEqual() {
		return die1.getValue() == die2.getValue();
	}

	public int getDie1(){
		return die1.getValue();
	}

	public int getDie2(){
		return die2.getValue();
	}
}
