/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

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
public class ProgramJUnitTestTest {
    
    public ProgramJUnitTestTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of testNullUsername method, of class ProgramJUnitTest.
     */
    @Test
    public void testTestNullUsername() {
        System.out.println("testNullUsername");
        LoginFrame frame = new LoginFrame();
        LoginPanel instance = new LoginPanel(frame);
        if (instance.userName.isEmpty()) {
            System.out.println("Null password");
        } else {
            System.out.println("Password exists");
        }
        fail("The test case is a prototype.");
    }

    /**
     * Test of testNullPassword method, of class ProgramJUnitTest.
     */
    @Test
    public void testTestNullPassword() {
        System.out.println("testNullPassword");
        LoginFrame frame = new LoginFrame();
        LoginPanel instance = new LoginPanel(frame);
        if (instance.passWord.isEmpty()) {
            System.out.println("Null password");
        } else {
            System.out.println("Password exists");
        }
        fail("The test case is a prototype.");
    }

    /**
     * Test of testUsernameMatch method, of class ProgramJUnitTest.
     */
    @Test
    public void testTestUsernameMatch() {
        System.out.println("testUsernameMatch");
        LoginFrame frame = new LoginFrame();
        LoginPanel instance = new LoginPanel(frame);
        assertEquals(instance.userName, instance.usernameInsert.getText());
        fail("The test case is a prototype.");
    }

    /**
     * Test of testPasswordMatch method, of class ProgramJUnitTest.
     */
    @Test
    public void testTestPasswordMatch() {
        System.out.println("testPasswordMatch");
        LoginFrame frame = new LoginFrame();
        LoginPanel instance = new LoginPanel(frame);
        assertEquals(instance.passWord, instance.passwordInsert.getText());
        fail("The test case is a prototype.");
    }

    /**
     * Test of testUsernameCharacterLength method, of class ProgramJUnitTest.
     */
    @Test
    public void testTestUsernameCharacterLength() {
        System.out.println("testUsernameCharacterLength");
        LoginFrame frame = new LoginFrame();
        LoginPanel instance = new LoginPanel(frame);
        if (instance.userName.length() > 1) {
            System.out.println("Username is long enough");
        } else {
            System.out.println("Username is not long enough");
        }
        fail("The test case is a prototype.");
    }

    /**
     * Test of testPasswordCharacterLength method, of class ProgramJUnitTest.
     */
    @Test
    public void testTestPasswordCharacterLength() {
        System.out.println("testPasswordCharacterLength");
        LoginFrame frame = new LoginFrame();
        LoginPanel instance = new LoginPanel(frame);
        if (instance.passWord.length() > 1) {
            System.out.println("Password is long enough");
        } else {
            System.out.println("Password is not long enough");
        }
        fail("The test case is a prototype.");
    }

    /**
     * Test of testLoginSuccessful method, of class ProgramJUnitTest.
     */
    @Test
    public void testTestLoginSuccessful() {
        System.out.println("testLoginSuccessful");
        LoginFrame frame = new LoginFrame();
        LoginPanel instance = new LoginPanel(frame);
        if (instance.success.isVisible()) {
            System.out.println("Login Success");
        } else {
            System.out.println("Login failed");
        }
        fail("The test case is a prototype.");
    }
    
}
