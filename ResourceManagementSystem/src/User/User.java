
package User;

/**
 *
 * @author Soroush
 */
public class User {
     private String Name;          // نام عضو
     private String Family;        // نام خانوادگی
     private String JoinDate;      // تاریخ عضویت در سیستم
     private UserKind userKind;    //نوع کاربر
     
     //Constractor
     
     public User(String Name,String famliy,String JoinDate,UserKind userKind){
         setName(Name);
         setFamily(famliy);
         setJoinDate(JoinDate);
         setUserKind(userKind);
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
