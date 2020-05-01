/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author Haider
 */
//Employees in FAST based on Prototype
public class FASTEmployees implements Employee {
    private String name;
    private int salary;

    @Override
    public Employee makeCopy() {
        try {
            return (FASTEmployees)super.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSalary() {
        return salary;
    }
    
}
