package com.d;

import java.util.*;

/**
 * N倍の文字列
 * @author hiroshi.kobayashi
 * @create 2018-07-01
 */

 public class D007Main {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        convertToAsterisk(N);
    }
    
    public static void convertToAsterisk(int n) {
		for(int i = 0; i < n ; i++){
			System.out.print("*");
		}
    }
}
