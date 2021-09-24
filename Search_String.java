package dataStructure;

import java.util.Arrays;

//import java.util.Iterator;

public class Search_String {
	
	public static void main(String[] args) {
		String name ="Faraz";
//		char target='z';
//		System.out.println(SearchString(name,target));
		System.out.println(Arrays.toString(name.toCharArray()));
	}
	
	static boolean SearchString2(String str,char target) {
		if(str.length()==0) {
			return false;
		}
		for (char ch:str.toCharArray()) {
			if(ch==target) {
				return true;
			}
			
		}
		return false;
	}
	
	static boolean SearchString(String str,char target) {
		if(str.length()==0) {
			return false;
		}
		for (int i = 0; i < str.length(); i++) {
			if(target==str.charAt(i)) {
				return true;
			}
		}
		return false;
	}
}