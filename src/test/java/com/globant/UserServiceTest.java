/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.globant;

import java.util.List;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author jaya
 */
public class UserServiceTest {
    
    public UserServiceTest() {
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
     * Test of findAllUsers method, of class UserService.
     */
    @Test
    @Ignore
    public void testFindAllUsers() {
        System.out.println("findAllUsers");
        UserService instance = new UserService();
        List<User> expResult = null;
        List<User> result = instance.findAllUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findUserByIdAndPassword method, of class UserService.
     */
    @Test
    @Ignore
    public void testFindUserByIdAndPassword() {
        System.out.println("findUserByIdAndPassword");
        User user = null;
        UserService instance = new UserService();
        User expResult = null;
        User result = instance.findUserByIdAndPassword(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findUsersByParameters method, of class UserService.
     */
    @Test
    @Ignore
    public void testFindUsersByParameters() {
        System.out.println("findUsersByParameters");
        Map<String, Object> paramMap = null;
        UserService instance = new UserService();
        List<User> expResult = null;
        List<User> result = instance.findUsersByParameters(paramMap);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
