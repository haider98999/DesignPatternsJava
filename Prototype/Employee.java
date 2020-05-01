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

//This is the protoype of employees
//Anyone can take this structure and get employees
public interface Employee extends Cloneable {
    Employee makeCopy();
    String getName();
    int getSalary();
}