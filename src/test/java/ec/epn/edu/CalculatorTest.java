package ec.epn.edu;
import org.junit.*;
import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator c;
    @BeforeClass
    public static void setUpClass(){
        System.out.println("setUpClass");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("setUp");
        c = new Calculator();
    }

    @Test
    public void testSuma() {
        double resultado = c.sumar(1.0, 5.0);
        assertEquals(6.0, resultado, 0);
    }

    @Test
    public void testResta() {
        double resultado = c.restar(10.0, 4.0);
        assertEquals(6.0, resultado, 0);
    }

    @Test
    public void testMultiplicacion() {
        double resultado = c.multiplicar(3.0, 4.0);
        assertEquals(12.0, resultado, 0);
    }

    @Test
    public void testDivision() {
        double resultado = c.dividir(15.0, 3.0);
        assertEquals(5.0, resultado, 0);
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("tearDown");
    }

    @AfterClass
    public static void tearDownClass(){
        System.out.println("tearDownClass");
    }
}