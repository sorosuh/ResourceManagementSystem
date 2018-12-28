
package Resource;
// superClass for  subClass book ,magazine ,Thesis

import java.util.*;

public class Resources {
    
    private String Subject;//عنوان
    private String[] AutherName;//نام نویسندگان
    private Date ReleaseDate;//تاریخ انتشار
    
    //have three constructor
    public Resources(String Subject,Date ReleaseDate,String ...AutherName){
        setSubject(Subject);
        setReleaseDate(ReleaseDate);
        setAutherName(AutherName);
    }
    public Resources(String Subject,String ...AutherName){
        setSubject(Subject);
        setAutherName(AutherName);
    }
    public Resources(String Subject,Date ReleaseDate){
        setSubject(Subject);
        setReleaseDate(ReleaseDate);
    }
    
    public void setSubject(String Subject){this.Subject=Subject;}
    public void setAutherName(String ...AutherName){this.AutherName=AutherName;}
    public void setReleaseDate(Date ReleaseDate){this.ReleaseDate=ReleaseDate;}
    
    

}
