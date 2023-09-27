public class Die {

	private int value;

	public void roll() {
		var val = (Math.random() * 6) + 1;
		value = (int) val;
	}

	public int getValue() {
		return value;
	}

}
