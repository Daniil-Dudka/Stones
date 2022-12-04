package stones;

public class Gem extends Stone {

    private  double impurityPercentages;
    public Gem(double weight,double transparency, String color,double impurityPercentages){
        super(weight, transparency, color);
        this.impurityPercentages = impurityPercentages;
        calculatePrice();
    }
    public void calculatePrice() {
        this.price = this.weight * 1725;
    }

    @Override
    public String toString() {
        return super.toString() + "\nimpurityPercentages " + impurityPercentages ;
    }
}
