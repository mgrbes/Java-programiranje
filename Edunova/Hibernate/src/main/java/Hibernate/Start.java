/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;
    
import Util.HibernateUtil;



public class Start {
    
    public Start(){
        HibernateUtil.getSessionFactory().openSession();
    }
    
    public static void main(String[] args) {
        new Start();
    }
}
