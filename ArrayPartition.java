import java.util.Arrays;

public class ArrayPartition {
	public static void main(String[] args) {
		int[] a = {6,2,6,5,1,2};
		System.out.println(sumArrays(a));
	}
	public static int sumArrays(int[] a) {
		int sum = 0;
		Arrays.sort(a);
		for(int i = a.length-1;i-1>=0;i-=2) {
			if(a[i]!=a[i-1])
				sum+=a[i-1];
			else 
				sum+=a[i];
		}
		return sum;
	}
}
