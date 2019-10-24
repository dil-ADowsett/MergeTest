package com.celestial.gitflow.team2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JSONFormatterTest
{
    @Test
    void test()
    {
        // arrange
        JSONFormatter cut = new JSONFormatter();
        String input = "{}";
        String expected = "{}";
        
        // act
        String actual = cut.format( input );
        
        // assert
        assertEquals(expected, actual);
    }

}