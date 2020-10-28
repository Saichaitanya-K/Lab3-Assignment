/**
 * @author : Sai Chaitanya Krishna
 * Date : 25-10-2020
 * Description : To print date in term of days, months and years
 */

import java.util.*;
public class Date {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String date;
		System.out.println("Enter the date : ");
		date=sc.nextLine();
		String[] st=new String[3];
		st=getDate(date);
		System.out.println("Number of days : "+st[0]);
		System.out.println("Number of months : "+st[1]);
		System.out.println("Number of years : "+st[2]);
	}

	private static String[] getDate(String date) {
		String[] str;
		str=date.split("-");
		return str;
	}
}
