package TestNG;

import org.example.JavaOOP.InClass4;
import org.example.StringMethods;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * TestNG (Test next Generation) is a popular testing framework for Java, designed to make testing easier and more flexible.
 * It provides functionalities for writing and running tests, organizing test suites, generating reports, and supporting various
 * types of testing such as unit, integration, and functional testing.
 *
 *
 * ___________Features____________
 * 1> Annotation
 * 2> Test Suites
 * 3> Parameterized Tests
 * 4> Dependency Management
 * 5> Parallel Execution
 * 6> Reporting
 * 7> Listeners
 *
 * __________TestNG Annotations________
 * @Test
 * @BeforeClass / @AfterClass
 * @BeforeSuite / @AfterSuite
 * @BeforeMethod / @AfterMethod
 *
 *
 */

public class ClassUnitTest {

    @Test
    public void testEvryOther(){
        Assert.assertEquals(InClass4.EvryOther("Heeololeo"),"Hello");

    }

    @Test
    public void testArrayNumber(){
        int[] arr1 = {1,1,2,3,1};
        int[] arr2 = {1,1,2,4,1};
        int[] arr3 = {1,1,2,1,2,3};
        Assert.assertTrue(InClass4.Array123(arr1));
        Assert.assertFalse(InClass4.Array123(arr2));
        Assert.assertTrue(InClass4.Array123(arr3));
    }

    @Test
    public void TestStringSplosion(){
        Assert.assertEquals(InClass4.StringSplosion("Code"),"CCoCodCode");
    }

    @Test
    public void TestfrontTimes(){
        Assert.assertEquals(InClass4.frontTimes("Chocolate",2),"ChoCho");
    }

    @Test
    public void TesthelloName(){
            Assert.assertEquals(InClass4.helloName("Marium"),"Hello Marium!");
    }

    @Test
    public void TestfirstHalf(){
        Assert.assertEquals(InClass4.firstHalf("Woohoo"),"Woo");
    }

    @Test
    public void TestendsLy(){
String str = "neatly";
        Assert.assertTrue(InClass4.endsLy(str));
    }

    @Test
    public void TestseeColor(){
        Assert.assertEquals(InClass4.seeColor("redxx"),"red");
    }

    @Test
    public void TestcommonEnd(){
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {1, 2, 3, 4, 5, 6};
        Assert.assertTrue(InClass4.commonEnd(a,b));

    }

    @Test
    public void Teststart1(){
        int[] a = {1, 2, 3};
        int[] b = {1, 3};
        Assert.assertEquals(InClass4.start1(a,b),2);
    }

    @Test
    public void Testntimes(){
        Assert.assertEquals(StringMethods.ntimes("Hello All",2),2);

    }

    @Test
    public void Testdoublex(){
        Assert.assertFalse(StringMethods.doublex("Hellxxhello"),"True");
    }

    @Test
    public void Testoverxx(){
        Assert.assertEquals(StringMethods.overxx("oopxxx"),"oopxxx");
    }

    @Test
    public void Testfind9(){
        int [] array= {1,2,3,4,5,6,9,9,9};
        Assert.assertFalse(StringMethods.find9(array));
    }

    @Test
    public void TestfindYak(){
        Assert.assertEquals(StringMethods.findYak("promiseyakpromise"),"promisepromise");

    }

   @DataProvider(name="myData")
    public Object[][] dataProvider(){
        return new Object[][]{
                {1,2,3},
                {10,2,12},
                {15,5,20}
        };
   }

   @Test(dataProvider = "myData")
    public void testSum(int a, int b, int c){
        Assert.assertEquals(InClass4.Addition(a,b),c);
   }


}
