package MS_UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Step2_CareerFair_Plan {
    public static JFrame step2Frame;
    public static JPanel step2Panel;

    public static JLabel step2TitleLabel1;
    public static JLabel planIDLabel1;
    public static JLabel actionPlanLabel1;
    public static JLabel planDescriptionLabel1;
    public static JLabel beginDateLabel1;
    public static JLabel deadLineLabel1;
    public static JLabel completeLabel1;
    public static JLabel taskVersionLabel1;

    public static JTextField planID_TextField;
    public static JTextField actionPlan_TextField;
    public static JTextField planDescription_TextField;
    public static JTextField beginDate_TextField;
    public static JTextField deadline_TextField;
    public static JTextField complete_TextField;
    public static JTextField taskVersion_TextField;


    public static void main(String[] args) {
        Font font1 = new Font(Font.SANS_SERIF, Font.BOLD, 32);
        Font font2 = new Font(Font.SANS_SERIF, Font.PLAIN, 17);


        step2Panel = new JPanel();
        step2Frame = new JFrame("Step 1");
        step2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        step2Frame.setSize(800,800);
        step2Frame.add(step2Panel);
        step2Panel.setBackground(Color.yellow);
        step2Panel.setLayout(null);

        step2TitleLabel1 = new JLabel("Career Fair Plan");
        step2TitleLabel1.setBounds(200,30,500,30);
        step2TitleLabel1.setFont(font1);
        step2Panel.add(step2TitleLabel1);

        planIDLabel1 = new JLabel("Plan ID");
        planIDLabel1.setBounds(150,100,100,25);
        planIDLabel1.setFont(font2);
        step2Panel.add(planIDLabel1);

        actionPlanLabel1 = new JLabel("Action Plan");
        actionPlanLabel1.setBounds(150,150,100,25);
        actionPlanLabel1.setFont(font2);
        step2Panel.add(actionPlanLabel1);

        planDescriptionLabel1 = new JLabel("Plan Description");
        planDescriptionLabel1.setBounds(150,200,100,25);
        planDescriptionLabel1.setFont(font2);
        step2Panel.add(planDescriptionLabel1);

        beginDateLabel1 = new JLabel("Begin Date");
        beginDateLabel1.setBounds(150,300,100,25);
        beginDateLabel1.setFont(font2);
        step2Panel.add(beginDateLabel1);

        deadLineLabel1 = new JLabel("Deadline");
        deadLineLabel1.setBounds(150,350,100,25);
        deadLineLabel1.setFont(font2);
        step2Panel.add(deadLineLabel1);

        completeLabel1 = new JLabel("Complete(Yes/No)");
        completeLabel1.setBounds(150,400,150,25);
        completeLabel1.setFont(font2);
        step2Panel.add(completeLabel1);

        taskVersionLabel1 = new JLabel("Task Version");
        taskVersionLabel1.setBounds(150,450,150,25);
        taskVersionLabel1.setFont(font2);
        step2Panel.add(taskVersionLabel1);


        planID_TextField = new JTextField(20);
        planID_TextField.setBounds(300,100,200,25);
        step2Panel.add(planID_TextField);

        actionPlan_TextField = new JTextField(500);
        actionPlan_TextField.setBounds(300,150,200,25);
        step2Panel.add(actionPlan_TextField);

        planDescription_TextField = new JTextField(500);
        planDescription_TextField.setBounds(300,200,300,100);
        step2Panel.add(planDescription_TextField);

        beginDate_TextField = new JTextField(20);
        beginDate_TextField.setToolTipText("YYYY-MM-DD hh:mm:ss");
        beginDate_TextField.setBounds(300,350,200,25);
        step2Panel.add(beginDate_TextField);

        deadline_TextField = new JTextField(20);
        deadline_TextField.setBounds(300,400,200,25);
        step2Panel.add(deadline_TextField);


        complete_TextField = new JTextField(20);
        complete_TextField.setBounds(300,450,200,25);
        step2Panel.add(complete_TextField);

        taskVersion_TextField = new JTextField(20);
        taskVersion_TextField.setBounds(300,500,200,25);
        step2Panel.add(taskVersion_TextField);

        JButton btnNext = new JButton("Next");
        btnNext.setBounds(400,600,80,25);
        btnNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Button Clicked, GO Next");
            }

        });
        step2Panel.add(btnNext);

        JButton btnBack = new JButton("Back");
        btnBack.setBounds(300,600,80,25);
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Button Clicked, GO Back");
            }
        });
        step2Panel.add(btnBack);

        step2Frame.setVisible(true);
    }
}
