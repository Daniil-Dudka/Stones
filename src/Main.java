import stones.Gem;
import stones.Necklace;
import stones.Semiprecious;
import stones.Stone;
import java.util.ArrayList;
import static stones.Colours.*;


public class Main {
    public static void main(String[] args) {
        ArrayList<Stone> rocksBunch = new ArrayList<>();

        rocksBunch.add(new Gem(15,45,Black.getColor(),0));
        rocksBunch.add(new Semiprecious(2,20,Green.getColor(),true));
        rocksBunch.add(new Semiprecious(4,45,Red.getColor(),false));
        rocksBunch.add(new Semiprecious( 1,10,Red.getColor(),true));
        rocksBunch.add(new Semiprecious(0.1,1,Black.getColor(),false));
        rocksBunch.add(new Gem(30,70,Green.getColor(),0.1));
        rocksBunch.add(new Gem(23,65,Black.getColor(),2));
        rocksBunch.add(new Gem(21, 90, Red.getColor(),0));
    }

}