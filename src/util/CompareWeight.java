package util;

import stones.Stone;

import java.util.Comparator;

public class CompareWeight implements Comparator<Stone> {

        public int compare(Stone o1 ,Stone o2){
            if(o1.getWeight() > o2.getWeight())
                return 1;
            else if(o1.getWeight() < o2.getWeight())
                return -1;
            return 0;
        }
}
