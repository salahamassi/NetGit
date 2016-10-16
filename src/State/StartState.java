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
public class StartState implements State{

    @Override
    public void doAction(Context context) {
        
        System.out.println("player is in start");
        
        context.setstate(this);
        
    }
    
    public String toString(){
    return "Start State";
    }
    
}
