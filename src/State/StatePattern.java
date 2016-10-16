/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * @author aashgar
 */
public class StatePattern {
    
    public static void main(String[] args) {
         Context context = new Context();
         
         State start = new StartState();
         start.doAction(context);
         
         System.out.println(context.getstate().toString());
         
         State stop = new Stopstate();
         stop.doAction(context);
         
         System.out.println(context.getstate().toString());
                 
                 }
    
    
}
