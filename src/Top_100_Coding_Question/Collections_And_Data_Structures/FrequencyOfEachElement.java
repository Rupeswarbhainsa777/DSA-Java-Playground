package Top_100_Coding_Question.Collections_And_Data_Structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class FrequencyOfEachElement {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();

        ArrayList<Integer> li = new ArrayList<>();

        for(int i=1;i<=n;i++){
            int num =sc.nextInt();
            li.add(num);
        }
        frequencyOfEachElement(li);


    }
    public static void frequencyOfEachElement(ArrayList<Integer> li){

        Map<Integer,Integer> map = new HashMap<>();

        for (int num : li){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> ent : map.entrySet()){
            System.out.println(ent.getKey()+" "+ent.getValue());
        }

    }

}
