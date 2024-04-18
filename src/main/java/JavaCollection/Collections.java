package JavaCollection;
/*
* Collections in java is a framework that provides an architecture to store and manipulate the group of objects
*
* java collections can achieve all the operations that you perform on a data such as searching, sorting, insert,
* manipulation and deletion.
*
* what is a collection?
* A collection in java represents a single unit of object or a group.
* Java collections provide a ready-made architecture.
* it represents a set of classes and interfaces
* it is optional
* it is an algorithm
*
*
*
*                                         Iterable(Interface)
*                                                 |
*                                        Collection(Interface)
*                                                 |
*   List(Interface)                         Queue(Interface)                          Set(Interface)
*        |                                        |                                        |     |
*  ArrayList(class)                    priorityQueue(class)                                |   HashSet(class)
*    LinkedList                              deque(Interface)                              |   LinkedHashSet(class)
*    Vector(class)                         ArrayDeque(class)                               |
*     Stack(class)                                                                      SortedSet(Interface)
*                                                                                         TreeSet(class)
* What is a Iterator Interface?
* iterator interface provides the facility if iterating the elements in a forward direction
*
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Collections {
    public static void main(String[] args) {
        ArrayListExample();

    }

    public static void ArrayListExample() {
        ArrayList<String> AL = new ArrayList<String>();

        AL.add("Java");
        AL.add("Python");
        AL.add("C++");
        AL.add("Ruby");
        AL.add("PHP");
        AL.add("C#");

        int size = AL.size();
        System.out.println(size);

        boolean contain = AL.contains("Java");
        System.out.println(contain);

        AL.remove("Java");
        System.out.println(AL);

        System.out.println(AL.get(0)); //get the first element
        System.out.println(AL.get(1)); //get the second element

        System.out.println(AL.indexOf("Python")); //get the index of the element

        Iterator itr = AL.iterator(); //initializing interface of Iterator interface

        while (itr.hasNext()) {
            System.out.println(itr.next());// running while loop and iteration over the array will give us each element

        }
        System.out.println(AL); //Original it is a String Array
    }

//Write a Java program that utilizes an ArrayList to manage the student roster. Implement methods to perform the following operations:
//
//Add a new student to the roster.
//Remove a student from the roster by their student ID.
//Search for a student by their name and return their information (student ID, name, etc.)
//Update the information of an existing student (e.g., change their name or other attributes).
//Display the entire roster of students.

}

class Student {
    private int id;
    private String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Student id= " + id + ", name= " + name;

    }
}
class StudentRoster{
    private ArrayList<Student> roster;

    public StudentRoster(){
        roster = new ArrayList<>();
    }

    public void addStudent(int id, String name){
        roster.add(new Student(id, name));

    }
    public void removeStudent(int id){
        for(int i = 0; i < roster.size(); i++){
            if(roster.get(i).getId() == id){
                roster.remove(i);
                System.out.println("Student " + id + " has been removed from the roster.");
                return;
            }
        }
        System.out.println("Student with ID: " + id + " not found.");
    }
    public Student searchStudentByName(String name){
        for(Student student : roster){
            if(student.getName().equalsIgnoreCase(name)){
                return student;
            }
        }
        return null;
    }
    public void updateStudent(int id, String NewName){
        for(Student student : roster) {
            if (student.getId() == id) {
                student.setName(NewName);
                System.out.println("Student: " + id + " has been updated");
                return;
            }
        }

            System.out.println("Student with ID: " + id + " not found.");
        }

        public void dislayRoster(){
            if(roster.isEmpty()){
                System.out.println("Roster empty");
                return;
            }
            System.out.println("Student roster: ");
            for(Student student : roster){
                System.out.println(student);
            }
        }
    }

class main{
    public static void main(String[] args){
        StudentRoster roster = new StudentRoster();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("\nChoose an option");
            System.out.println("1. Add a new student");
            System.out.println("2. Remove a student");
            System.out.println("3. Search a student");
            System.out.println("4. update a student");
            System.out.println("5. Display roster");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newLine

            switch(choice){
                case 1:
                    System.out.println("Enter student id");
                    int id = scanner.nextInt();
                    System.out.println("Enter student Name");
                    scanner.nextInt(); // consume newLine
                    String name = scanner.nextLine();
                    roster.addStudent(id, name);
                    break;
                case 2:
                    System.out.println("Enter student id to remove");
                    int RemoveId = scanner.nextInt();
                    roster.removeStudent(RemoveId);
                    break;
                case 3:
                    System.out.println("Enter student name to search: ");
                    String SearchName = scanner.nextLine();
                    Student searchedStudent = roster.searchStudentByName(SearchName);
                    if(searchedStudent != null){
                        System.out.println("Student found: " + searchedStudent);
                    }else {
                        System.out.println("Student not found: ");
                    }
                    break;
                case 4:
                    System.out.println("Enter student id");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); //consume newLine
                    System.out.println("Enter new name");
                    String newName = scanner.nextLine();
                    roster.updateStudent(updateId, newName);
                    break;
                case 5:
                    roster.dislayRoster();
                    break;
                case 6:
                    System.out.println("Exiting application...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");

            }
        }
    }
}
