/*
 * Given an integer num, repeatedly add all its digits until 
 * the result has only one digit, and return it.
 */
public class AddDigits {
	public int addDigits(int n) {
        int sum;
        while(n>9){
            sum = 0;
            while(n!=0){
                int x = n%10;
                sum+=x;
                n/=10;
            }
            n = sum;
        }
        return n;
    }
}
