/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Builder.Pizza;
import Prototype.CloneFactory;
import Prototype.FASTEmployees;
import Singelton.President;
/**
 *
 * @author Haider
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Builder
        Pizza pizza=new Pizza.PizzaBuilder("XXL").onion(Boolean.FALSE).cheese(Boolean.FALSE).build();
        
        //Prototype
        CloneFactory cloneFactory=new CloneFactory();
        FASTEmployees fASTEmployees=new FASTEmployees();
        FASTEmployees fASTEmployeesClone=(FASTEmployees)cloneFactory.getClone(fASTEmployees);
        
        //Singleton
        President president=President.getInstance();
        
    }
    
}
