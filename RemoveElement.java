public class RemoveElement {
	public static void main(String[] args) {
		int[] a = {3,2,2,3};
		int val = 3;
		//expected = {2,2,_,_}
		int count = 0;
		int[] res = new int[a.length];
		for(int i = 0;i<res.length;i++)
			res[i] = -1;
		for(int i = 0;i<a.length;i++) {
			if(a[i]==val) {
				count++;
				int j = res.length-1;
				while(res[j]!=-1)
					j--;
				res[j] = a[i];
			}
			else
				res[i] = a[i];
		}
		for(int i = 0;i<a.length;i++)
			a[i] = res[i];
		//return count;
	}
}
