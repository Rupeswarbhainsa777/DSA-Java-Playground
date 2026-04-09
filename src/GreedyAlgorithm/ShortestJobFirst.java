package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class ShortestJobFirst {
    public static void main(String[] args) {

        int arr[] = {4, 3, 7, 1, 2};

        System.out.println(solve(arr));
    }

    public static int solve(int bt[]) {
        Arrays.sort(bt);

        int t = 0;
        int watingTime = 0;


        for (int i = 0; i < bt.length; i++) {

            watingTime = watingTime + t;

            t = t + bt[i];
            System.out.println("wating time " + watingTime + " Time" + t);


        }
        return watingTime / bt.length;


    }
}
