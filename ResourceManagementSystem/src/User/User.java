
package User;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Soroush
 */
public class User {
     protected String Name;          // نام عضو
     protected String Family;        // نام خانوادگی
     protected String JoinDate;      // تاریخ عضویت در سیستم
     protected UserKind userKind;    //نوع کاربر
     
     
     public static final int NAME_LENGHT=50;
     public static final int FAMILY_LRNGTH=50;
     public static final int JOINDATE=50;
     public static final int RECIRD_LENGHT=(NAME_LENGHT * 2)+(FAMILY_LRNGTH * 2) +(JOINDATE * 2);
     //Constractor
     
     public User(String Name,String famliy,String JoinDate,UserKind userKind){
         setName(Name);
         setFamily(famliy);
         setJoinDate(JoinDate);
         setUserKind(userKind);
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
            file.writeChars(builder.toString());
                    
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public UserKind getUserKind() {
        return userKind;
    }

    public void setUserKind(UserKind userKind) {
        this.userKind = userKind;
    }
     
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getFamily() {
        return Family;
    }

    public void setFamily(String Family) {
        this.Family = Family;
    }

    public String getJoinDate() {
        return JoinDate;
    }

    public void setJoinDate(String JoinDate) {
        this.JoinDate = JoinDate;
    }
     
     
}
