public class BoundedCounter {
    private int value =0;
    private int upperLimit;

    public void setValue(int setValue){
        if (setValue>=0 && setValue<=this.upperLimit) {
            this.value = setValue;
        }
    }

    public int getValue() {
        return value;
    }

    public BoundedCounter(int upperLimit) {
        // write code here
        this.upperLimit=upperLimit;

    }

    public void next() {
        // write code here
        if (this.value<this.upperLimit){
            this.value++;
        }else {
            this.value=0;
        }
    }

    public String toString() {
        // write code here
        return String.format("%02d", this.value);
    }
}
