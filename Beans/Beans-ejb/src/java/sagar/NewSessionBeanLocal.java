/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sagar;

import javax.ejb.Local;

/**
 *
 * @author pro_ge3k
 */
@Local
public interface NewSessionBeanLocal {
    public double add(double a,double b);
    public double sub(double a,double b);
    public double mul(double a,double b);
    public double div(double a,double b);
    
    
}
