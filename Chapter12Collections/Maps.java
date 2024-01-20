package Chapter12Collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map fruiteCalories=new HashMap();
        fruiteCalories.put("apple",2);
        fruiteCalories.put("orenge",3);
        fruiteCalories.put("lemon",10);
        fruiteCalories.put("chikku",12);
        fruiteCalories.put("papaya",14);
        fruiteCalories.put("apple",34);

        System.out.println(fruiteCalories.size());//5
        System.out.println(fruiteCalories);//{papaya=14, apple=34, lemon=10, orenge=3, chikku=12}

        System.out.println(fruiteCalories.get("apple"));//34
        System.out.println(fruiteCalories.entrySet());//[papaya=14, apple=34, lemon=10, orenge=3, chikku=12]

        fruiteCalories.remove("orenge");

        System.out.println(fruiteCalories);//{papaya=14, apple=34, lemon=10, chikku=12}
    }
}
