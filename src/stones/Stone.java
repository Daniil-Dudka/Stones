package stones;

import java.util.Arrays;

public abstract class Stone implements Valuable {
    protected double weight = 0;
    protected double price = 0;
    private double transparency = 0;
    private String color;
    // макс число карат 756

    public Stone(double weight,double transparency, String color){
        this.weight = weight;
        calculatePrice();
        this.transparency = transparency;
        this.color = color;

    }


    public String toString(){
        return "\nweight = " + this.weight +
                "\nprice = " + this.price +
                "\ntransparency = " + this.transparency ;
    }

    public String getColor() {
        return color;
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
