package GreedyAlgorithm;

import java.util.Arrays;

public class NMeetingInOneRoom {
    public static void main(String[] args) {

    }

    public int maxMeetings(int start[], int end[]) {

        int n = start.length;

        int[][] arr = new int[n][2]; // n rows, 2 columns

        for (int i = 0; i < n; i++) {
            arr[i][0] = start[i]; // start time
            arr[i][1] = end[i];   // end time
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));
        int count =1;
        int freeTime = arr[0][1];

        for (int i=1;i<arr.length;i++){
            if(arr[i][0]>freeTime){
                count++;
                freeTime= arr[i][1];
            }
        }
        return count;

    }
}
