package flipkart.flipkart;

import java.util.ArrayList;

public class INput {
	public static void main(String[] args) {
		String str = "helloworld";
		String Reverse="";
		for(int i=0;i<str.length();i++) {
			char mychar = str.charAt(i);
			Reverse=mychar+Reverse;
		}
		System.out.println(Reverse);
		List();
	}
	public static void SplittheStirng() {
		String str = "sreenivas.reddy";
		String[] wordCol = str.split("\\.");
		System.out.println(wordCol.length);
		for(String val:wordCol) {
			System.out.println(val);
		}
	}
	public static void wordCol() {
		String date = "25/02/45";
		//String val = date.replace("/", "-");
		//System.out.println(val);
		String[] eachword = date.split("/");
		String revers ="";
		String toal="";
		for(int eachWords=0;eachWords<eachword.length;eachWords++) {
			for(int eachChar =eachword[eachWords].length()-1;eachChar>=0;eachChar--) {
				char mychar = eachword[eachWords].charAt(eachChar);
				revers=mychar+revers;
			}
			toal = toal+revers;
			revers="";
		}
		System.out.println(toal);
	}
	public static void indexOf() {
		String val = "Hellow world";
		char mychar = val.charAt(9);
		System.out.println(mychar);
		int i = val.indexOf("o");//4
		int j = val.indexOf("r");//9
		System.out.println(i+"=="+j);
	}
	public static void List() {
		ArrayList<String> obj1 = new ArrayList<String>();
		ArrayList<String> obj2 = new ArrayList<String>();
		
		obj1.add("A");
		obj1.add("B");
		obj2.add("A");
		obj2.add(0,"B");
		System.out.println(obj1.equals(obj2));
		for(String va :obj2) {
			System.out.println(va);
		}
	}

}
