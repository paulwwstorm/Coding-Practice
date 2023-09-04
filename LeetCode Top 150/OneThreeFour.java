public class OneThreeFour {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int index = 0;
        int count = 0;
        int tank = 0;

        whileloop: while (count < gas.length) {
            tank += gas[count];
            // System.out.println("After fill-up tank: " + tank);
            tank -= cost[count];
            // System.out.println("After travelling tank: " + tank);
            if (tank < 0) {
                index += 1;
                break whileloop;
            }
            count += 1;
        }

        if (count == gas.length) {
            return index;
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
