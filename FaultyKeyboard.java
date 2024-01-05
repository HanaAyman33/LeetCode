import java.util.*;
class Solution {
	    public static String finalString(String s) {
	        String result = "";
	        int i = 0;
	        while(i<s.length()){
	            if(s.charAt(i)!='i')
	                result+=s.charAt(i);
	            else{
	                String temp = "";
	                for(int j = result.length()-1;j>=0;j--)
	                    temp +=result.charAt(j)+"";
	                result = temp;
	            }
	            i++;
	        }
	        return result;
	    }
	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();
	        if(s.length()>=1 && s.length()<=100 && s.charAt(0)!='i')
	             System.out.println(finalString(s.toLowerCase()));
	    }
	}