/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celestial.gitflow.walkthrough;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Selvyn
 */
public class NameBuilderTest
{
    
    public NameBuilderTest()
    {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void test_null_params_result_empty_name() 
    {
        // arrange
        NameBuilder cut = new NameBuilder();
        String[] input = {};
        String expected = "";
        
        // act
        String actual = cut.buildName( input );
        
        // assert
        assertEquals(expected, actual);
    }
}