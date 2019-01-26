package User;

import Resource.*;
import java.io.BufferedReader;
import java.io.*;
import java.util.Date;

/**
 *
 * @author soroush
 */
public class Admin extends User{

    private static int i = 0;
    private User[] members = new User[100];

    public Admin(String Name, String famliy, String JoinDate, UserKind userKind) {
        super(Name, famliy, JoinDate, userKind);
    }

    //==========================================================
    public void uploadUserInfoFile(File file) {

        File f1 = new File(file.getAbsolutePath());
        File studentBin = new File("studentInfo.bin");
        File guestBin = new File("guestInfo.bin");
        File masterBin = new File("master.bin");
        BufferedReader input = null;
        DataOutputStream output = null;

        try {
            input = new BufferedReader(new FileReader(f1));
            while (true) {
                String line = input.readLine();
                String[] kind = line.split(",", 0);
                if (kind[3].equalsIgnoreCase("student")) {
                    members[i] = new Student(kind[0], kind[1], kind[2], UserKind.STUDENT);
                    
                } else if (kind[3].equalsIgnoreCase("guest")) {
                    members[i] = new Guest(kind[0], kind[1], kind[2], UserKind.GUEST);
                } else if (kind[3].equalsIgnoreCase("guest")) {
                    members[i] = new Master(kind[0], kind[1], kind[2], UserKind.MASTER);
                    
                }
                i++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //=============================================================
//    public void trusteeship(User user, Resources resource) {
//
//        Date trusteeshipDate = new Date();
//        user.setTrusteeshipDate(trusteeshipDate);
//
//        if (user instanceof Student) {
//
//            if (resource instanceof book) {
//                user.setReturnDate(trusteeshipDate.getHours() + 336);
//            } else if (resource instanceof Thesis) {
//                user.setReturnDate(trusteeshipDate.getHours() + 240);
//            } else if (resource instanceof Magazine) {
//                user.setReturnDate(trusteeshipDate.getHours() + 120);
//            }
//        } else if (user instanceof Master) {
//            if (resource instanceof book) {
//                user.setReturnDate(trusteeshipDate.getHours() + 750);
//            } else if (resource instanceof Thesis) {
//                user.setReturnDate(trusteeshipDate.getHours() + 480);
//            } else if (resource instanceof Magazine) {
//                user.setReturnDate(trusteeshipDate.getHours() + 360);
//            }
//        } else if (user instanceof Guest) {
//
//            if (resource instanceof book) {
//                user.setReturnDate(trusteeshipDate.getHours() + 240);
//            } else if (resource instanceof Thesis) {
//                System.out.println("you cant trusteeship this resource");
//            } else if (resource instanceof Magazine) {
//                System.out.println("you cant trusteeship this resource");
//            }
//        }
//    }
    
    ///////////////////////////////////////////////////////////////////////
    

}
