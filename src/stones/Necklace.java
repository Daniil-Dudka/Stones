package stones;

import java.util.ArrayList;
import java.util.SortedMap;

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
    void findStones(double max, double min){
        for(int i = 0; i < rocks.size(); ++i )
            if(rocks.get(i).getTransparency() >= min && rocks.get(i).getTransparency() <= max)
                System.out.println(rocks.get(i));
        System.out.println();
    }
    private void toSwap(Stone first, Stone second){
        Stone temp = first;
        first = second;
        second = temp;

    }
    public void bubbleSorterWeight(){     //МЕТОД ПУЗЫРЬКОВОЙ СОРТИРОВКИ
        for (int out = rocks.size()-1; out >= 1; out--){  //Внешний цикл
            for (int in = 0; in < out; in++){       //Внутренний цикл
                if(rocks.get(in).weight > rocks.get(in + 1).weight)               //Если порядок элементов нарушен
                    toSwap(rocks.get(in),rocks.get(in + 1));             //вызвать метод, меняющий местами
            }
        }
    }
    public void bubbleSorterPrice(){     //МЕТОД ПУЗЫРЬКОВОЙ СОРТИРОВКИ
        for (int out = rocks.size()-1; out >= 1; out--){  //Внешний цикл
            for (int in = 0; in < out; in++){       //Внутренний цикл
                if(rocks.get(in).price > rocks.get(in + 1).price)               //Если порядок элементов нарушен
                    toSwap(rocks.get(in),rocks.get(in + 1));             //вызвать метод, меняющий местами
            }
        }
    }
}
