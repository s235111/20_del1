public class Die {
    public int value;

    public void GetValue() {

        var val = java.lang.Math.random() * 6;
        value = (int) val;
    }

}