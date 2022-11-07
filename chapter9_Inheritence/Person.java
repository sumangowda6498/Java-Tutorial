package chapter9_Inheritence;

public class Person {


//    public Person(){        //default constructor of Person class //if we remove this default constructor then error will occur in the constructor of Employee class "There is no default constructor available in chapter9_Inheritence "
//        System.out.printf("this is the default constructor of Person");
//    }
//    public Person(String name){   //constructor of person class which takes the parameter string
//        System.out.printf("In person second constructor .name is set\n");
//    }
    public String name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
