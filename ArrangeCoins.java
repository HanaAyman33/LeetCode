import java.util.*;
public class ArrangeCoins {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		int i = 1;
		while(true){
			if(i<=n){
				cnt++;
				n-=i;
				i++;
			}
			else
				break;
		}
		System.out.println(cnt);
	}
}
