package stones;

public class Semiprecious extends Stone {
    private boolean naturalness;
    public void calculatePrice(){
        this.price = this.weight * 600;
    }
}
