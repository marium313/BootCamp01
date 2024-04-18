public class Objects {
/*
* State: represents the data (value) of an object
* Behavior: represents the behavior (functionality) of an object such as deposit, withdraw, etc.
* Identity: An object identity is typically implemented via a unique ID. The value of the id is
* not visible to the external user. However, it is used internally by the JVM to identify each
* object uniquely.
 */
    int id;
    String name;
    String description;

    public Objects(int id, String name, String description){
        this.id = id;
        this.name = name;
        this.description = description;
    }
    public void add(){
        System.out.println("this is doing something...");
    }

    public void printall(){
        System.out.println(id + " " + name + " " + description);
    }

    public static void main(String[] args){
        Objects obj = new Objects(1,"abc","this is example");
        Objects obj2 = new Objects(2,"def","this is next example");
        obj.printall();
        obj2.printall();
        obj.add();
    }

    //create a class called company which has
        //model number
        //model name
        //number of wheels
        //it can start
        //it can stop


}
