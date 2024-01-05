import java.util.*;
public class MergeSortedArray {
	public static void merge(int[] num1,int m,int[] num2,int n) {
		for(int i = 0,j = 0;i<n+m && j<n;i++) {
			if(num1[i]==0) {
				num1[i] = num2[j];
				j++;
			}
		}
		Arrays.sort(num1);
	/*public static void merge(int[] num,int[] nums1, int m, int[] nums2, int n) {
		int k = 0,i = 0,j = 0;
    	while(k<n+m && i<n+m && j<n){
    		if(nums1[i]<nums2[j] && nums1[i]!=0) {
    			num[k] = nums1[i];
    			i++;
    			k++;
    		}
    		else if((nums2[j]<nums1[i]) ||( i>=n && j<n)){
    			num[k] = nums2[j];
    			j++;
    			k++;
    		}
    		else if(nums1[i]==nums2[j]) {
    			num[k] = nums1[i];
    			num[k+1] = nums2[j];
    			i++;
    			j++;
    			k+=2;
    		}
    	}*/ 
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),m = sc.nextInt();
		int[] nums1 = new int[n+m];
		int[] nums2 = new int[n];
		for(int i = 0;i<n+m;i++)
			nums1[i] = sc.nextInt();
		for(int i = 0;i<n;i++)
			nums2[i] = sc.nextInt();
		if(nums1.length==1 && nums1[0]!=0 && nums2.length==0
		  || (nums2.length==1 && nums2[0]==0 && nums1.length==1 && nums1[0]!=0))
		       System.out.println(nums1[0]);
		else if((nums2.length==1 && nums2[0]!=0 && nums1.length==0) 
		 || (nums1.length==1 && nums1[0]==0 && nums2.length==1 && nums2[0]!=0))
		       System.out.println(nums2[0]);
		else{
			merge(nums1,m,nums2,n);
			for(int i = 0;i<n+m;i++)
				System.out.print(nums1[i]+" ");
		}
	}
}
/*if(nums1.length==1 && nums1[0]!=0 && nums2.length==0
|| (nums2.length==1 && nums2[0]==0 && nums1.length==1 && nums1[0]!=0))
	System.out.println(nums1[0]);
else if((nums2.length==1 && nums2[0]!=0 && nums1.length==0) 
|| (nums1.length==1 && nums1[0]==0 && nums2.length==1 && nums2[0]!=0))
	System.out.println(nums2[0]);
else {
	int i = 0,j = 0;
	while(i<n+m && j<n){
		if(nums1[i]<nums2[j] && nums1[i]!=0) {
			System.out.print(nums1[i]+" ");
			i++;
		}
		else if((nums2[j]<nums1[i]) ||( i>=n && j<n)){
			System.out.print(nums2[j]+" ");
			j++;
		}
		else if(nums1[i]==nums2[j]) {
			System.out.print(nums1[i]+" "+nums2[j]+" ");
			i++;
			j++;
		}
	}
}*/