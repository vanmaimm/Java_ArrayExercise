package app;

import java.util.Scanner;

public class Main {
	public static void showArray(int [] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+"\t");
		}
	}
	
	//Descending order array
	public static int[] descendingOrder(int [] array) {
		int temp = array[0];
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		return array;
	}
	//Ascending order array
	public static int[] ascendingOrder(int [] array) {
		int temp = array[0];
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		return array;
	}
	
	public static int[] delete(int [] array) {
		int temp = array[0];
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		return array;
	}
	
	public static int[] insert(int [] array) {
		int temp = array[0];
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		return array;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array");
		int n = input.nextInt();
		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		
		int[] sortDes= descendingOrder(array);
		showArray(sortDes);
		int[] sortAsc=ascendingOrder(array);
		showArray(array);
	}
}
