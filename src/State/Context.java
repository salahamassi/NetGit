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
public class Context {
    
    private State state;
    
    public Context (){
    state = null;
    }
    
    public void setstate (State state){
    this.state = state;
    }
    
    public State getstate(){
    return state;
    }
}
