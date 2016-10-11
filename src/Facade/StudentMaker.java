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
public class StudentMaker {
    private Student itStudent;
    private Student engStudent;
    private static StudentMaker astuMaker;
    private StudentMaker(){
        this.itStudent = new ITStudent();
        this.engStudent = new ENGStudent();
    }
    public static StudentMaker getMaker(){
        if(astuMaker == null)
            astuMaker = new StudentMaker();
        return astuMaker;
    }
    
    public void viewITStudent(){
        this.itStudent.view();
    }
   public void viewENGStudent(){
        this.engStudent.view();
    } 
}
