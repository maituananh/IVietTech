/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Arrays;

/**
 *
 * @author nals_macbook_187
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char c;
//        int i = 0;

        String a = "mai tuan anh";
        String[] splipA = a.split("");
        System.out.println(Arrays.toString(splipA));
        
//        for (c = 'A'; c <= 'Z'; ++c) {
//            for (int i = 0; i < splipA.length; i++) {
//                if (splipA[i].equals(String.valueOf(c))) {
//                    splipA[i] = splipA[i].toLowerCase();
//                }
//            }
//        }
//
int count = 0;
        for (int i = 0; i < splipA.length; i++) {
            if ("a".equals(splipA[i])) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }

    public static void function1(int x, float y) {
        System.out.println(x + " " + y);

        System.out.println(x + (int) y);
    }

}
