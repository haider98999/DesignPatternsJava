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
public class CloneFactory {
    public Employee getClone(Employee employees){
        return employees.makeCopy();
    }
}
