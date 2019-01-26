/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import static User.User.FAMILY_LRNGTH;
import static User.User.JOINDATE;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Soroush
 */
public class Master extends User{     //استاد

     private static int UserNumber;    //شماره کاربر   
     private String UserCode;    //   کد کاربر
    
     public static final int CODE_LENGHT=20;
     //Constractor
     
    public Master(String Name, String famliy, String JoinDate, UserKind userKind) {
        super(Name, famliy, JoinDate, userKind);
        setUserCode();
    }
    
             public void write(RandomAccessFile file){
        try{
            StringBuilder builder=new StringBuilder();
            builder.append(Name);
            builder.setLength(User.NAME_LENGHT);
            builder.append(Family);
            builder.setLength(FAMILY_LRNGTH);
            builder.append(JoinDate);
            builder.setLength(JOINDATE);
            builder.append(UserCode);
            file.writeChars(builder.toString());
                    
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
     public void setUserCode(){
            this.UserCode="L"+UserNumber;
        }
    
}
