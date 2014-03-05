package com.anuj.algorithms.search;

import java.util.Arrays;

/**
 * 
 * @author Anuj Patel
 * @Desc www.goldenpackagebyanuj.blogspot.com 
 */
public class BinarySearch {

	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		int a[] = {1,2,3,4,5,7,17,19,12};
		int searchItem= 12;
		
		Arrays.sort(a);
		System.out.println("Searching for Item in sorted Array: "+searchItem);
		
		/*int searchResult = Arrays.binarySearch(a, searchItem);
		System.out.println("The index of "+ searchItem +" is : " + searchResult);*/
		
		int searchResult = bs.search(a, searchItem);
		System.out.println("The index of "+ searchItem +" is : " + searchResult);
	}

	/**
	 * Binary Search Algorithm
	 * @param a
	 * @param searchItem
	 * @return index of searchItem
	 */
	public static int search(int[] a,int searchItem){
		int low = 0;
		int high = a.length - 1;
		
		while(low <= high){
			int middle = (low+high)/2;
			//int middle = (low+high) >>> 1;
			int midVal =  a[middle];
					
			if(searchItem > midVal){
				low = middle + 1;
			}
			else if(searchItem < midVal){
				high = middle-1;
			}
			else{
				return middle;
			}
		}
		return -(low+1);
	}
}
