/**
 * @author : Sai Chaitanya Krishna
 * Date : 25-10-2020
 * Description : To check whether a string is positive or negative
 */
import java.util.*;
public class PositiveString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		boolean line;
		System.out.println("Enter the string : ");
		str = sc.nextLine();
		line = toCheckString(str);
		System.out.println(line);
	}

	private static boolean toCheckString(String str) {
		boolean check=true;
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length-1;i++) {
			if(ch[i] > ch[i+1]) {			//Checking the characters are increasing or decreasing
				 check = false;
			}
		}
		return check;
	}

}
