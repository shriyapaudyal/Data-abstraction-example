/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.DataAbstraction;

import com.leapfrog.DataAbstraction.obj.Addition;
import com.leapfrog.DataAbstraction.obj.Calculation;
import com.leapfrog.DataAbstraction.obj.CalculationFactory;
import com.leapfrog.DataAbstraction.obj.Subtraction;
import java.util.Scanner;

/**
 *
 * @author shneha
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    

       
        CalculationFactory Factory=new CalculationFactory();
        Calculation c = Factory.get("power");
        
        c.inputs();
        while(true){
       Scanner input=new Scanner(System.in);
         System.out.println("Do You Want To Continue[y/n] : ");
         String ch = input.next();
        if(ch.equalsIgnoreCase("y"))
        {
    
          c.inputs();
        } 
        else 
           c.close();
        }
              // TODO code application logic here
    }
    
}
