public class Example2 {

    int id;
    String name;

}
class Student{
    public static void main(String[] args) {
        Example2 obj = new Example2();
        obj.id = 100;
        obj.name = "Java";
        System.out.println(obj.id + " " + obj.name);

        Example2 obj1 = new Example2();
        obj1.id = 101;
        obj1.name = "JavaScript";
        System.out.println(obj1.id + " " + obj1.name);

    }
}
