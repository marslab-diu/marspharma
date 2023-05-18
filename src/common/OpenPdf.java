package common;

import dao.PharmacyUtils;
import java.io.File;
import javax.swing.JOptionPane;


/**
 *
 * @author Home
 */
public class OpenPdf {

    public static void openById(String id) {
        try {
           if((new File(PharmacyUtils.billPath+id+".pdf")).exists()) {
               Process p  = Runtime
                       .getRuntime()
                       .exec("rundll32 url.dll,FileProtocolHandler "+PharmacyUtils.billPath+""+id+".pdf");
           }
           else {
               JOptionPane.showMessageDialog(null, "File does not exist");
           }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
