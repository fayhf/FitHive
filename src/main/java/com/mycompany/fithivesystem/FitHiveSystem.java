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
  
    Scanner input = new Scanner(System.in);
    
    //creat a file to write information on it 
    File clientFile = new File("client.txt");
    FileWriter writer = new FileWriter(clientFile, true);
    // Create a new PrintWriter object with autoflush enabled
    PrintWriter pwriter = new PrintWriter(writer, true);

    System.out.println("Enter your name:");
    String name = input.next();

     System.out.println("Enter your ID:");
    int id = input.nextInt();
    
     System.out.println("Enter your Phone Number:");
    String phone = input.next();
    
     System.out.println("Enter your Email address:");
    String email = input.next();
    
     System.out.println("Enter your username:");
    String username = input.next();
    
     System.out.println("Enter your password:");
    String password = input.next();
    
    System.out.println("Are you Male or Female:");
    String gender = input.next();

    System.out.println("Enter your Age:");
    int age= input.nextInt();

    System.out.println("Enter your Height in m:");
    double height = input.nextDouble();
    
    System.out.println("Enter your Weight in kg:");
    double weight = input.nextDouble();

    
    System.out.println("Choose your Goal of subscription:");
    System.out.println("1: Lose weight");
    System.out.println("2: Gain weight");
    System.out.println("3: Enhance Physical Fitness");
    int goal = input.nextInt();

    // Create a new Client object with the user's input
    Client client = new Client (name,id, phone, email, username, password, age,
            gender, height,weight, goal,0.0);
    // Set the fitness goal on the client object
    client.setGoal(goal);

     // create variable to hold bmi calculation 
      double bmi=Math.round(client.setBmi(height, weight)); 
      
      
      
    System.out.println(" " );
    System.out.println(" " );


    // Use the client object's getter methods to display the client information
    System.out.println("  Display Client Information ");
    System.out.println("Name: " + client.getName(name));
    pwriter.println("Name: " + client.getName(name));
    System.out.println("Id Number: " + client.getId(id));
    pwriter.println("Id Number: " + client.getId(id));
    System.out.println("Phone Number: " + client.getPhone(phone));
    pwriter.println("Phone Number: " + client.getPhone(phone));
    System.out.println("Email address: " + client.getEmail(email));
    pwriter.println("Email address: " + client.getEmail(email));
    System.out.println("Username: " + client.getUsername(username));
    pwriter.println("Username: " + client.getUsername(username));
    System.out.println("Password: " + client.getPassword(password));
    pwriter.println("Password: " + client.getPassword(password));
    System.out.println("Sex: " + client.getGender(gender));
    pwriter.println("Sex: " + client.getGender(gender));
    System.out.println("Age: " + client.getAge(age));
    pwriter.println("Age: " + client.getAge(age));
    System.out.println("Height: " + client.getHeight(height) + " m");
    pwriter.println("Height: " + client.getHeight(height) + " m");
    System.out.println("Weight: " + client.getWeight(weight) + " kg");
    pwriter.println("Weight: " + client.getWeight(weight) + " kg");
    System.out.println("BMI: " + bmi+ client.getBmi(bmi));
     pwriter.println("BMI:"+ bmi +client.getBmi(bmi));
    System.out.println("Fitness Goal: " + client.getGoal(goal));
    pwriter.println("Fitness Goal: " + client.getGoal(goal));
    
    
    
}
}
