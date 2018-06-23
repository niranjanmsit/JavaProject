package com.hacckerrank;

import java.util.Scanner;

public class StaticTest {
	static boolean flag = true;
	static int B;
	static int H;
	static {
		Scanner sc = new Scanner(System.in);
		B = sc.nextInt();
		if (B < 0) {
			System.out.print("java.lang.Exception: Breadth and height must be positive");
			System.exit(0);
		}

		H = sc.nextInt();
		if (H < 0) {
			System.out.print("java.lang.Exception: Breadth and height must be positive");
			System.exit(0);
		}

	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}

	}

}
