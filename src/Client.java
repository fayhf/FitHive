/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnesshive;

/**
 *
 * @author ghadihersi
 */
public class Client extends User {
    private int age;
    private String gender;
    private double height;
    private double weight;
    private String membershipPackage;
    private String goal;
    
    
    public Client(String name, int id, String phone, String email, String username, String password,int age, String gender, double height, double weight, String membershipPackage, String goal){
        super(name,id,phone,email,username,password);    
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.membershipPackage = membershipPackage;
        this.goal = goal;
    }
    

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getMembershipPackage() {
        return membershipPackage;
    }

    public void setMembershipPackage(String membershipPackage) {
        this.membershipPackage = membershipPackage;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }
    
   
    
}
