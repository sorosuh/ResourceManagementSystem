
package User;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 *
 * @author soroush
 */
public class CalcuteTimeDiffrence {
    

   public static void CalculateTimeDiffrence(String dateStart, String dateStop) {
          SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

          Date d1 = null;
          Date d2 = null;

          try {
              d1 = format.parse(dateStart);
              d2 = format.parse(dateStop);

              // in milliseconds
              long diff = d2.getTime() - d1.getTime();

              long diffDays = diff / (24 * 60 * 60 * 1000);

              System.out.print(diffDays + " days, ");


          } catch (Exception e) {
              e.printStackTrace();
          }
     }


}
