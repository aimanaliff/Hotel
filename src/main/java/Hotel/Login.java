/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


/**
 *
 * @author NAIM
 */
public abstract class Login implements ActionListener{
    
    private static JPanel panel;
    private static JFrame frame;
    private static JLabel userlabel;
    private static JTextField userText;
    private static JLabel passwordlabel;
    private static JPasswordField passwordText; 
    private static JButton button;
    private static JButton button2;
    private static JLabel success;
    
    public static void main(String[] args) {
        panel =new JPanel();
        frame =new JFrame();
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(panel);
        panel.setLayout(null);
        
        //label for username
        userlabel =new JLabel("Username :");
        userlabel.setBounds(10, 20, 80, 25);
        panel.add(userlabel);
        
        //space for username
        userText =new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);
        
        //label for password
        passwordlabel =new JLabel("Password:");
        passwordlabel.setBounds(10, 50, 80, 25);
        panel.add(passwordlabel);
        
        //space for password
        passwordText =new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);
        
        //after tekan button login
        success =new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);
        
        //button login
        button =new JButton("login");
        button.setBounds(210, 80, 80, 25);
        button.addActionListener(new ActionListener(){
            
        @Override
        public void actionPerformed(ActionEvent e) { //action bila tekan button login
            String user = userText.getText();
            String password= passwordText.getText();
            
            if(user.equals("abc") && password.equals("123")){
            success.setText("login successfull !!");
        }
        }
        });
        panel.add(button);
        
        button2 =new JButton("Register Account"); // make an object for register button
        button2.setBounds(45, 80,150,25);         //size of display button
        button2.addActionListener(new ActionListener(){ //action bile tekan button register
        
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
            Register.main(args);
        }
        });
        panel.add(button2);
        
        frame.setVisible(true);
    }

    

    
    
}