package SchoolManagementSystem;

public class Main {
    public static void main(String[] args){
        School gsu = new School(10,5);

        Student student1 = new Student("Alice Smith",14,"123 Maple st",1001,"9th" );
        Student student2 = new Student("Jack Smith",13,"234 Maple st",1002,"10th" );

        Teacher teacher1 = new Teacher("Mrs. Wasi",45,"456 lysol ave",8001,"Math","3A");
        Teacher teacher2 = new Teacher("Mr. Talha",42,"890 Obe ave",8011,"History","4C");

        gsu.addStudent(student1);
        gsu.addStudent(student2);

        gsu.addTeacher(teacher1);
        gsu.addTeacher(teacher2);


        student1.enroll("Math 101");
        student1.enroll("Science 101");
        student2.enroll("History 101");
        student2.enroll("Art 101");

        student1.displayInfo();
        student2.displayInfo();
        student1.displayCourses();

        teacher1.assignClassroom("Room 101");
        teacher2.assignClassroom("Room 201");
        teacher2.displaySubject();


        gsu.displayAllStudents();
        gsu.displayAllTeachers();
        gsu.searchTeacherById(1001);


    }
}
