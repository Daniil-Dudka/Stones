package stones;

import stones.Valuable;

public abstract class Stone implements Valuable {
    double weight = 0;
    double price = 0;
    double transparency = 0;
    // макс число карат 756




    public String toString(){
        return "weight " + this.weight +
                "\nprice " + this.price +
                "\ntransparency" + this.transparency;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setTransparency(double transparency) {
        this.transparency = transparency;
    }

    public double getTransparency() {
        return transparency;
    }
}
