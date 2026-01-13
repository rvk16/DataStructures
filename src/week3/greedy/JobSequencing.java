package week3.greedy;

import java.util.Arrays;


public class JobSequencing {
    static class Job {
        int id;
        int deadline;
        int profit;

        Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    private static int[] JobScheduling(Job[] arr, int n) {
        // 1. Sort Jobs by profit in descending order
        Arrays.sort(arr, (a, b) -> (b.profit - a.profit));

        // 2. Find the maximum deadline to determine the size of our schedule array
        int maxDeadline = 0;
        for (Job j : arr) {
            if (j.deadline > maxDeadline) {
                maxDeadline = j.deadline;
            }
        }

        // 3. Create a schedule array to track used time slots
        // result[i] will store the ID of the job done at time 'i'
        // slots[i] keeps track if time 'i' is occupied
        int[] result = new int[maxDeadline + 1];
        boolean[] isSlotOccupied = new boolean[maxDeadline + 1];

        int countJobs = 0;
        int totalProfit = 0;

        // 4. Iterate through the sorted jobs
        for (Job job : arr) {

            // Try to find a free slot for this job
            // Start from the last possible day (min of deadline or max array size)
            // and move backwards to 1
            for (int j = job.deadline; j > 0; j--) {

                // If we find a free slot
                if (!isSlotOccupied[j]) {
                    result[j] = job.id;       // Assign job to this slot
                    isSlotOccupied[j] = true; // Mark slot as occupied
                    countJobs++;
                    totalProfit += job.profit;
                    break; // Move to the next job in the sorted list
                }
            }
        }

        // Returning count and profit (common return format for this problem)
        return new int[]{countJobs, totalProfit};
    }

    public static void main(String[] args) {

        Job[] jobs = {
                new Job(1, 4, 20),
                new Job(2, 1, 10),
                new Job(3, 1, 40),
                new Job(4, 1, 30)
        };

        int[] res = JobScheduling(jobs, jobs.length);
        System.out.println("Jobs done: " + res[0]);
        System.out.println("Total Profit: " + res[1]);
    }
}