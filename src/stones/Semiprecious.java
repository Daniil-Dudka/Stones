package stones;

public class Semiprecious extends Stone {
    private boolean naturalness;

    public Semiprecious(double weight, double transparency, String color, boolean naturalness) {
        super(weight, transparency, color);
        this.naturalness = naturalness;
        calculatePrice();

    }

    public void calculatePrice(){
        this.price = this.weight * 600;
    }

    @Override
    public String toString() {
        return super.toString() + "\nnaturalness " + naturalness ;
    }
}
