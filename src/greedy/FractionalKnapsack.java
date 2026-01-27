package greedy;

import java.util.Arrays;

public class FractionalKnapsack {
    static class Item {
        int value, weight;

        Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }
    }

    private static double maxProfit(Item[] items, int capacity) {
        Arrays.sort(items, (o1, o2) -> {
            double r1 = (double) o1.value / o1.weight;
            double r2 = (double) o2.value / o2.weight;
            return Double.compare(r2, r1);
        });

        double totalProfit = 0;
        for (Item i : items) {
            if (capacity - i.weight >= 0) {
                capacity -= i.weight;
                totalProfit+= i.value;
            }else {
                double fraction = (double) capacity / i.weight;
                totalProfit += (i.value * fraction);
                break;
            }
        }
        return totalProfit;
    }


    public static void main(String[] args) {
        Item i1 = new Item(61, 10);
        Item i2 = new Item(101, 20);
        Item i3 = new Item(121, 30);

        Item items[] = {i1, i2, i3};

        int capacity = 50;

        System.out.println(maxProfit(items, capacity));
    }
}
