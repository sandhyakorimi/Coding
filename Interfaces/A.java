         //      ****** Multiple inheritance in classes
 
// package Interfaces;

// public class A{
//     public void method(){
//         System.out.println("class A");
//     }
// }
// public class B {
//     public void method(){
//         System.out.println("Class B");
//     }
// }
// public class C extends A,B{
//     method();
// }



package Interfaces;

public interface A{
    public void method();
}
public interface B {
    public void method();
}
public class C extends A,B{
    public void method(){
        System.out.println("method implimentation");
    }
}

