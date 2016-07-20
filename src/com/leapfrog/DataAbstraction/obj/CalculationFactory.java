/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.DataAbstraction.obj;

/**
 *
 * @author shneha
 */
public class CalculationFactory {
    public Calculation get(String key){
        
    if(key.equalsIgnoreCase("addition"))
    {
        return new Addition();
      
        
    }else if(key.equalsIgnoreCase("substraction"))
    {
        return new Subtraction();
               
    }else if(key.equalsIgnoreCase("multiplication"))
    {
        return new Multiplication();
    }else if(key.equalsIgnoreCase("division"))
    {
        return new Division();
    }else if(key.equalsIgnoreCase("maximum"))
    {
        return new Maximum();
    }else if(key.equalsIgnoreCase("maximum"))
    {
        return new Minimum();
    }else if(key.equalsIgnoreCase("power"))
    {
        return new Power();
    }
         return null;
    
    }
}
