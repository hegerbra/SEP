/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.java.cz.cvut.fel;

import main.java.cz.cvut.fel.HelloGradle;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mhasaj
 */
public class HelloGradleTest {
    
    public HelloGradleTest() {
        
    }
    
    @Test
    public void fib(){       
        assertEquals("values must be same", HelloGradle.fib(1), 1);
        assertEquals("values must be same", HelloGradle.fib(2), 1);
        assertEquals("values must be same", HelloGradle.fib(3), 2);
        assertEquals("values must be same", HelloGradle.fib(4), 3);
        assertEquals("values must be same", HelloGradle.fib(5), 5);
        assertEquals("values must be same", HelloGradle.fib(6), 8);
        assertEquals("values must be same", HelloGradle.fib(7), 13);
        assertEquals("values must be same", HelloGradle.fib(8), 21);
        assertEquals("values must be same", HelloGradle.fib(9), 34);
        assertEquals("values must be same", HelloGradle.fib(10), 55);
        assertEquals("values must be same", HelloGradle.fib(11), 89);
        assertEquals("values must be same", HelloGradle.fib(12), 144);
    }
    
    @Test
    public void fibSum(){
        int n=10;
        long sum = HelloGradle.fibSum(n);
        long sumCheck = HelloGradle.fib(n+2) - 1;
        
        assertEquals("values must be same", sum, sumCheck);
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
    
}

