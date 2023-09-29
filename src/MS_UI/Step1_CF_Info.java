package MS_UI;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Step1_CF_Info{
    public static JFrame step1Frame;
    public static JPanel step1Panel;

    public static JLabel step1TitleLabel1;
    public static JLabel fairIDLabel1;
    public static JLabel themeLabel1;
    public static JLabel startDateLabel1;
    public static JLabel endDateLabel1;
    public static JLabel noOfStudentsLabel1;

    public static JTextField fairID_TextField;
    public static JTextField theme_TextField;
    public static JTextField startDate_TextField;
    public static JTextField endDate_TextField;
    public static JTextField noOfStudents_TextField;


    public static void main(String[] args) {
        Font font1 = new Font(Font.SANS_SERIF, Font.BOLD, 32);
        Font font2 = new Font(Font.SANS_SERIF, Font.PLAIN, 17);


        step1Panel = new JPanel();
        step1Frame = new JFrame("Step 1");
        step1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        step1Frame.setSize(800,800);
        step1Frame.add(step1Panel);
        step1Panel.setBackground(Color.yellow);
        step1Panel.setLayout(null);

        step1TitleLabel1 = new JLabel("Career Fair Info");
        step1TitleLabel1.setBounds(200,30,500,30);
        step1TitleLabel1.setFont(font1);
        step1Panel.add(step1TitleLabel1);

        fairIDLabel1 = new JLabel("FairID");
        fairIDLabel1.setBounds(150,100,100,25);
        fairIDLabel1.setFont(font2);
        step1Panel.add(fairIDLabel1);

        themeLabel1 = new JLabel("Theme");
        themeLabel1.setBounds(150,150,100,25);
        themeLabel1.setFont(font2);
        step1Panel.add(themeLabel1);

        startDateLabel1 = new JLabel("Start Date");
        startDateLabel1.setBounds(150,300,100,25);
        startDateLabel1.setFont(font2);
        step1Panel.add(startDateLabel1);

        endDateLabel1 = new JLabel("End Date");
        endDateLabel1.setBounds(150,350,100,25);
        endDateLabel1.setFont(font2);
        step1Panel.add(endDateLabel1);

        noOfStudentsLabel1 = new JLabel("Number of Students");
        noOfStudentsLabel1.setBounds(150,400,150,25);
        noOfStudentsLabel1.setFont(font2);
        step1Panel.add(noOfStudentsLabel1);


        fairID_TextField = new JTextField(20);
        fairID_TextField.setBounds(300,100,200,25);
        step1Panel.add(fairID_TextField);

        theme_TextField = new JTextField(500);
        theme_TextField.setBounds(300,150,300,100);
        step1Panel.add(theme_TextField);

        startDate_TextField = new JTextField(20);
        startDate_TextField.setBounds(300,300,200,25);
        step1Panel.add(startDate_TextField);

        endDate_TextField = new JTextField(20);
        endDate_TextField.setBounds(300,350,200,25);
        step1Panel.add(endDate_TextField);


        noOfStudents_TextField = new JTextField(20);
        noOfStudents_TextField.setBounds(300,400,200,25);
        step1Panel.add(noOfStudents_TextField);

        JButton btnNext = new JButton("Next");
        btnNext.setBounds(400,500,80,25);
        btnNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(null,"Button Clicked, GO Next");
            }

        });
        step1Panel.add(btnNext);

        JButton btnBack = new JButton("Back");
        btnBack.setBounds(300,500,80,25);
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Button Clicked, GO Back");
            }
        });
        step1Panel.add(btnBack);

        step1Frame.setVisible(true);
    }

}
