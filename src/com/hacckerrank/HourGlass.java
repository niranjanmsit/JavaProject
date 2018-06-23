package com.hacckerrank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HourGlass {
	// Complete the hourglassSum function below.
	static int hourglassSum(int[][] arr) {
		int k = arr.length;
		System.out.println("Value of K " + k);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "");
			}
			System.out.println("");
		}
		// break hour glass
		int idx1 = 0;



		int row = arr.length;
		int column = arr[0].length;
		int maxval=0;
		int tmp=0;

		System.out.println("Starting glass ");
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < row - 2; j++) {
				//tmp=0;
				if (j + 2 < row && i + 2 < column) {
					System.out.println("Idx of Hourglass "+idx1++);
					tmp=arr[i][j]+arr[i][j + 1]+arr[i][j + 2];
					tmp=tmp+arr[i + 1][j + 1];
					tmp=tmp+arr[i + 2][j]+arr[i + 2][j + 1]+arr[i + 2][j + 2];
					
					System.out.print("\n @ " + arr[i][j] + " - " + arr[i][j + 1] + " - " + arr[i][j + 2]);
					System.out.print("\n     # " + arr[i + 1][j + 1]);
					System.out.print("\n @ " + arr[i + 2][j] + " - " + arr[i + 2][j + 1] + " - " + arr[i + 2][j + 2]);
					System.out.println("\n====================== sum : "+tmp);
				}
				System.out.println("i is  "+i);
				if(tmp>maxval||(i==0&&j==0)) {
					maxval=tmp;
					System.out.println("maxval "+maxval);
				}
				
			}
			System.out.println(" ");
		}

		return maxval;
	}

	// private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("b.txt"/* System.getenv("OUTPUT_PATH") */));
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		String currLine = null;
		int[][] arr = new int[6][6];
		int i = 0;
		// initialize array
		while ((currLine = br.readLine()) != null) {
			// System.out.println(currLine);
			String[] arrRowItems = currLine.split(" ");
			// System.out.println("");
			// for (int i = 0; i < 6; i++) {
			for (int j = 0; j <arrRowItems.length; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
				System.out.print(arrItem + " ");
			}
			// }
			System.out.println("");
			i++;
		}

		// for (int i = 0; i < 6; i++) {
		// String[] arrRowItems = scanner.nextLine().split(" ");
		// scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		// System.out.println("");
		// for (int j = 0; j < 6; j++) {
		// int arrItem = Integer.parseInt(arrRowItems[j]);
		// arr[i][j] = arrItem;
		// System.out.print(arrItem+" ");
		// }
		// System.out.println("");
		// }

		int result = hourglassSum(arr);
		System.out.println("retval "+result);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		// scanner.close();
	}

}
