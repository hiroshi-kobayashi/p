package com.d;

import java.util.Scanner;

/**
 * @author hiroshi.kobayashi
 * @create 2018-03-04
 * @since
 * 時間の表記
 */
public class D074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        System.out.println(time%24);
    }
}
