/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Session;

/**
 *
 * @author Kamil_2
 */
@ManagedBean
@SessionScoped
public class Data {

    private Publisher p;
    private HibernateUtil helper; 
    private Session session;
    private String name;
    
    public String getName(){
        session = helper.getSessionFactory().openSession();
        session.beginTransaction();
        p = (Publisher) session.get(Publisher.class, 1); /*identyfikator wydawcy = 1*/
        this.name = p.getName();
        return name;
    }

    
    public void addPublisher(){
    p = new Publisher("Znak");
    session = HibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    session.save(p);
    session.getTransaction().commit();
    session.close();
    }
    
}
