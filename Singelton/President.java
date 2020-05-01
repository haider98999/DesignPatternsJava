/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singelton;

/**
 *
 * @author Haider
 */
//as there can only be one active president so we singelton pattern
public class President {
    private static President obj;
  
    private President() {} 
  
    public static President getInstance() 
    { 
        if (obj == null) 
        {
            obj=new President();
        } 
        return obj; 
    } 
}
