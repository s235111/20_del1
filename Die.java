public class Die {
    public int value;

    public void roll() {

        var val = (java.lang.Math.random() * 6) + 1;
        value = (int) val;
    }

    public int getValue() {

        return value;

    }

}
