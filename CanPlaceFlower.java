import java.util.Stack;

public class CanPlaceFlower {
	public static void main(String[] args) {
		
		
	}
	 public boolean canPlaceFlowers(int[] flowerbed, int n) {
	        int zero = 0;
	        int i = 0;
	        while(i<flowerbed.length){
	            if(flowerbed[i]==0){
	                zero++;
	                i++;
	                if(i<flowerbed.length){
	                    if(flowerbed[i]==1)
	                        zero--;
	                }
	            }
	            else
	                i++;
	        }
	        if(zero>(2*n))
	            return true;
	        return false;
	 }
}
