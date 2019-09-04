/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.annotation;

/**
 *
 * @author lukman
 */
public class DeprecatedTest {
    @Deprecated
    public void Display()
    {
        System.out.println("Deprecatedtest display()");
    }
    
    public void Display2(){
        System.out.println("Not Deprecated display");
    }
    
    public static void main(String args[])
    {
        DeprecatedTest d1 = new DeprecatedTest();
        d1.Display();
        d1.Display2();
        
    }
}
