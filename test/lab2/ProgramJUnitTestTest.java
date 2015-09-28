import org.junit.*;
import static org.junit.Assert.*;

public class ProgramJUnitTestTest
{
    int [] numbers = new int [4];
    
    @BeforeClass
    public static void setupTests()
    {
        System.out.println("Starting Tests");
    }
    
    @Before
    public void setupTest()
    {
        this.numbers[0] = 5;
        this.numbers[1] = 10;
        this.numbers[2] = 15;
        this.numbers[3] = 20;
    }
    
    @Test
    public void testAddition()
    {
        Program program = new Program();
        this.setupTest();
        int result = program.addition(numbers[0], numbers[1]);
        System.out.println("Test1: result = " + result);
        assertEquals(15, result);
    }
    
    @Test
    public void testMultiply()
    {
        Program program = new Program();
        this.setupTest();
        int result = program.multiply(numbers[2], numbers[3]);
        System.out.println("Test2: result = " + result);
        assertEquals(300, result);
    }
    
    @Test
    public void testDivision()
    {
        Program program = new Program();
        this.setupTest();
        int result1 = program.division(numbers[0], numbers[1]);
        int result2 = program.division(numbers[1], numbers[3]);
        System.out.println(result1 + " " + result2);
        boolean resultsAreEqual = result1 == result2;
        System.out.println("Test3: resultsAreEqual = " + resultsAreEqual);
        assertTrue(resultsAreEqual);
    }
    
    
    @Test
    public void testSubtraction()
    {
        Program program = new Program();
        this.setupTest();
        int result1 = program.subract(numbers[0], numbers[1]);
        int result2 = program.subract(numbers[2], numbers[3]);
        System.out.println(result1 + " " + result2);
        boolean resultsAreEqual = result1.equals(result2);
        System.out.println("Test4: resultsAreEqual = " + resultsAreEqual);
        assertTrue(resultsAreEqual);
    }
    
    @After
    public void teardownTest()
    {
        this.numbers = null;
        System.out.println("Test Finished");
    }
    
    @AfterClass
    public static void teardownTests()
    {
        System.out.println("All Tests Finished");
    }
    
}

