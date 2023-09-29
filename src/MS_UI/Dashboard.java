package MS_UI;

import javax.swing.*;
import java.awt.*;

public class Dashboard {
    public static JFrame dashFrame;
    public static JPanel dashPanel;

    public static JLabel titleLabel1;

    public void Dashboard() {


        dashPanel = new JPanel();
        dashFrame = new JFrame("Dashboard");
        dashFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dashFrame.setSize(1000,1000);
        dashFrame.add(dashPanel);
        dashPanel.setBackground(Color.lightGray);
        dashPanel.setLayout(null);


        JButton newCF = new JButton("New Career Fair");
        newCF.setBounds(20,100,400,600);
        newCF.setBackground(Color.CYAN);
        dashPanel.add(newCF);

        JButton viewCF = new JButton("View Career Fair");
        viewCF.setBounds(500,100,400,600);
        viewCF.setBackground(Color.CYAN);
        dashPanel.add(viewCF);


        dashFrame.setVisible(true);
    }
    
    
}
