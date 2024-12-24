package com.shivam.Journal.App.controller;

public class SearchElement {
    public static void main(String[] args) {
        int[] arr = {3,4,6,8,9,};
        int k = 6;

        System.out.println(searchElement(arr , k));
    }
    public static int searchElement(int[] arr, int k) {
       int n = arr.length;
       int l = 0;
       int h = n-1;

       while(l<h) {
           int mid = l + (h-l)/2;
           if(arr[mid] == k) {
               return mid;
           } else if(arr[mid] > k) {
                   h = mid-1;
               } else {
                   l = mid +1;
               }
       }
       return -1;
    }

}
