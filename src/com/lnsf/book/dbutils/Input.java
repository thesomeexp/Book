package com.lnsf.book.dbutils;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println(getInt("([0-9])|([1-9][0-9]+)|-1"));
    }
    
    /**
     * 输入整数的方法
     */
    public static int getInt() {
        int num = 0;
        String regex = "([0-9])|([1-9][0-9]+)|([-][0-9])";
        do {
            Scanner sc = new Scanner(System.in);
            String nums = sc.next();

            if (nums.matches(regex)) {
                num = Integer.parseInt(nums);
            } else {
                System.err.println(">Invalid input.Please check the input again and retry.");
                continue;
            }
            break;
        } while (true);
        return num;
    }
    /**
     * 根据正则表达式判断输入
     */
    public static int getInt(String regex) {
        int num = 0;
        do {
            Scanner sc = new Scanner(System.in);
            String nums = sc.next();
            
            if (nums.matches(regex)) {
                num = Integer.parseInt(nums);
            } else {
                System.err.println(">Invalid input.Please check the input again and retry.");
                continue;
            }
            break;
        } while (true);
        return num;
    }
    /**
     * 输入字符串的方法
     * @return
     */
    public static String getString() {
        String string = null;
        Scanner sc = new Scanner(System.in);
        string = sc.nextLine();
        return string;
    }
/**
 * 根据长度返回输入字符串
 * @param length
 * @return
 */
    public static String getString(int length) {
        String string = null;
        Scanner sc = new Scanner(System.in);
        string = sc.nextLine();
        while (string.length() > length){
            System.err.println(">Input length is too long,Please check the input again and retry.");
            sc = new Scanner(System.in);
            string = sc.next();
        }
        return string;
    }
}
