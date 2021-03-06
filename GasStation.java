/*
 * Gas Station 
 * There are N gas stations along a circular route, where the amount of gas at station i is gas[i].
 *
 * You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from station i to its next station (i+1). You begin the journey with an empty tank at one of the gas stations.
 *
 * Return the starting gas station's index if you can travel around the circuit once, otherwise return -1.
 *
 * Note:
 * The solution is guaranteed to be unique.
 *
 * http://oj.leetcode.com/problems/gas-station/
 */

public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        int sum = 0, total = 0, index = 0;
        for (int i = 0; i < gas.length; i++) {
            sum += (gas[i] - cost[i]);
            total += (gas[i] - cost[i]);
            if (sum < 0) {
                index = i + 1;
                sum = 0;
            }
        }
        
        if (total >= 0) return index;
        else return -1;
    }
}
