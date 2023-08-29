import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();
        Boolean try1 = randomizedSet.insert(2);
        Boolean try2 = randomizedSet.insert(2);
        Boolean try3 = randomizedSet.insert(5);
        System.out.println(try1.toString());
        System.out.println(try2.toString());
        System.out.println(Arrays.toString(randomizedSet.randomizedSet));
    }
}
