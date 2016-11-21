/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kamil_2
 */
public class Publisher {
    
    private int pubid;
    private String name;

    public Publisher() {
    }
	
    public Publisher(String name) {
        this.name = name;
    }
    
    public Publisher(byte pubid, String name) {
       this.pubid = pubid;
       this.name = name;
    }
   
    public int getPubid() {
        return this.pubid;
    }
    
    public void setPubid(int pubid) {
        this.pubid = pubid;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
   
}
