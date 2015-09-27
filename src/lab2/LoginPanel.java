/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Mazayan
 */
public class LoginPanel extends JPanel implements ActionListener {
    
    private final JFrame frame;
    public JButton submit;
    public JLabel username, password, success, failure;
    public JTextField usernameInsert, passwordInsert;
    
    public LoginPanel(JFrame frame) {
        this.frame = frame;
        setLayout(null);
       
        
        submit = new JButton("Submit");
        submit.setBounds(200, 300, 100, 50);
        submit.addActionListener((ActionListener) this);
        add(submit);
        
        username = new JLabel("Username");
        username.setBounds(100,50,100,50);
        add(username);
        
        usernameInsert = new JTextField();
        usernameInsert.setBounds(200, 50, 100, 50);
        add(usernameInsert);
        
        password = new JLabel("Password");
        password.setBounds(100,200,100,50);
        add(password);
        
        passwordInsert = new JTextField();
        passwordInsert.setBounds(200, 200, 100, 50);
        add(passwordInsert);
        
        success = new JLabel("Login successful");
        success.setBounds(350, 300, 200, 50);
        add(success);
        success.setForeground(Color.GREEN);
        success.setVisible(false);
        
        failure = new JLabel("Login failed");
        failure.setBounds(400, 300, 200, 50);
        failure.setForeground(Color.RED);
        add(failure);
        failure.setVisible(false);
        
    }
    
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        
        if(obj == submit) {
        try (PrintWriter out = new PrintWriter(new FileWriter("output.txt", true))) {

            out.print(usernameInsert.getText() + " : " + passwordInsert.getText() + "\n");
        }   catch (FileNotFoundException ex) {
                Logger.getLogger(LoginPanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(LoginPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
