/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sagar;

import javax.ejb.Stateless;

/**
 *
 * @author pro_ge3k
 */
@Stateless
public class NewSessionBean implements NewSessionBeanLocal {
    public double add(double a,double b){
    return a+b;
    }
     public double sub(double a,double b){
    return a-b;
    }
     
     public double mul(double a,double b){
    return a*b;
    }
      public double div(double a,double b){
    return a/b;
    }
   
}
