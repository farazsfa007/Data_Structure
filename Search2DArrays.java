package dataStructure;

import java.util.Arrays;

public class Search2DArrays {
	public static void main(String[] args) {
		int[][] arr= {
				{12,34},
				{56,-8,12,},
				{76,49,23,78},
				{73,62,57,}
		};
		int target=-8;
		int[] ans=search(arr,target);
		System.out.println(Arrays.toString(ans));
	}

	static int[] search(int[][] arr,int target ){
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if(arr[row][col]==target) {
					return new int[] {row,col};
				}
			}
		}
		return new int[] {-1,-1};
	}
}