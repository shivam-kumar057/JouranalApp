package com.shivam.Journal.App.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class hashMap {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int len = sc.nextInt();
        int[] arr = {1,3,2};
//        for(int i=0 ; i<arr.length ; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for(int i= 0 ; i<arr.length ; i++) {
//            System.out.print(arr[i] + " ");
//        }
        System.out.println(Arrays.toString(printSum(arr)));
    }
    public static int[] printSum(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
//        System.out.println(map.put(5,8));
        for(int i=0 ; i<arr.length ; i++) {
           map.put(i,arr[i]+2);

        }
        if(map.containsKey(7643)); {
            System.out.println("shivam "+map.get(47));
        }
//        System.out.println(map.get(5));
        System.out.println(map);
       return arr;
    }
}
