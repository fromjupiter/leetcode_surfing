package fivehd;

import java.util.Stack;

public class NextGreaterElement_503 {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;++i) {
            result[i] = -1;
        }
        stack.push(nums.length-1);
        int i=0;
        while(i<nums.length) {
            if(!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                result[stack.pop()] = nums[i];
            } else {
                stack.push(i);
                i++;
            }
        }
        i=0;
        while(!stack.isEmpty() && i<nums.length) {
            if(nums[stack.peek()] < nums[i]) {
                result[stack.pop()] = nums[i];
            } else {
                i++;
            }
        }
        return result;
    }
}
