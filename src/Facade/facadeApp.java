/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author aashgar
 */
public class facadeApp {
    public static void main(String[] args) {
        StudentMaker amMaker = StudentMaker.getMaker();
        amMaker.viewITStudent();
        amMaker.viewENGStudent();
        
    }
    
}
