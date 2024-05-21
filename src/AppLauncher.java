import GUI.BankingAppGui;
import GUI.LoginGui;
import GUI.RegisterGUI;
import db_objs.User;

import javax.swing.*;
import java.math.BigDecimal;

public class AppLauncher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                //new LoginGui().setVisible(true);
                //new RegisterGUI().setVisible(true);
                //new BankingAppGui(
                        /*new User(1, "username", "password", new BigDecimal("20.00"))
                ).setVisible(true);*/
            }
        });
    }

}
