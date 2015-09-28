/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mazayan
 */
public class ProgramJUnitTestTest  {
    
        public String usernameTest = "";
        public String passwordTest = "";
    
    public ProgramJUnitTestTest()  throws FileNotFoundException {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        LoginFrame frame = new LoginFrame();
        LoginPanel instance = new LoginPanel(frame);
        instance.fileReader("input.txt");
        instance.fileReader("output.txt");
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of testNullUsername method, of class ProgramJUnitTest.
     */
    @Test
    public void testTestNullUsername() {
        this.setUp();
        System.out.println("testNullUsername");
        LoginFrame frame = new LoginFrame();
        LoginPanel instance = new LoginPanel(frame);
        if (instance.userName == null) {
            System.out.println("Null password");
        } else {
            System.out.println("Password exists");
        }
    }

    /**
     * Test of testNullPassword method, of class ProgramJUnitTest.
     */
    @Test
    public void testTestNullPassword() {
        this.setUp();
        System.out.println("testNullPassword");
        LoginFrame frame = new LoginFrame();
        LoginPanel instance = new LoginPanel(frame);
        if (instance.passWord == null) {
            System.out.println("Null password");
        } else {
            System.out.println("Password exists");
        }
    }

    /**
     * Test of testUsernameMatch method, of class ProgramJUnitTest.
     */
    @Test
    public void testTestUsernameMatch() {
        this.setUp();
        System.out.println("testUsernameMatch");
        LoginFrame frame = new LoginFrame();
        LoginPanel instance = new LoginPanel(frame);
        assertEquals(instance.userName, usernameTest);
    }

    /**
     * Test of testPasswordMatch method, of class ProgramJUnitTest.
     */
    @Test
    public void testTestPasswordMatch() {
        this.setUp();
        System.out.println("testPasswordMatch");
        LoginFrame frame = new LoginFrame();
        LoginPanel instance = new LoginPanel(frame);
        assertEquals(instance.passWord, passwordTest);
    }

    /**
     * Test of testUsernameCharacterLength method, of class ProgramJUnitTest.
     */
    @Test
    public void testTestUsernameCharacterLength() {
        this.setUp();
        System.out.println("testUsernameCharacterLength");      
        LoginFrame frame = new LoginFrame();
        LoginPanel instance = new LoginPanel(frame);
        if (instance.userName.length() > 2) {
            System.out.println("Username is long enough");
        } else {
            System.out.println("Username is not long enough");
        }
    }

    /**
     * Test of testPasswordCharacterLength method, of class ProgramJUnitTest.
     */
    @Test
    public void testTestPasswordCharacterLength() {
        this.setUp();
        System.out.println("testPasswordCharacterLength");
        LoginFrame frame = new LoginFrame();
        LoginPanel instance = new LoginPanel(frame);
        if (instance.passWord.length() > 2) {
            System.out.println("Password is long enough");
        } else {
            System.out.println("Password is not long enough");
        }
    }

    /**
     * Test of testLoginSuccessful method, of class ProgramJUnitTest.
     */
    @Test
    public void testTestLoginSuccessful() {
        this.setUp();
        System.out.println("testLoginSuccessful");
        LoginFrame frame = new LoginFrame();
        LoginPanel instance = new LoginPanel(frame);
        if (instance.success.isVisible()) {
            System.out.println("Login Success");
        } else {
            System.out.println("Login failed");
        }
    }
    
}
