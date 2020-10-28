/**
 * @author : Sai Chaitanya Krishna
 * Date : 25-10-2020
 * Description : To create a mirror image of the string
 */
import java.util.*;
public class MirrorImageString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=new String();
		String resultString=new String();
		System.out.println("Enter the String : ");
		str=sc.nextLine();
		resultString=getImage(str);
		System.out.println(str+"|"+resultString);
	}

	private static String getImage(String str) {
		String reverse;
		StringBuffer sbf = new StringBuffer(str); 
		sbf.reverse();
		reverse=sbf.toString();
		return reverse;
	}

}
