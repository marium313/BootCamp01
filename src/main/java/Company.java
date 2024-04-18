public class Company {

    //create a class called company which has
    //model number
    //model name
    //number of wheels
    //it can start
    //it can stop

    int number;
    String name;
    int wheels;
    String description;

    public Company(int number, String name, int wheels, String description) {
        this.number = number;
        this.name = name;
        this.wheels = wheels;
        this.description = description;
    }
public void start(){
    System.out.println(name + " " + "Starting engine" );
}

public void end(){
    System.out.println(name + " " + "Stop engine" );
}
        public void printAll(){
            System.out.println(number + " " + name + " " + wheels + " " + description);
        }

        public static void main (String[] args){
            Company obj = new Company(1, "Corolla", 4, "It is black in color");
            obj.printAll();
            obj.start();
            obj.end();

            Company obj2 = new Company(2, "Civic", 4,"it is silver in color");
            obj2.printAll();
            obj2.start();
            obj2.end();

        }
    }

