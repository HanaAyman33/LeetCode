import java.util.*;
public class RemoveElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		for(int i = 0;i<n;i++)
			num[i] = sc.nextInt();
		int val = sc.nextInt();
		System.out.println(removeElement(num,val));
		int[] result = new int[n];
		create(result,num,val);
		for(int i = 0;i<n;i++)
			System.out.print(result[i]+" ");
	}
	public static int removeElement(int[] num,int val) {
		return helper(num,val,0,0);
	}
	public static int helper(int[] nums, int val,int count,int i) {
        if(i==nums.length)
        	return count;
        if(nums[i]!=val)
        	count++;
        return helper(nums,val,count,++i); 
    }
	public static void create(int[] result,int[] n,int val){
		int j = 0,i = 0;
		while(i<n.length && j<n.length) {
			if(n[i]!=val) {
				result[j] = n[i];
				j++;
			}
			i++;
		}
		i = 0;
		while(i<n.length && j<n.length) {
			if(n[i]==val) {
				result[j] = -1;
				j++;
			}
			i++;
		}
	}
}
