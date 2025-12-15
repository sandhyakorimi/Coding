package Interfaces;

public abstract class Animal implements LivingThings,Humans{

    public void think(){
        System.err.println("Animal cannot think");
    }
    public void eat(){
        System.out.println("Animal can eat");
    }
    @Override
    public void Decide(){
        System.out.println("Animal Can take decisions by own");
    }
}

