package com.d

import java.util.Scanner;

/**
 * 文字の反転
 * @author hiroshi.kobayashi
 * @create 2018-03-03
 * @since
 */
public class D073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] chars = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        int length = chars.length;
        for (int i = 0; i < length; i++) {
            sb.append(chars[length - 1 - i]);
        }
        System.out.println(sb);
    }
}
