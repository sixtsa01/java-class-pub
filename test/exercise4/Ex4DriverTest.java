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
        String text = "";
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = null;
        Integer result = instance.task2(text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of task3 method, of class Ex4Driver.
     */
    @Test
    public void testTask3() {
        System.out.println("task3");
        Character letter = null;
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = null;
        Integer result = instance.task3(letter);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of task4 method, of class Ex4Driver.
     */
    @Test
    public void testTask4() {
        System.out.println("task4");
        String text = "";
        Ex4Driver instance = new Ex4Driver();
        Character expResult = null;
        Character result = instance.task4(text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of task5 method, of class Ex4Driver.
     */
    @Test
    public void testTask5() {
        System.out.println("task5");
        Integer n = null;
        Integer m = null;
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = null;
        Integer result = instance.task5(n, m);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of task6 method, of class Ex4Driver.
     */
    @Test
    public void testTask6() {
        System.out.println("task6");
        String text = "";
        Integer n = null;
        Ex4Driver instance = new Ex4Driver();
        Character expResult = null;
        Character result = instance.task6(text, n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of task7 method, of class Ex4Driver.
     */
    @Test
    public void testTask7() {
        System.out.println("task7");
        Integer[] intArr = null;
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = null;
        Integer result = instance.task7(intArr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of task8 method, of class Ex4Driver.
     */
    @Test
    public void testTask8() {
        System.out.println("task8");
        Integer[] intArr = null;
        Integer n = null;
        Ex4Driver instance = new Ex4Driver();
        Boolean expResult = null;
        Boolean result = instance.task8(intArr, n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of task9 method, of class Ex4Driver.
     */
    @Test
    public void testTask9() {
        System.out.println("task9");
        ArrayList<String> arrList = null;
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = null;
        Integer result = instance.task9(arrList);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of task10 method, of class Ex4Driver.
     */
    @Test
    public void testTask10() {
        System.out.println("task10");
        HashMap<Integer, Integer> hash = null;
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = null;
        Integer result = instance.task10(hash);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
