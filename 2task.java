import java.util.Random;

public static int generateRandomAge() {
    Random random = new Random();
    return random.nextInt(108);
}
