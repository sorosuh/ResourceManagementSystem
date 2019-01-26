
package User;
import java.io.*;

/**
 *
 * @author Sina
 */
public class Student extends User{

    private static int UserNumber;    //شماره کاربر   
    private String UserCode;    //   کد کاربر
    
    public static final int CODE_LENGHT=20;
     //Constractor
    public Student(String Name, String famliy, String JoinDate, UserKind userKind) {
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
            this.UserCode="S"+UserNumber;
        }
    
}
