package Collections_and_Map;

import java.util.Map;

public class FinalMark
{
    public static void main(String[] args) {
        Map<String,Integer>  original=TestResults.getOriginalGrades();
        Map<String,Integer>  makeUp=TestResults.getMakeUpGrades();

        for (var student:makeUp.entrySet()){
            Integer firstgrade=original.get(student.getKey());
            Integer secondgrade=makeUp.get(student.getKey());
            if(firstgrade<secondgrade){
                original.put(student.getKey(),secondgrade);
            }
        }
         /*
            The forEach is used here to demonstrate another approach to looping.
            However, in reality, I would have added a print statement inside of
            the loop above so that the program does not have to loop over this map
            for a second time. This would be a more efficient approach:
            System.out.println("Student: " + student.getKey() + ", Grade:" + gradeBook.get(student.getKey()));
        */

        System.out.println("Final mark is");
       original.forEach((k,v)-> System.out.println(k+" "+v));

    }
}
