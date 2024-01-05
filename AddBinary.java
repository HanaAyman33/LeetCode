public class AddBinary {
	public static void main(String[] args) {
		System.out.println(addBinary("0","0"));
	}
	public static String addBinary(String a, String b) {
		int A = getNum(a);
		int B = getNum(b);
        int s = A+B;
        String sum = "";
        if(s==0)
        	return "0";
        while(s!=0){
            sum = (s%2)+""+sum;
            s/=2;
        }   
        return sum;
    }
	public static int getNum(String s) {
		int cnt = 0;
		int i = s.length()-1;
		int num = 0;
		while(i>=0){
            num+=(Integer.parseInt(s.charAt(i)+"")*Math.pow(2,cnt));
            cnt++;
            i--;
        }
		return num;
	}
}
