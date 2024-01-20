package Chapter12CollectionsExercise;

import java.util.Map;

public class GradeBook {
    public static void main(String[] args) {
        Map<String, Integer> gradebook=TestRusults.getOriginalGrades();
        Map<String ,Integer> test2=TestRusults.getMakeUpGrades();

        for (var student:test2.entrySet()){
            Integer firstgrade=gradebook.get(student.getKey());
            Integer secondgrade=test2.get(student.getKey());

            if (firstgrade< secondgrade){
                gradebook.put(student.getKey(), secondgrade);
            }
        }

        System.out.println("Final grades");
        gradebook.forEach((k,v)->System.out.println("Student: "+k+" Grade: "+v));
    }
}
