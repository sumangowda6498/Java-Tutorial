package Collections_and_Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionsEg {
    public static void main(String[] args) {
        set();
        mapDemo();

    }
    public static void set(){
        Set<String> fruit=new HashSet();
            fruit.add("apple");
            fruit.add("lemon");
            fruit.add("papaya");
            fruit.add("1");
        System.out.println(fruit.size());
        System.out.println("\nUsing normal print");
        System.out.println(fruit);


        System.out.println("\n Using iterator print ");
        var i= fruit.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println("\n using forloop");
        for (String item:fruit)
            System.out.println(item);

        System.out.println("\n using forEach");
        fruit.forEach(x-> System.out.println(x));


        System.out.println("\n using forEach shrt cut method");
        fruit.forEach( System.out::println);
    }

    public static void mapDemo() {
        Map<String, Integer> fruitcalories=new HashMap();
        fruitcalories.put("apple",89);
        fruitcalories.put("mango",50);
        fruitcalories.put("pineapple",60);
        fruitcalories.put("chikku",44);

//        System.out.println(fruitcalories.size());
//        System.out.println(fruitcalories);
//        System.out.println(fruitcalories.get("apple"));
//        System.out.println(fruitcalories.entrySet());
//        fruitcalories.remove("apple");
//        System.out.println(fruitcalories);

        for(var entry:fruitcalories.entrySet()){
            System.out.println(entry.getValue());
        }

        fruitcalories.forEach((k,v)-> System.out.println("Fruit:"+k+" Calories: "+v));

    }
}

