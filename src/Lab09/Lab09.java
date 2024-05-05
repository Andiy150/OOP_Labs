package Lab09;

import javax.swing.*;

public class Lab09 {
    public void Task1(){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ProjectileCalculator().setVisible(true);
            }
        });
    }
}
