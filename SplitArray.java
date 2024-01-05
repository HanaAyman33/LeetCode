import java.util.*;
public class SplitArray {
    public static boolean canSplitArray(List<Integer> a, int m) {
      boolean flag = false;
      while(a.size()>1) {
    	  if(a.size()==2) {
    		  flag = true;
    		  break;
    	  }
    	  int i = 0,j = a.size()-1;
          int sum1 = 0,sum2 = 0;
          while(j-->0){
        	 sum1+=a.get(i);
        	 sum2+=a.get(j);
        	 i++;
          }
          if(sum1>=m) {
        	  flag = true;
        	  a.remove(a.get(a.size()-1));
          }
          else if(sum2>=m) {
        	  flag = true;
        	  a.remove(a.get(0));
          }
          else {
        	  flag = false;
        	  break;
          } 
      }
      return flag;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++)
           a[i] = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> A = new ArrayList<Integer>();
        for(int i = 0;i<n;i++)
        	A.add(a[i]);
        System.out.println(canSplitArray(A,m));
    }
}