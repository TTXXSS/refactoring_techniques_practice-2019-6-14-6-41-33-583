package com.tws.refactoring.extract_method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class OwingPrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void should_return_owing() {
        //given
        OwingPrinter owingPrinter = new OwingPrinter();
        Order order = new Order(10);
        String name = "Jack";
        List<Order> listOfOrder = new ArrayList<>();
        listOfOrder.add(order);
        //when
        owingPrinter.printOwing(name,listOfOrder);
        String s ="*****************************\r\n"+"****** Customer totals ******\r\n" +
                "*****************************\r\n"+
                "name: Jack\r\n"+"amount: 10.0\r\n";
        //then
        assertEquals(s, outContent.toString());
    }
}