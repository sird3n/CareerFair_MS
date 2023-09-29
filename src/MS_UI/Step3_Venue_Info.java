package MS_UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Step3_Venue_Info {
    public static JFrame step3Frame;
    public static JPanel step3Panel;

    public static JLabel step3TitleLabel1;
    public static JLabel buildingDLabel1;
    public static JLabel campusLabel1;
    public static JLabel streetLabel1;

    public static JTextField building_TextField;
    public static JTextField campus_TextField;
    public static JTextField street_TextField;

    public static void main(String[] args) {
        Font font1 = new Font(Font.SANS_SERIF, Font.BOLD, 32);
        Font font2 = new Font(Font.SANS_SERIF, Font.PLAIN, 17);


        step3Panel = new JPanel();
        step3Frame = new JFrame("Step 3");
        step3Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        step3Frame.setSize(800,800);
        step3Frame.add(step3Panel);
        step3Panel.setBackground(Color.yellow);
        step3Panel.setLayout(null);

        step3TitleLabel1 = new JLabel("Venue Details");
        step3TitleLabel1.setBounds(200,30,500,30);
        step3TitleLabel1.setFont(font1);
        step3Panel.add(step3TitleLabel1);

        buildingDLabel1 = new JLabel("Building");
        buildingDLabel1.setBounds(150,100,100,25);
        buildingDLabel1.setFont(font2);
        step3Panel.add(buildingDLabel1);

        campusLabel1 = new JLabel("Campus");
        campusLabel1.setBounds(150,150,100,25);
        campusLabel1.setFont(font2);
        step3Panel.add(campusLabel1);

        streetLabel1 = new JLabel("Street");
        streetLabel1.setBounds(150,300,100,25);
        streetLabel1.setFont(font2);
        step3Panel.add(streetLabel1);


        building_TextField = new JTextField(20);
        building_TextField.setBounds(300,100,200,25);
        step3Panel.add(building_TextField);

        campus_TextField = new JTextField(500);
        campus_TextField.setBounds(300,150,300,100);
        step3Panel.add(campus_TextField);

        street_TextField = new JTextField(20);
        street_TextField.setBounds(300,300,200,25);
        step3Panel.add(street_TextField);


        JButton btnNext = new JButton("Next");
        btnNext.setBounds(400,400,80,25);
        btnNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Button Clicked, GO Next");
            }

        });
        step3Panel.add(btnNext);

        JButton btnBack = new JButton("Back");
        btnBack.setBounds(300,400,80,25);
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Button Clicked, GO Back");
            }
        });
        step3Panel.add(btnBack);

        step3Frame.setVisible(true);
    }
}
