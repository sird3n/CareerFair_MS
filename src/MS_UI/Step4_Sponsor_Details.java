package MS_UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Step4_Sponsor_Details {

    public static JFrame step4Frame;
    public static JPanel step4Panel;

    public static JLabel step4TitleLabel1;
    public static JLabel sponsorIDLabel1;
    public static JLabel ssnLabel1;
    public static JLabel attendanceLabel1;

    public static JTextField sponsorID_TextField;
    public static JTextField ssn_TextField;
    public static JTextField attendance_TextField;


    public static void main(String[] args) {
        Font font1 = new Font(Font.SANS_SERIF, Font.BOLD, 32);
        Font font2 = new Font(Font.SANS_SERIF, Font.PLAIN, 17);


        step4Panel = new JPanel();
        step4Frame = new JFrame("Step 4");
        step4Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        step4Frame.setSize(800,500);
        step4Frame.add(step4Panel);
        step4Panel.setBackground(Color.yellow);
        step4Panel.setLayout(null);

        step4TitleLabel1 = new JLabel("Sponsor Details");
        step4TitleLabel1.setBounds(200,30,500,30);
        step4TitleLabel1.setFont(font1);
        step4Panel.add(step4TitleLabel1);

        sponsorIDLabel1 = new JLabel("Sponsor ID");
        sponsorIDLabel1.setBounds(150,100,100,25);
        sponsorIDLabel1.setFont(font2);
        step4Panel.add(sponsorIDLabel1);

        ssnLabel1 = new JLabel("Social Security No");
        ssnLabel1.setBounds(150,150,100,25);
        ssnLabel1.setFont(font2);
        step4Panel.add(ssnLabel1);

        attendanceLabel1 = new JLabel("Attendence");
        attendanceLabel1.setBounds(150,200,100,25);
        attendanceLabel1.setFont(font2);
        step4Panel.add(attendanceLabel1);


        sponsorID_TextField = new JTextField(20);
        sponsorID_TextField.setBounds(300,100,200,25);
        step4Panel.add(sponsorID_TextField);

        ssn_TextField = new JTextField(500);
        ssn_TextField.setBounds(300,150,200,25);
        step4Panel.add(ssn_TextField);

        attendance_TextField = new JTextField(20);
        attendance_TextField.setBounds(300,200,200,25);
        step4Panel.add(attendance_TextField);


        JButton btnNext = new JButton("Next");
        btnNext.setBounds(400,300,80,25);
        btnNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Button Clicked, GO Next");
            }

        });
        step4Panel.add(btnNext);

        JButton btnBack = new JButton("Back");
        btnBack.setBounds(300,300,80,25);
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Button Clicked, GO Back");
            }
        });
        step4Panel.add(btnBack);

        step4Frame.setVisible(true);
    }
}
