/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
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
    String userName, passWord;
    int counter = 0;
    
    public LoginPanel(JFrame frame) 
    {
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
    
    public void actionPerformed(ActionEvent e) 
    {
        BufferedReader br = null;

		try 
                {
                    String sCurrentLine;
                    br = new BufferedReader(new FileReader("output.txt"));

                    while ((sCurrentLine = br.readLine()) != null) 
                    {
                        
                        if(counter == 0)
                        {
                            userName = (sCurrentLine);
                            counter ++;
                        }
                        
                        else
                        {
                            passWord = (sCurrentLine);
                        }
                    }
                    
                    if((usernameInsert.getText().equals(userName)) && (passwordInsert.getText().equals(passWord)))
                    {
                        success.setVisible(true);
                    }
                    
                    else
                    {
                        failure.setVisible(true);
                    }
                } 
                
               
                
                catch (IOException ee) 
                {
                    ee.printStackTrace();
		} 
                    finally 
                    {
			try 
                        {
                            if (br != null)br.close();
			} 
                        catch (IOException ex) 
                        {
                            ex.printStackTrace();
			}
		}
                
	}
    
}