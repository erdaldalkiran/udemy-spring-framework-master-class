package  com.demo.junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class MyMathTest {

    private static MyMath myMath;

    @BeforeAll
    public static void beforeAll(){
        System.out.println("BeforeAll");
        myMath = new MyMath();
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("AfterAll");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("BeforeEach");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("AfterEach");
    }

    @Test
    public void sum_with3numbers(){
        System.out.println("sum_with3numbers");
        var expectedResult = 6;
        var result = myMath.Sum(new int[]{1, 2, 3});

        assertEquals(expectedResult, result);
    }

    @Test
    public void sum_with1number(){
        System.out.println("sum_with1number");
        var expectedResult = 1;
        var result = myMath.Sum(new int[]{1});

        assertEquals(expectedResult, result);
    }

    @Test
    public void sum_withnonumbers(){
        System.out.println("sum_withnonumbers");
        var expectedResult = 0;
        var result = myMath.Sum(new int[]{});

        assertEquals(expectedResult, result);
    }
}
