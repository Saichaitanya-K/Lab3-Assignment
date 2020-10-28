/**
 * @author : Sai Chaitanya Krishna
 * Date : 25-10-2020
 * Description : Replace the consonants with next alphabet
 */
import java.util.*;
public class ReplaceWithConsonants {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str,newString;
		System.out.println("Enter the String : ");
		str=sc.nextLine();
		newString = alterString(str);
		System.out.println(newString);
	}

	private static String alterString(String str) {
		char[] ch=str.toCharArray();
		char temp;
		String s=new String();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' ') {			//Ignoring spaces
				continue;
			}
			if(ch[i]=='a' || ch[i]=='A' || ch[i]=='e' || ch[i]=='E' ||
					ch[i]=='i' || ch[i]=='I' || ch[i]=='o' || ch[i]=='O'||ch[i]=='u'|| ch[i]=='U') {
				temp=ch[i];
				ch[i]=temp;
			}
			else {						// Replacing existing consonants with next alphabet
				temp=(char) (ch[i]+1);
				ch[i]=temp;
			}
		}
		for(int i=0;i<ch.length;i++) { //Adding every character to string variable
			s=String.valueOf(ch);
		}
		return s;
	}
}
