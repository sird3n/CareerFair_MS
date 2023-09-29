package MS_UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Step5_Exhibitors_Details {

    public static JFrame step5Frame;
    public static JPanel step5Panel;

    public static JLabel step5TitleLabel1;
    public static JLabel exhibitorIDLabel1;
    public static JLabel ssnLabel1;
    public static JLabel exhibitionLabel1;

    public static JTextField exhibitorID_TextField;
    public static JTextField ssn_Textfield;
    public static JTextField exhibition_TextField;


    public static void main(String[] args) {
        Font font1 = new Font(Font.SANS_SERIF, Font.BOLD, 32);
        Font font2 = new Font(Font.SANS_SERIF, Font.PLAIN, 17);


        step5Panel = new JPanel();
        step5Frame = new JFrame("Step 5");
        step5Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        step5Frame.setSize(800,500);
        step5Frame.add(step5Panel);
        step5Panel.setBackground(Color.yellow);
        step5Panel.setLayout(null);

        step5TitleLabel1 = new JLabel("Exhibitor Details");
        step5TitleLabel1.setBounds(200,30,500,30);
        step5TitleLabel1.setFont(font1);
        step5Panel.add(step5TitleLabel1);

        exhibitorIDLabel1 = new JLabel("Exhibitor ID");
        exhibitorIDLabel1.setBounds(150,100,100,25);
        exhibitorIDLabel1.setFont(font2);
        step5Panel.add(exhibitorIDLabel1);

        ssnLabel1 = new JLabel("Social Security No");
        ssnLabel1.setBounds(150,150,100,25);
        ssnLabel1.setFont(font2);
        step5Panel.add(ssnLabel1);

        exhibitionLabel1 = new JLabel("Exhibition");
        exhibitionLabel1.setBounds(150,200,100,25);
        exhibitionLabel1.setFont(font2);
        step5Panel.add(exhibitionLabel1);


        exhibitorID_TextField = new JTextField(20);
        exhibitorID_TextField.setBounds(300,100,200,25);
        step5Panel.add(exhibitorID_TextField);

        ssn_Textfield = new JTextField(500);
        ssn_Textfield.setBounds(300,150,200,25);
        step5Panel.add(ssn_Textfield);

        exhibition_TextField = new JTextField(20);
        exhibition_TextField.setBounds(300,200,200,25);
        step5Panel.add(exhibition_TextField);


        JButton btnNext = new JButton("Next");
        btnNext.setBounds(400,300,80,25);
        btnNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Button Clicked, GO Next");
            }

        });
        step5Panel.add(btnNext);

        JButton btnBack = new JButton("Back");
        btnBack.setBounds(300,300,80,25);
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Button Clicked, GO Back");
            }
        });
        step5Panel.add(btnBack);

        step5Frame.setVisible(true);
    }
}
