/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author bellarao
 */
public class User {
    private String name;
    private int age;
    private int id;
    
    /**
     * Getter method for Id
     * 
     * @return id
     */
    public int getId(){
        return id;
    }
    
    /**
     * Setter method for ID for the user
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }
            
    /**
     * Getter method for Name of the user
     * 
     * @return name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Setter method for Name of the user
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Getter method for the age of the user
     * @return age
     */
    public int getAge() {
        return age;
    }
    
    /**
     * Setter for Age of the user
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    /**
     * 
     *@return Prints the id when trying to print the object
     */
    @Override
    public String toString() {
        return String.valueOf(id);
    
    }
       
    
}
