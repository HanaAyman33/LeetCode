/*Given an array nums containing n distinct numbers in the range [0, n], 
 * return the only number in the range that is missing from the array.
 */

import java.util.ArrayList;
import java.util.List;

public class MissingNumber {
	public int missingNumber(int[] nums) {
		int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
		List<Integer> tmp = new ArrayList<Integer>();
        for(int i = 0;i<nums.length;i++){
        	min = Math.min(nums[i], min);
        	max = Math.max(nums[i], max);
        	tmp.add(nums[i]);
        }
        if(min!=0)
        	return 0;
        int ans = 0;
        for(int i = 1;i<=max;i++) {
        	if(!tmp.contains(i)) {
        		ans = i;
        		break;
        	}
        }
        if(ans==0)
        	ans = max+1;
        return ans;
    }
}
