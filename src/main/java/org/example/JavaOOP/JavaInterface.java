package org.example.JavaOOP;
/*
*an interface in java is a blueprint of a class. It has static and abstract methods.
* the interface is java mechanism to achieve abstraction.
* there can only be abstract methods in java interface.
* no method body is used.
* by this way we can achieve multiple inheritance. - two parents
* we can achieve loose coupling by implementing interface.
*
 */
public class JavaInterface {
    public static void main(String[] args){
        bank bank1 = new Chase();
        System.out.println("ROI: " + bank1.ROI());

        bank bank2 = new WellsFargo();
        System.out.println("ROI: " + bank2.ROI());

    }
}

interface bank{
    float ROI();
}

class Chase implements bank{
    public float ROI(){
        return 12.99f;
    }
}
class WellsFargo implements bank{
    public float ROI(){
        return 12.99f;
    }
}