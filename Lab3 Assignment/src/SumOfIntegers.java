/**
 * @author : Sai Chaitanya Krishna
 * Date : 25-10-2020
 * Description : To read and display all integers and calculating the sum of all integers
 */
import java.util.*;
public class SumOfIntegers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		int sum = 0,num;
		System.out.println("Enter the string of integers : ");
		str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str);
		while (st.hasMoreTokens()) {  			
	         num = Integer.parseInt(st.nextToken());	
	         System.out.println(num);
	         sum+=num;
		}
		System.out.println(sum);
	}

}
