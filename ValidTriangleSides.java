/*
 * Given an integer array nums, return the number of triplets chosen from the array that can make 
 * triangles if we take them as side lengths of a triangle.
 */
import java.util.*;
public class ValidTriangleSides {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i = 0;i<n;i++) 
			nums[i] = sc.nextInt();
		System.out.println(triangleNumber(nums));
	}
	public static int triangleNumber(int[] nums) {
        int n=nums.length;
        int count=0;
        Arrays.sort(nums);
        for(int i=0; i<n-2; i++)
        {
            for(int j=i+1; j<n-1; j++)
            {
                for(int k=j+1; k<n; k++)
                {
                    if(nums[i]+nums[j]>nums[k])
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
