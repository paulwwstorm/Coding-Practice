import java.util.Arrays;

public class RandomizedSet {
    public int[] randomizedSet;

    public RandomizedSet() {
        randomizedSet = new int[0];
    }

    public boolean insert(int val) {
        boolean contains = Arrays.stream(randomizedSet).anyMatch(x -> x == val);

        if (!contains) {
            int[] newRandomizedSet = new int[randomizedSet.length + 1];
            newRandomizedSet[newRandomizedSet.length - 1] = val;
            System.arraycopy(randomizedSet, 0, newRandomizedSet, 0, randomizedSet.length);
            randomizedSet = newRandomizedSet;
        }

        return contains;
    }

    // public boolean remove(int val) {

    // }

    // public int getRandom() {

    // }
}