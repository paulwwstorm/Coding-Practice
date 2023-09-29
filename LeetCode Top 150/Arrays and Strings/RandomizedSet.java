import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomizedSet {
    public List<Integer> randomizedSet;

    public RandomizedSet() {
        randomizedSet = new ArrayList<Integer>();
    }

    public boolean insert(int val) {
        int valIndex = randomizedSet.indexOf(val);

        if (valIndex < 0) {
            randomizedSet.add(val);
            return true;
        }

        return false;
    }

    public boolean remove(int val) {
        int valIndex = randomizedSet.indexOf(val);

        if (valIndex >= 0) {
            randomizedSet.remove(valIndex);
            return true;
        }

        return false;
    }

    public int getRandom() {
        Random ran = new Random();
        int randomIndex = ran.nextInt(randomizedSet.size());
        return randomizedSet.get(randomIndex);
    }
}