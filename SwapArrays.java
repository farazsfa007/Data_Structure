package com.kmclu.lko;
import java.util.Arrays;
public class SwapArrays {
	public static void main(String[] args) {
		int[] arr= {34,45,76,23,27,47};
		swap(arr,0,3);
		System.out.println(Arrays.toString(arr));
		
	}
	static void swap(int[] arr,int index1,int index2) {
		int temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
		
	}
}
