/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resource;

import java.util.Date;

/**
 *
 * @author Mahdi
 */
public class Magazine extends Resources {
    private int number;
    public Magazine(String Subject,int number, Date ReleaseDate) {
        super(Subject, ReleaseDate);
        setNumber(number);
    }
    
    public void setNumber(int number){this.number=number;}
    public int getNumber(){return this.number;}
    
}
