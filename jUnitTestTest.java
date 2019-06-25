/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jUnitTest;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author isaacfuentes
 */
public class jUnitTestTest {
   
    //Create 4 different inputs and scenarios to ensure that the
    //test is able to find the bigger number and display it on the
    //Screen.
    @Test
    public void testBigger_number_case1() {        
        int a = 10;
        int b = 6;
        int c = 14;
        jUnitTest instance = new jUnitTest();
        int expResult = 14;
        int result = instance.bigger_number(a, b, c);
        assertEquals(expResult, result);        
    }

    @Test
    public void testBigger_number_case2() {        
        int a = 10;
        int b = 6;
        int c = 8;
        jUnitTest instance = new jUnitTest();
        int expResult = 10;
        int result = instance.bigger_number(a, b, c);
        assertEquals(expResult, result);        
    }
    
    @Test
    public void testBigger_number_case3() {        
        int a = 10;
        int b = 14;
        int c = 12;
        jUnitTest instance = new jUnitTest();
        int expResult = 14;
        int result = instance.bigger_number(a, b, c);
        assertEquals(expResult, result);        
    }
    
    @Test
    public void testBigger_number_case4() {        
        int a = 10;
        int b = 14;
        int c = 18;
        jUnitTest instance = new jUnitTest();
        int expResult = 18;
        int result = instance.bigger_number(a, b, c);
        assertEquals(expResult, result);        
    }
    
}
