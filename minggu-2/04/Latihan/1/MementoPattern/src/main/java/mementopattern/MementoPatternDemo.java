/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mementopattern;

/**
 *
 * @author lhmyst
 */
public class MementoPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Originator originator = new Originator();
      CareTaker careTaker = new CareTaker();
      
      originator.setState("State #1");
      originator.setState("State #2");
      careTaker.add(originator.saveStateToMemento());
      
      originator.setState("State #3");
      careTaker.add(originator.saveStateToMemento());
      
      originator.setState("State #4");
      System.out.println("Current State: " + originator.getState());		
      
      originator.getStateFromMemento(careTaker.get(0));
      System.out.println("First saved State: " + originator.getState());
      originator.getStateFromMemento(careTaker.get(1));
      System.out.println("Second saved State: " + originator.getState());
    }
    
}
