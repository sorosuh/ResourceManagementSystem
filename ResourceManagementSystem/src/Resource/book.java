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
public class book extends Resources {
    private String YearPublication;

    public book(String Subject,String YearPublication , String... AutherName) {
        super(Subject, AutherName);
        setYearPublication(YearPublication);
    }
    
    public void setYearPublication(String YearPublication){
        this.YearPublication=YearPublication;
    }
    public String getYearPublication(){return YearPublication;}
}
