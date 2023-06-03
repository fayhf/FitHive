/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fithivesystem;

/**
 *
 * @author 96653
 */
public class Client extends  User{
   
    private int age;
    private String gender;
    private double height;
    private double weight;
    private double BMI;
    private int goal;
    // private String membershipPackage;
    
    public Client( String name, int id, String phone, String email, String username, String password,
            int age,String gender, double height, double weight,int goal,double BMI){
       super(name,id,phone,email,username,password);    
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
       this.goal = goal;
        this.BMI=BMI;
    }
    
     public void setAge(int age) {
        this.age = age;
    }  
     
     
     
     public void setGender(String gender) {
        this.gender = gender;
    }  
     
      public void setHeight(double height) {
        this.height = height;
    }
      
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public double setBmi(double height,double weight ) {
        double heightMeters = height / 100;
        return weight / (heightMeters * heightMeters);
    } 
    
     public void setGoal(int goal) {
         String fitnessGoal;
        switch (goal) {
            case 1:
                    fitnessGoal = "Lose weight";
                break;
            case 2:
                fitnessGoal ="Gain weight";
                break;
            case 3:
                fitnessGoal = "Enhance Physical Fitness";
                break;
            default:
                System.out.println("Invalid goal selection");
                break;
        }
        
    }
    
    public int getAge(int age) {
        
        return age;
    }

   

    public String getGender(String gender) {
        return gender;
    }

    

    public double getHeight(double height) {
        return height;
    }

    public double getWeight(double weight) {
        return weight;
    }

     public String getGoal(int goal) {
    switch (goal) {
        case 1:
            return "Lose weight";
        case 2:
            return "Gain weight";
        case 3:
            return "Enhance Physical Fitness";
        default:
            return "Invalid fitness goal";
    }
}
     
    public String getBmi(double bmi ) {
        
         if(bmi<= 18)
          return ", Underweight";
          else if( 18.5<=bmi && bmi<25)
           return " Normal";
          else if( 25<=bmi&& bmi<30)
           return ", Overweight";
          else
              return ", Obsity";
    }    

        
}
