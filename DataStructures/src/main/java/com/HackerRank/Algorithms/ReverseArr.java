package com.HackerRank.Algorithms;

import java.util.Scanner;

/**
 * Created by Manoj.Mohanan Nair on 1/6/2017.
 */
public class ReverseArr {

    public static void main(String [] args){
        Scanner sn = new Scanner(System.in);
        int length = sn.nextInt();
        int[] arr = new int[length];

        for(int i=0;i<length;i++){
            arr[i] = sn.nextInt();
            System.out.println(arr);
        }
    }
}
