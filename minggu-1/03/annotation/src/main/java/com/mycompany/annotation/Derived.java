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
public class Derived extends Base {
    
    
    /**
     *
     */
     @Override
     public void display()
     {
         System.out.println("Derived display()");
     }
     public static void main(String args[])
     {
         Derived obj = new Derived();
         obj.display();
     }
    
}
