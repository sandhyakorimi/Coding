package Interfaces;
// Abstract classes are used to create abstract methods bcz of we have a common methods for multiple classes and 
// some of the contains implimentations and some not then if we want to store that abstact methods as interfaces and 
// and methods with implimentations as classes we use abstract classes here "abstraction occurs" but "not multiple inheritance" as i
// interface. 
// and need abstract keyword before class keyword in class and return type in abstarct methods 
public abstract class AbstractClasses implements LivingThings {
    public void eat(){
        System.out.println("Animals must eat");
    }
    public abstract void think();
}
