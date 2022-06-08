package com.mycompany.propertymanagement.controller;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CalculatorControllerTest {
    @InjectMocks
    private CalculatorController calculatorController;


    @BeforeEach
    void init(){
        System.out.println("Initialization");
    }
    @AfterEach
    void destroy(){
        System.out.println("Destroying");
    }


    @Test
    @DisplayName("Test addition sucess scenario")
    void testAddFunction_Success()
    {
    Double result=calculatorController.add(2.0,2.0,1.0);
    Assertions.assertEquals(4.0,result);
}

    @Test
    @DisplayName("Test addition failure scenario")
    void testAddFunction_Failure()
    {
        Double result=calculatorController.add(2.0,2.0,1.0);
        Assertions.assertNotEquals(5.0,result);
    }}
