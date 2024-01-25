import java.util.*;

//given an integer number,return it in Roman
public class IntegerToRoman {                        
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(intToRoman(n));	
	}
	public static String intToRoman(int num) {
		String res = "";
		while(num!=0){
            if(num>=1000){
                res+="M";
                num-=1000;
            }
            else if(num>=900 && num<1000){
            	res+="CM";
            	num-=900;
            }
            else if(num>=500 && num<1000){
                res+="D";
                num-=500;
            }	
            if(num>=400 && num<500) {
            	res+="CD";
            	num-=400;
            }
            else if(num>=100 && num<500){
                res+="C";
                num-=100;
            }
            else if(num>=90 && num<100) {
            	res+="XC";
            	num-=90;
            }
            else if(num>=50 && num<100){
                res+="L";
                num-=50;
            }
            else if(num>=40 && num<50) {
            	res+="XL";
            	num-=40;
            }
            else if(num>=10 && num<50){
                res+="X";
                num-=10;
            }
            else if(num==9) {
            	res+="IX";
            	num-=9;
            }
            else if(num>=5 && num<10){
                res+="V";
                num-=5;
            }
            else if(num==4) {
            	res+="IV";
            	num-=4;
            }
            else if(num>=1 && num<5){
                res+="I";
                num-=1;
            }
		}
        return res;
	}
}
