package BinaryTreeGeneral;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.offer(2);
        queue.poll();

        for (int x : queue){
            System.out.println(x+" ");
        }


    }

}
