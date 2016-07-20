/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.DataAbstraction.obj;

import java.util.Scanner;

/**
 *
 * @author shneha
 */
public class Maximum extends Calculation{

    @Override
    public void inputs() {
         Scanner input=new Scanner(System.in);
        System.out.println("enter first number: ");
        int x= input.nextInt();
         System.out.println("enter second number: ");
        int y= input.nextInt();
            int total;
      total=(x>y)?x:y;
      System.out.println("Total " +total);
        total=(x>y)?x:y;
    }

    @Override
    public void close() {
      System.exit(0);
    }
    
}
