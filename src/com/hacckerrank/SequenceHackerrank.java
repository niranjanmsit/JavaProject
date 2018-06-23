package com.hacckerrank;

import java.util.*;
import java.io.*;

public class SequenceHackerrank {

	public static void main(String[] argh) {
//		Scanner in = new Scanner(System.in);
//		int t = in.nextInt();
//		for (int i = 0; i < t; i++) {
//			int a = in.nextInt();
//			int b = in.nextInt();
//			int n = in.nextInt();
//
//			String s = printSeq(a, b, n);
//		}
//		in.close();
		
		String s = printSeq(0, 2, 10);
		System.out.println(s);		

	}

	public  static String printSeq(int a,int b,int n){
	        System.out.println(a+" "+b+ " "+n);
	        Double tmp=new Double(a);
	        StringBuilder sb=new StringBuilder();
	        for(int j=0;j<n;j++){
	            
	               tmp=tmp+Math.pow(2, (j))*b;
//	                System.out.println(" temp val : "+tmp);
	               sb.append(tmp.intValue());
	               sb.append(" ");
	        }
	        
	        return sb.toString();
	    }

}
