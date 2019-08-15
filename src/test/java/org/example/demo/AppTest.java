package org.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public  void shouldReturn_the_Sum(){
        //arrange
        Integer expected=3;
        Calculator calculator= new Calculator();
        //act
        Integer result= calculator.add(1,2);
        //assert
        assertEquals(expected, result);
    }
}