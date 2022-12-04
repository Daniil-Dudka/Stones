package util;

import stones.Stone;

import java.util.Comparator;

public class ComparePrice  implements Comparator<Stone> {
    public int compare(Stone o1 ,Stone o2){
        if(o1.getPrice() > o2.getPrice())
            return 1;
        else if(o1.getPrice() < o2.getPrice())
            return -1;
        return 0;
    }
}
