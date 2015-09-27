/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import javax.swing.*;

/**
 *
 * @author Mazayan
 */
public class LoginFrame extends JFrame {
    
    LoginPanel loginPanel;
    
    public LoginFrame() {
        
        loginPanel = new LoginPanel(this);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        add(loginPanel);
        setVisible(true);
    }
}
