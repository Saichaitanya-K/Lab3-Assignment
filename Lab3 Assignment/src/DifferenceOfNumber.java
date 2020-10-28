/**
 * @author : Sai Chaitanya Krishna
 * Date : 25-10-2020
 * Description : Forming a new number by calculating difference between two numbers
 */
import java.util.*;
public class DifferenceOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number,difference;
		String str;
		char c=' ';
		System.out.println("Enter the number : ");
		number=sc.nextInt();
		str=Integer.toString(number);
		StringBuffer result=new StringBuffer();
		for(int i=0;i<str.length()-1;i++) {
			difference=(int) (str.charAt(i))-(int) (str.charAt(i+1));
			difference=Math.abs(difference);
			Integer.toString(difference);
			c=str.charAt(i+1);
			Character.toString(c);
			result.append(difference);
		}
		result.append(c);
		System.out.println(result);
	}

}
