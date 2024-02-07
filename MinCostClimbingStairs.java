import java.util.*;
public class MinCostClimbingStairs {	
	public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
	    int[] tmp = new int[n];
	    for (int i=0; i<n; i++) {
		    if (i<2) 
                tmp[i] = cost[i];
		    else 
                tmp[i] = cost[i] + Math.min(tmp[i-1], tmp[i-2]);
	    }
	    return Math.min(tmp[n-1], tmp[n-2]);
    }
}
