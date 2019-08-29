package com.kgisl.qs1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Numeric
 */
public class Numeric {

    public static void main(String[] args) {

        int[] num1 = new int[] { 10, 40, 20, 50 };
        Arrays.sort(num1);
        int[] num2=num1;
        for (int i = num2.length-1; i >=0; i--) {
        System.out.println(num2[i]);
        }
        //************* */

        // Arrays.sort(num1);
        // ArrayUtils.reverse(num1);
        // System.out.println(ArrayUtils.toString(num1));
        //************** */

        //Arrays.sort(num1);
        // ArrayUtils.reverse(num1);
        // for (int var : num1) {
        // System.out.println(var);
        // }
        //*************** */

        // Integer[] num=new Integer[]{10,40,20,50};
        // Arrays.sort(num, Collections.reverseOrder());
        // for (Integer var : num) {
        // System.out.println(var);
        // }
        //**************** */

        // int max = 50;
        // for (int i = 0; i < num.length; i++) {
        // if (max > num[i]) {
        // System.out.println(max);
        // break;
        // }
        // }
        // int max1 = 40;
        // for (int i = 0; i < num.length; i++) {
        // if (max1 > num[i]) {
        // System.out.println(max1);
        // break;
        // }
        // }
        // int max2 = 30;
        // for (int i = 0; i < num.length; i++) {
        // if (max2 > num[i]) {
        // System.out.println(max2);
        // break;
        // }
        // }
        // int max3 = 20;
        // for (int i = 0; i < num.length; i++) {
        // if (max3 > num[i]) {
        // System.out.println(max3);
        // break;
        // }
        // }
        // int max4 = 10;
        // for (int i = 0; i < num.length; i++) {
        // if (max4 >= num[i]) {
        // System.out.println(max4);
        // break;
        // }
        // }
    }
}