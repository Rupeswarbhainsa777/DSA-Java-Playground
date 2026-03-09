package Leetcode_150;

import java.util.*;

public class GroupAnagarm{
    public static void main(String[] args) {

        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(groupAnagrams(strs));

    }


    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for(String st : strs){

            String key = isSorted(st);
            if(map.containsKey(key)){
                map.get(key).add(st);

            }
            else {
                List<String> li = new ArrayList<>();
                li.add(st);
                map.put(key,li);
            }


        }

        return new ArrayList<>(map.values());


    }



    public static String isSorted(String s){
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }




}
