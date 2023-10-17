/* Constraints:
 *
 * Assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * 2 <= nums.length <= 10^4
 * -10^9 <= nums[i] <= 10^9
 * -10^9 <= target <= 10^9
 * Only one valid answer exists.
 * 
 * Solution:
 * 
 * Switch to the directory where twoSum.java is located
 * Compile the program with "javac twoSum/twoSum.java"
 * Run the program with a target, followed by an array of integers: "java twoSum.Solution 9 2 11 15 7"
 * The result will be the indexes that add up to the target value.
 * If no two complements are found, 
 * 
 */
package twoSum;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int target, int nums[]) {
        /**/
        HashMap<Integer, Integer> map = new HashMap<>();

        /**/
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if(map.containsKey(complement)) {
                /**/
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        /* If no solution is found, the error will be handled by returning an empty array. */
        System.out.println("No complements found ):");
        return new int[0];
    }
    
    public static void main(String[] args) {
    
        int targetMain = Integer.parseInt(args[0]);

        int[] numsMain = new int[args.length - 1];

        for (int i = 1; i < args.length; i++) {
            numsMain[i-1] = Integer.parseInt(args[i]);
        }

        Solution solution = new Solution();

        /* Calling the twoSum method to find the indicies of the two numbers that sum to the target */
        int[] result = solution.twoSum(targetMain, numsMain);

        for (int index : result) {
            System.out.print(index + " ");
        }
    }
}
