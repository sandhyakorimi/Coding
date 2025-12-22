package Interfaces;

public interface  Humans {
    public void Decide();
    default void walk(){
        System.out.println("can walk");
    }
}
