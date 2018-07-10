package com.d;

import java.util.Scanner;

/**
 *  数の比較
 * @author hiroshi.kobayashi
 * @create 2018-07-10
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(a);
        }else if (a < b){
            System.out.println(b);
        }else {
            System.out.println("eq");
        }
    }
}
