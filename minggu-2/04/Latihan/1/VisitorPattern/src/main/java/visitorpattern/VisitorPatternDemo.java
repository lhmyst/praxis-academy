/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitorpattern;

/**
 *
 * @author lhmyst
 */
public class VisitorPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ComputerPart computer = new Computer();
      computer.accept(new ComputerPartDisplayVisitor());
    }
    
}
