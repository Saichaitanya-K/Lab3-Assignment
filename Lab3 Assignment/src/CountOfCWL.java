/**
 * @author : Sai Chaitanya Krishna
 * Date : 25-10-2020
 * Description : To count number of characters, words and lines in a given string
 */
import java.util.*;
public class CountOfCWL {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str="sai\nchaitanya\nkrishna";
		int count,wordCount=0,characterCount=0;
		count=str.split("\n").length;				// counts the lines in a string
		char[] words=str.toCharArray();
		for(int i=0;i<words.length;i++) {			//counts the words in a string
			if(words[i]==' ' || words[i]=='\n') {
				wordCount++;
			}
		}
		for(int i=0;i<words.length;i++) {			//counts the characters in string
			if(words[i]!=' ') {
				characterCount++;
			}
		}
		System.out.println("Number of lines : "+count);
		System.out.println("Words in a string are : "+(wordCount+1));
		System.out.println("characterCount in a string is : "+(characterCount-count+1));
	}
}

