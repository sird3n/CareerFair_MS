package MS_UI;

import jdk.nashorn.internal.scripts.JO;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;

public class Login {
    public static JFrame loginFrame;
    public static JPanel loginPanel;

    public static JLabel titleLabel;
    public static JLabel orgIDLabel;
    public static JLabel passwLabel;
    
    
    public static JTextField orgIDTextField;
    public static JPasswordField passwTextField;

    

    public void Login() {
        Font font1 = new Font(Font.SANS_SERIF, Font.BOLD, 25);
        Font font2 = new Font(Font.SANS_SERIF, Font.PLAIN, 17);

        loginPanel = new JPanel();
        loginFrame = new JFrame("Log in");
        loginFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        loginFrame.setSize(500,500);
        loginFrame.add(loginPanel);
        loginPanel.setBackground(Color.LIGHT_GRAY);
        loginPanel.setLayout(null);

        //Defining Labels
        titleLabel = new JLabel("Log in");
        titleLabel.setBounds(200,50,100,50);
        titleLabel.setFont(font1);
        loginPanel.add(titleLabel);

        orgIDLabel = new JLabel("Organizer ID");
        orgIDLabel.setBounds(50,150,100,25);
        orgIDLabel.setFont(font2);
        loginPanel.add(orgIDLabel);

        passwLabel = new JLabel("Password");
        passwLabel.setBounds(50,200,100,25);
        passwLabel.setFont(font2);
        loginPanel.add(passwLabel);


        //Defining Text Fields
        orgIDTextField = new JTextField(20);
        orgIDTextField.setBounds(200,150,200,25);
        loginPanel.add(orgIDTextField);

        passwTextField = new JPasswordField(20);
        passwTextField.setBounds(200,200,200,25);
        loginPanel.add(passwTextField);


        JButton loginButton = new JButton("Log in");
        loginButton.setBounds(200,250,90,25);
        loginButton.setBackground(Color.WHITE);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int organizerid = Integer.parseInt(orgIDTextField.getText());
                String password = String.valueOf(passwTextField.getText());

                user = getAuthenticatedUser(organizerid);


                if (user != null) {
                    Dashboard dash = new Dashboard();
                    //Displays admin dashboard upon log in
                    dash.Dashboard();
                    loginFrame.setVisible(false);
                
            }
            else {
                JOptionPane.showMessageDialog(null,
                        "Organizer or Password Invalid",
                        "Try again",                            
                        JOptionPane.ERROR_MESSAGE);
                }
    }});
        loginPanel.add(loginButton);



        loginFrame.setVisible(true);
    }

public static UserOrg user;

//Autheticating User
private UserOrg getAuthenticatedUser(int organizerID) {
    UserOrg user = null;

    final String DB_URL = "jdbc:sqlserver://localhost\\sql_server;databaseName=FCI_CareerFair_MS";
    final String USERNAME = "LogIn";
    final String PASSWORD = "Programming58";

    try{
        Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
        // Connected to database successfully...

        Statement stmt = conn.createStatement();
        String sql = "EXECUTE getUser ?";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setInt(1, organizerID);
        //preparedStatement.setString(2, password);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            user = new UserOrg();
            user.organizerID = resultSet.getInt("Organizer");
            user.password = resultSet.getString("Password");
        }

        stmt.close();
        conn.close();

    }catch(Exception e){
        e.printStackTrace();
    }

    //Returns User
    return user;
}


}

