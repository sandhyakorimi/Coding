package Interfaces;

public interface LivingThings {
    public void think();
    public void eat();

    // from java 1.8
    default void hello(){    
        personal();                     //  static method in non-static possible
        forThisInterfaceReuse();                                         // public is default specifier in interface
        System.out.println("HElloo");
    }

    static void personal(){   
        // hello();       
        forThisInterfaceReuse();          // non-static method in static not fit
        System.out.println("Personal");
    }

    // from java 1.9 for reuse method in this interface only
    private static void forThisInterfaceReuse(){
        System.out.println("IN this interface only");
    }
}

