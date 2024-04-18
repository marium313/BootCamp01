package JDBCTestData;

import JDBC_PostgreSQL.DATA_CALLS;
import JavaIO.JavaIOExcelFile;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DataCallsTest {

@Test
    public void getDataTest() throws Exception {
    String ActualData = DATA_CALLS.Read();
    System.out.println(DATA_CALLS.Read().length());
    String ExpectedData = JavaIOExcelFile.readFile();
    System.out.println(JavaIOExcelFile.readFile().length());

    Assert.assertEquals(ActualData.trim(), ExpectedData.trim(),"Data returned does not match");


    }
}
