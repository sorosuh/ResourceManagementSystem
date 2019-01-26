/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

/**
 *
 * @author Sina
 */
public class Guest extends User{

    private static int UserNumber;    //شماره کاربر   
    private String UserCode;          //   کد کاربر
    
     //Constractor
    public Guest(String Name, String famliy, String JoinDate, UserKind userKind) {
        super(Name, famliy, JoinDate, userKind);
        setUserCode();
    }
    
    
         public void setUserCode(){
            this.UserCode="G"+UserNumber;
        }
}
