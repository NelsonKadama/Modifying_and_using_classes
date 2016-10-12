/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

// Question , Assignment 
// Name: Nelson Kadama
// Student Number: NLSANG001
// Date: 
public class Floor {
    private String name;
    private int area;
    private double cost;
    
    public String getName(){
        return name;
    }
    
    public int getArea(){
        return area;
    }
    
    public double getCost(){
        return cost;
    }
    
    public Floor(String floorName, int length, int breadth, double costPerBox, double boxArea){
        name = floorName;
        area = length * breadth;
        cost = (area/boxArea) * costPerBox;
    }

}
