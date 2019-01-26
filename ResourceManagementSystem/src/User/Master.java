/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

/**
 *
 * @author Soroush
 */
public class Master extends User{     //استاد

     private static int UserNumber;    //شماره کاربر   
     private String UserCode;    //   کد کاربر
    
     //Constractor
     
    public Master(String Name, String famliy, String JoinDate, UserKind userKind) {
        super(Name, famliy, JoinDate, userKind);
        setUserCode();
    }
    
     public void setUserCode(){
            this.UserCode="L"+UserNumber;
        }
    
}
