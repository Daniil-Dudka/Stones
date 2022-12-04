package stones;

public class Gem extends Stone {

    public void calculatePrice() {
        this.price = this.weight * 1725;
    }
}
