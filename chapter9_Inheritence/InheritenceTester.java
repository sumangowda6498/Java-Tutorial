package chapter9_Inheritence;

public class InheritenceTester {
    public static void main(String[] args) {
//        Person person= new Person();
//        person.setName("Suman Gowda");
//        person.setAge(21);
//        person.setGender("MALE");
//
//        person.getAge();
//        person.getGender();
//        person.getName();

        Employee employe= new Employee();//when we call the constructor of subclass the constructor of super class will be called automatically
        employe.setAge(11);
        employe.getTitle();

        Mother mother=new Mother();
        mother.setName("Bhavani");
        System.out.println("\n"+mother.getName()+" is a "+mother.getGender());
    }


}


/*
Constructors in Inheritance

Superclass constructors run first

A superclass's constructor is run before the

subclass's constructor.

Use 'super' to call specific constructors Explicit calls can be made to superclass's constructors from one of the subclass's constructors by using super.

super calls must be first

Explicit calls to the superclass's constructor must be the first statement in the subclass's

constructor.

Some constructor must be executed If the superclass does not have a default constructor, the subclass must explicitly call one

of its other constructors.
has context menu

 */

/*
LIMITATIONS:

Constructors are not inherited
constructors are not technically member of a class and therefore are not inherited.

Public and protected members
All public and protected methods and field in a superclass are inheritedby its subclass

Private members
Private methods and field are not inherited.

Final methods are inherited but cannot be overriden.
 */
