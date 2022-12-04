package stones;

import util.ComparePrice;

import java.util.*;

public class Necklace {
    String color;
    double weight;
    double price;
    ArrayList<Stone> rocks= new ArrayList<>();

    public void addStone(Stone rock,String color){
        if(color.equals(this.color))
            this.rocks.add(rock);
    }
    public void   setColor(String color){
        this.color = color;
    }
    public String getColor(){
         return  this.color;
    }

    public void calculateWeight(){
        for(int i =0; i < rocks.size(); ++i )
            price += rocks.get(i).getPrice();
    }
    public void calculatePrice(){
        for(int i = 0; i <rocks.size(); ++i )
            weight += rocks.get(i).getWeight();
    }
    public void findStones(double max, double min){
        for(int i = 0; i < rocks.size(); ++i )
            if(rocks.get(i).getTransparency() >= min && rocks.get(i).getTransparency() <= max)
                System.out.println(rocks.get(i));
        System.out.println();
    }

    public void sortPrice(){
        Comparator priceComparator = new ComparePrice();
        Collections.sort(rocks,priceComparator);
    }
    public String toString(){
       return "Color: " + color +
               "\nweight = " + weight +
               "\nprice = " + price +
               "\nrocks " + rocks;
    }
}
