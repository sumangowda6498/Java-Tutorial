package Chapter12Collections;

//import java.util.HashSet;
//import java.util.Set;
import java.util.*;

public class Collectionsdemo {
    public static void main(String[] args){
       // setDemo();
       // listDemo();
       // queueDemo();
        mapDemo();
    }
    public static void setDemo(){
        Set fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size()); //4
        System.out.println(fruit); //[banana, orange, apple, lemon]

        System.out.println("using while Iterator");
        var i= fruit.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println("\n Using for loop");
        for (Object item:fruit){
            System.out.println(item);
        }

        fruit.forEach(System.out::println);

        fruit.forEach(x-> System.out.println(x));
    }
    public  static void mapDemo(){
        Map<String,Integer> fruitCalories=new HashMap();
        fruitCalories.put("apple",95);
        fruitCalories.put("mango",90);
        fruitCalories.put("lemon",95);
        fruitCalories.put("papaya",48);
        fruitCalories.put("orenge",80);
        fruitCalories.put("apple",34);
//
//        System.out.println(fruitCalories.size()); //5
//        System.out.println(fruitCalories); //{papaya=48, apple=34, lemon=95, orenge=80, mango=90}
//
//        System.out.println(fruitCalories.get("apple"));//34
//
//        System.out.println(fruitCalories.entrySet());//[papaya=48, apple=34, lemon=95, orenge=80, mango=90]
//
//        fruitCalories.remove("orenge");
//        System.out.println(fruitCalories);//{papaya=48, apple=34, lemon=95, mango=90}

//           for (var entry:fruitCalories.entrySet()){
//               System.out.println(entry.getValue());//48 34 95 80 90
//           }

           fruitCalories.forEach((k,v)-> System.out.println("Fruit: "+k+" Calories: "+v));
    }
}
