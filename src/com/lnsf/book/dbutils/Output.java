package com.lnsf.book.dbutils;

import java.util.Formatter;

public class Output {
    public static Formatter formatter = new Formatter(System.out);
    
    public static void formatterOutput(String string, int length){
        String format = "|    %-" + length + "s    |\n";
        Output.formatter.format(format, string);
    }
    
    public static void printFormat(int num){
        while (num > 0){
            System.out.print("-");
            num--;
        }
        System.out.println();
    }
    
}
