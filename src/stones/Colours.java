package stones;
import java.util.Random;
import java.util.Arrays;
import java.util.List;

public enum Colours {
    Black (" Чёрный "),
    Pink(" Розовый "),
    Blue( " Синий "),
    Purple(" Фиолетовый "),
    Red(" Красный "),
    Orange(" Оранжевый "),
    Green(" Зелёный "),
    White( " Белый "),
    Grey(" Серый "),
    Yellow( " Жёлтый ");

    private  String color;
    Colours(String color) {
        this.color = color;
    }

    private static final List<Colours> VALUES =Arrays.asList(values());
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();
    public Colours getRandomColor(){
         return VALUES.get(RANDOM.nextInt(SIZE));
    }
    public String getColor(){
        return color;
    }
}
