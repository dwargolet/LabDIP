/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab2;

/**
 *
 * @author dworgolet
 */
public class ConsoleOutput implements TipOutput{

    @Override
    public void outPutTip(double tip) {
        System.out.println("Total tip to leave: $" + TipCalculationManager.getTip());
    }
    
    
    
    
}
