 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resource;

import java.util.Date;

enum Evidence
{
    Expert,Senior,PHD;
} 
public class Thesis extends Resources{
    Evidence evidence;
    public Thesis(Evidence evidence,String Subject, Date ReleaseDate, String... AutherName) {
        super(Subject, ReleaseDate, AutherName);
        setEvidence(evidence);
    }
    public void setEvidence(Evidence evidence){this.evidence=evidence;}
    public Evidence get(){return evidence;}
}
