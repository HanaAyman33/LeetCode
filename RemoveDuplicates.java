import java.util.*;
public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  //length of the array
		int[] num = new int[n];
		for(int i = 0;i<n;i++)
			num[i] = sc.nextInt();
		int[] expected = new int[getLength(num,0)];
		getExpected(expected,num);
		int k = getLength(num,0);
		for(int i = 0;i<expected.length;i++)
			System.out.print(expected[i]+" ");
	}
	public static int getLength(int[] nums,int count){
		boolean flag = true;
        for(int i = 0;i<nums.length;i++) {
        	for(int j = 0;j<nums.length & i!=j;j++) {
        		if(nums[i]==nums[j]) {
        			flag = false;
            		break;
        		}
        	}
        	if(flag)
        		count++;
        }
        return count;
    }
	public static void getExpected(int[] n,int[] num) {
		boolean flag = false;
        for(int i = 0;i<n.length;i++){
        	for(int j = 0;j<n.length & i!=j;j++) {
        		if(n[i]!=n[j])
        			flag = true;
        	}
        	if(flag) {
        		num[i] = n[i];
        		flag = false;
        	}
        }
	}
}