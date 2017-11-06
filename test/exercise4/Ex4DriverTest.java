/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

import java.util.ArrayList;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yasiro01
 */
public class Ex4DriverTest {
  
  public Ex4DriverTest() {
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
  }

    /**
     * Test of task1 method, of class Ex4Driver.
     */
    @Test
    public void testTask1() {
        System.out.println("task1");
        Integer n = 8;
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 16;
        Integer result = instance.task1(n);
        assertEquals(expResult, result);
        n = 9;
        expResult = 18;
        result = instance.task1(n);
        assertEquals(expResult, result);
    }

    /**
     * Test of task2 method, of class Ex4Driver.
     */
    @Test
    public void testTask2() {
        System.out.println("task2");
        String text = "hello";
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 5;
        Integer result = instance.task2(text);
        assertEquals(expResult, result);
        text = "Samantha";
        expResult = 8;
        result = instance.task2(text);
        assertEquals(expResult, result);
    }

    /**
     * Test of task3 method, of class Ex4Driver.
     */
    @Test
    public void testTask3() {
        System.out.println("task3");
        Character letter = 'A';
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 65;
        Integer result = instance.task3(letter);
        assertEquals(expResult, result);
        letter = 'B';
        expResult = 66;
        result = instance.task3(letter);
        assertEquals(expResult, result);
    }

    /**
     * Test of task4 method, of class Ex4Driver.
     */
    @Test
    public void testTask4() {
        System.out.println("task4");
        String text = "hello";
        Ex4Driver instance = new Ex4Driver();
        Character expResult = 'h';
        Character result = instance.task4(text);
        assertEquals(expResult, result);
        text = "Samantha";
        expResult = 'S';
        result = instance.task4(text);
        assertEquals(expResult, result);
    }

    /**
     * Test of task5 method, of class Ex4Driver.
     */
    @Test
    public void testTask5() {
        System.out.println("task5");
        Integer n = 5;
        Integer m = 6;
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 30;
        Integer result = instance.task5(n, m);
        assertEquals(expResult, result);
        n = 8;
        m = 6;
        expResult = 48;
        result = instance.task5(n, m);
        assertEquals(expResult, result);
    }

    /**
     * Test of task6 method, of class Ex4Driver.
     */
    @Test
    public void testTask6() {
        System.out.println("task6");
        String text = "hello";
        Integer n = 3;
        Ex4Driver instance = new Ex4Driver();
        Character expResult = 'l';
        Character result = instance.task6(text, n);
        assertEquals(expResult, result);
        text = "hello";
        n = 4;
        expResult = 'o';
        result = instance.task6(text, n);
        assertEquals(expResult, result);
    }

    /**
     * Test of task7 method, of class Ex4Driver.
     */
    @Test
    public void testTask7() {
        System.out.println("task7");
        Integer[] intArr = {1,2,3,4,5};
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 5;
        Integer result = instance.task7(intArr);
        assertEquals(expResult, result);
        expResult = 5;
        result = instance.task7(intArr);
        assertEquals(expResult, result);
    }

    /**
     * Test of task8 method, of class Ex4Driver.
     */
    @Test
    public void testTask8() {
        System.out.println("task8");
        Integer[] intArr = {1,2,3,4,5};
        Integer n = 6;
        Ex4Driver instance = new Ex4Driver();
        Boolean expResult = false;
        Boolean result = instance.task8(intArr, n);
        assertEquals(expResult, result);
        n = 3;
        expResult = true;
        result = instance.task8(intArr, n);
        assertEquals(expResult, result);
    }

    /**
     * Test of task9 method, of class Ex4Driver.
     */
    @Test
    public void testTask9() {
        System.out.println("task9");
        ArrayList<String> arrList = new ArrayList<String>();
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 0;
        Integer result = instance.task9(arrList);
        assertEquals(expResult, result);
    }

    /**
     * Test of task10 method, of class Ex4Driver.
     */
    @Test
    public void testTask10() {
        System.out.println("task10");
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        HashMap newmap = new HashMap();
        newmap.put(5,4);
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 0;
        Integer result = instance.task10(hash);
        assertEquals(expResult, result);
    }

}
