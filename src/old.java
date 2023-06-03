/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fithivesystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author 96653
 */
public class FitHiveSystem {

    public static void main(String[] args) throws IOException {
  File ClientFile=new File("client.txt");
        FileWriter writer=new FileWriter(ClientFile,true);
        PrintWriter pwriter=new PrintWriter(writer,true);
         Scanner input=new Scanner(System.in);
         
                  pwriter.println("                                     Client Informtion File");

        System.out.println("Enter your First and Last name:");
         String fname=input.next(); String lname=input.next();
           pwriter.println("Name:"+ fname +" "+lname);
         
           
           
         System.out.println("Are you Male or Female:");
         String sex=input.next();
         pwriter.println("Sex:"+sex);
       
         
           
         System.out.println("Enter your Age:");
         String age=input.next();
          pwriter.println("Age:"+ age);
          
          System.out.println("Enter your Height in cm:");
         double height=input.nextDouble();
          pwriter.println("Height:"+ height);
          
          System.out.println("Enter your Weight in kg :");
         double weight=input.nextDouble();
          pwriter.println("Weight:"+ weight);
          
          double BMI=Math.round(calculateBMI(height,weight));
          if(BMI<= 18)
          pwriter.println("BMI:"+ BMI +" ,Underweight");
          else if( 18.5<=BMI && BMI<25)
           pwriter.println("BMI:"+ BMI +" ,Normal");
          else if( 25<=BMI && BMI<30)
           pwriter.println("BMI:"+ BMI +" ,Overweight");
          else
              pwriter.println("BMI:"+ BMI +",Obsity");
          
          
         //
         System.out.println("choose your Goal of suscribtion:");
          System.out.println("1:Lose weight"
                  + "\n2:Gain weight"
                  + "\n3:Enhance Physical Fitness");
          System.out.println("please Enter (1) for the first choice and (2) for the 2nd and (3) for the 3rd");
        int goal=input.nextInt();
        
      
         switch(goal){
             case 1:
                 pwriter.println("Goal:Lose weight");
                 break;
             case 2:
                 pwriter.println("Goal:Gain weight");
                 break;
             case 3:
                 pwriter.println("Goal:Enhance Physical Fitness");
                 break;
             default:
               System.out.println("Wrong Entry");
               break;
         }
    
           
           
           pwriter.flush();
           pwriter.close();
    }
    
    public static double calculateBMI(double height,double weight){
               double height_meters= height/100;
                return weight/(height_meters * height_meters);
        
    }
}
