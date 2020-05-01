/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author Haider
 */

/* Builder Creation Design Pattern is used because user have to pass different parameters
    To create a Pizza a lot parameters need to passed*/

public class Pizza {
    private String size;
    private Boolean onion;
    private Boolean cheese;
    private Boolean olives;
    private Boolean tomato;
    private Boolean corn;
    private Boolean mushroom;
    private String flavor;
    
    private Pizza(){
        onion=Boolean.FALSE;
        cheese=Boolean.FALSE;
        olives=Boolean.FALSE;
        tomato=Boolean.FALSE;
        corn=Boolean.FALSE;
        mushroom=Boolean.FALSE;
        size=null;
        flavor=null;
    }

    //builder object is passed to private constructor
    //builder has the information about pizza
    private Pizza(PizzaBuilder builder){
        size=builder.size;
        onion=builder.onion;
        cheese=builder.cheese;
        olives=builder.olives;
        tomato=builder.tomato;
        corn=builder.corn;
        mushroom=builder.mushroom;
        flavor=builder.flavor;
    }
    
    //inner builder class
    public static class PizzaBuilder{
        private String size;
        private Boolean onion;
        private Boolean cheese;
        private Boolean olives;
        private Boolean tomato;
        private Boolean corn;
        private Boolean mushroom;
        private String flavor;
        
        public PizzaBuilder(String size){
            this.size=size;
        }
        
        public PizzaBuilder onion(Boolean value){
            onion=value;
            return this;
        }
        
        public PizzaBuilder cheese(Boolean value){
            cheese=value;
            return this;
        }
        
        public PizzaBuilder olives(Boolean value){
            olives=value;
            return this;
        }
        
        public PizzaBuilder tomato(Boolean value){
            tomato=value;
            return this;
        }
        
        public PizzaBuilder corn(Boolean value){
            corn=value;
            return this;
        }
        
        public PizzaBuilder mushroom(Boolean value){
            mushroom=value;
            return this;
        }
        
        public PizzaBuilder flavor(String value){
            flavor=value;
            return this;
        }
        
        public Pizza build(){
            return new Pizza(this);
        }
    }
}
