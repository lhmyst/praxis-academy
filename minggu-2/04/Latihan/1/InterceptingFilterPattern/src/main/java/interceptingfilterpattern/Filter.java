/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interceptingfilterpattern;

/**
 *
 * @author lhmyst
 */
public interface Filter {
   public void execute(String request);
}