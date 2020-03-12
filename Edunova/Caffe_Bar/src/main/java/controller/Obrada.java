/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Util.EdunovaException;
import Util.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Grbeš
 */
public abstract class Obrada<T> {
    
    protected T entitet;
    protected Session session;
    protected abstract void kontrolaCreate() throws EdunovaException;
    protected abstract void kontrolaUpdate() throws EdunovaException;
    protected abstract void kontrolaDelete() throws EdunovaException;
    
    public Obrada(T entitet){
        this.entitet=entitet;
        session = HibernateUtil.getSessionFactory().openSession();
    }
    
    public T create() throws EdunovaException{
        kontrolaCreate();
        return save();
    }
    
    public T update() throws EdunovaException{
        kontrolaUpdate();
        return save();
    }
    
    public boolean delete() throws EdunovaException{
        kontrolaDelete();
        session.beginTransaction();
        session.delete(entitet);
        session.getTransaction().commit();
        //provjeriti da li je obrisano. Vjerojatno će entitet.getSifra biti null
        return true;
    }
    
    private T save(){
        session.beginTransaction();
        session.save(entitet);
        session.getTransaction().commit();
        return entitet;
    }
    
}
