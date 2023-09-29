package MS_UI;

import MS_UI.Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage {
    public static JFrame homeFrame;
    public static JPanel homePanel;

    public static JLabel titleLabel1;
    public static JLabel titleLabel2;
    public static JLabel titleLabel3;


    public static void main(String[] args) throws Exception {
        Font font1 = new Font(Font.SANS_SERIF, Font.BOLD, 68);
        Font font2 = new Font(Font.SANS_SERIF, Font.BOLD, 75);
        Font font3 = new Font(Font.SANS_SERIF, Font.BOLD, 48);


        homePanel = new JPanel();
        homeFrame = new JFrame("Home Page");
        homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeFrame.setSize(1000,1000);
        homeFrame.add(homePanel);
        homePanel.setBackground(Color.LIGHT_GRAY);
        homePanel.setLayout(null);


        //Defining Labels
        titleLabel1 = new JLabel("Career Fair");
        titleLabel1.setBounds(300,50,500,100);
        titleLabel1.setFont(font1);
        homePanel.add(titleLabel1);

        titleLabel2 = new JLabel("Management");
        titleLabel2.setBounds(250,150,500,100);
        titleLabel2.setFont(font2);
        homePanel.add(titleLabel2);

        //Defining Labels
        titleLabel3 = new JLabel("System");
        titleLabel3.setBounds(400,250,500,100);
        titleLabel3.setFont(font3);
        homePanel.add(titleLabel3);

        JButton loginButton = new JButton("Log in");
        loginButton.setBounds(450,400,80,25);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Login in = new Login();
               in.Login();
              // homeFrame.setVisible(false);
            }
        });
        homePanel.add(loginButton);

        homeFrame.setVisible(true);
    }
}
