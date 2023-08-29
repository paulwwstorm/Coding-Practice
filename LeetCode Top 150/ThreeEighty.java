import java.util.Arrays;

public class ThreeEighty {
    public class RandomizedSet {
        private int[] randomizedSet;

        public RandomizedSet() {
            randomizedSet = new int[0];
        }

        public boolean insert(int val) {
            boolean contains = Arrays.stream(randomizedSet).anyMatch(x -> x == val);

            if (!contains) {
                int[] newRandomizedSet = new int[randomizedSet.length + 1];
                newRandomizedSet[newRandomizedSet.length - 1] = val;
                randomizedSet = newRandomizedSet;
            }

            return contains;
        }

        // public boolean remove(int val) {

        // }

        // public int getRandom() {

        // }
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
