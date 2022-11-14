import java.util.Random;

@SuppressWarnings("NumericOverflow")
public class Task01 {
    public static void main(String[] args) {
        makeException(getRandomCase());
    }

    static int getRandomCase() {
        Random random = new Random();
        return random.nextInt(1, 4);
    }

    static void makeException(int exception) {
        int result;
        switch (exception) {
            case (1) -> result = 10 / 0;
            case (2) -> {
                String str = "12O";
                result = Integer.parseInt(str);
            }
            case (3) -> {
                String empty = null;
                result = empty.length();
            }
            default -> throw new IllegalStateException("Unexpected value: " + exception);
        }
    }
}
