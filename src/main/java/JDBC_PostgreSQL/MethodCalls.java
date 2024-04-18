package JDBC_PostgreSQL;

import java.sql.SQLException;

public class MethodCalls {
    public static void main(String[] args) throws SQLException{

       //create
       // DATA_CALLS.create("mark","MC Dona","171-345-5678","Mark@example.com");
        DATA_CALLS.create("Mark","Dona","171-345-5678","Mark@example.com");

        //Read
        String Student = DATA_CALLS.Read();
        System.out.println(Student);

        //update
        DATA_CALLS.update("Dona","MC KING",7);

//Delete
        DATA_CALLS.delete(7);
    }
}
