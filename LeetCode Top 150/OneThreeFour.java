public class OneThreeFour {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int startIndex = 0;
        int count = 0;
        int tank = 0;
        int currentIndex = 0;

        if (gas.length == 1) {
            if ((gas[0] - cost[0]) >= 0) {
                return 0;
            } else {
                return -1;
            }
        }

        for (int i = 0; i < cost.length; i++) {
            startIndex = i;
            currentIndex = i;
            count = 0;
            tank = 0;
            if ((gas[i] - cost[i] > 0)) {
                whileloop: while (count < gas.length) {
                    tank += gas[currentIndex];
                    tank -= cost[currentIndex];
                    if (tank < 0) {
                        if (currentIndex > i) {
                            i = currentIndex;
                        }
                        break whileloop;
                    }

                    currentIndex += 1;
                    if (currentIndex == gas.length) {
                        currentIndex = 0;
                    }
                    count += 1;
                }

                if (count == gas.length) {
                    return startIndex;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] gas1 = { 1, 2, 3, 4, 5 };
        int[] cost1 = { 3, 4, 5, 1, 2 };
        int[] gas2 = { 4, 5, 1, 2, 3 };
        int[] cost2 = { 1, 2, 3, 4, 5 };

        System.out.println(canCompleteCircuit(gas1, cost1));
        System.out.println(canCompleteCircuit(gas2, cost2));
    }

}
