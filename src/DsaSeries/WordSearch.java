//package DsaSeries;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//public class WordSearch {
//    public static void main(String[] args) {
//
//        char arr[][] = {
//                {'A', 'B', 'C', 'E'},
//                {'S', 'F', 'C', 'S'},
//                {'A', 'D', 'E', 'E'}
//        };
//        exist(arr, "ABCCED");
//
//    }
//
//    public static void exist(char[][] board, String word) {
//
//        List<Character> list = new ArrayList<>();
//        List<Character> list1 = new ArrayList<>();
//
//        char ch[] = word.toCharArray();
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[i].length; j++) {
//                list.add(board[i][j]);
//
//            }
//        }
//        Collections.sort(list);
//        list.contains(list1);
//
//
//    }
//}
