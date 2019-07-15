package com.tws.refactoring.extract_method;
import com.tws.refactoring.extract_variable.PriceCalculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


public class PriceCalculatorTest {
    @Test
    public  void should_return_right_price(){
        //given
        PriceCalculator priceCalculator = new PriceCalculator();
        //when
        double price = priceCalculator.getPrice(1,1);

        //then
        assertEquals(1.1,price,0.0);
    }
}
