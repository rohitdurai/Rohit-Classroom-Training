package Calculator;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class TestCalculator_junit4 {

    Calculator calc = new Calculator();

    @Before
    public void setUp(){
        System.out.println("Before each test case");
    }

    @BeforeClass
    public static void setUpClass(){
        System.out.println("Before Test suite");
    }
    @Test
    public void addDataSet01() {

        double result = calc.add(10, 50);
        assertEquals(60.0, result, 0);
    }

    @Test
    public void addDataSet02() {

        double result = calc.add(100, 50);
        assertEquals(150, result, 0);
    }

    @Test
    public void addDataSet03(){

    }

    @After
    public void AftersetUp(){
        System.out.println("After each test case");
    }

    @AfterClass
    public static void AftersetUpClass() {
        System.out.println("After Test suite");
    }
}