package TestNG;

import org.example.JavaOOP.InClass4;
import org.junit.Assert;
import org.testng.annotations.Parameters;
import org.junit.Test;

public class ClassUnitTestTwo {

    @Test
    public void TestStringSplosion() {
        Assert.assertEquals(InClass4.StringSplosion("Code"), "CCoCodCode");
    }

    @Test
    public void TestfrontTimes() {
        Assert.assertEquals(InClass4.frontTimes("Chocolate", 2), "ChoCho");
    }
}

//    @Test
//    @Parameters({"num1","num2","sum"})
//    public void testAddition(int num1,int num2,int sum){
//        Assert.assertEquals(InClass4.Addition(num1,num2),sum);
//
//    }
//}

