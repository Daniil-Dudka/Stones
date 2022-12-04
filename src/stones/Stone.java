package stones;

import java.util.Arrays;

public abstract class Stone implements Valuable {
    protected double weight = 0;
    protected double price = 0;
    private double transparency = 0;
    private String color;
    // макс число карат 756

    public Stone(){
        this.weight = Math.random() % 756;
        this.price = Math.random() % 100000;
        this.transparency = Math.random() % 100;
        Colours[] clrs = Colours.values();
        int temp_rand = (int) (Math.random() % 9);
        color = clrs[temp_rand].getColor();

    }


    public String toString(){
        return "weight " + this.weight +
                "\nprice " + this.price +
                "\ntransparency" + this.transparency;
    }

    public void setPrice(double price) {
        if (price > 0)
            this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setWeight(double weight) {
        if (weight>0 && weight <= 756)
            this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setTransparency(double transparency) {
        if(transparency>=0 && transparency<=100)
            this.transparency = transparency;
    }

    public double getTransparency() {
        return transparency;
    }


}
