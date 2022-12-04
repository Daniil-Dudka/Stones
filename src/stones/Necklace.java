package stones;

import java.util.ArrayList;

public class Necklace {
    String color;
    double weight;
    double price;
    ArrayList<Stone> rocks= new ArrayList<>();

    public void addStone(Stone rock,String color){
        if(color.equals(this.color))
            this.rocks.add(rock);
    }
    void  setColor(String color){
        this.color = color;
    }
    String getColor(){
         return  this.color;
    }

    void calculateWeight(){
        for(int i =0; i < rocks.size(); ++i )
            price += rocks.get(i).getPrice();
    }
    void calculatePrice(){
        for(int i = 0; i <rocks.size(); ++i )
            weight += rocks.get(i).getWeight();
    }
}
