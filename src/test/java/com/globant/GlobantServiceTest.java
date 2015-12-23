/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.globant;

import java.io.File;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.Ignore;
//import com.sun.jersey.test.framework.JerseyTest;

/**
 *
 * @author jaya
 */
public class GlobantServiceTest {
    
    public GlobantServiceTest() {
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
     * Test of isServerAlive method, of class GlobantService.
     */
    @org.junit.Test
    @Ignore
    public void testIsServerAlive() {
        System.out.println("isServerAlive");
        GlobantService instance = new GlobantService();
        String expResult = "";
        String result = instance.isServerAlive();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isDatabaseConnectionAlive method, of class GlobantService.
     */
    @org.junit.Test
    @Ignore
    public void testIsDatabaseConnectionAlive() {
        System.out.println("isDatabaseConnectionAlive");
        GlobantService instance = new GlobantService();
        Boolean expResult = null;
        Boolean result = instance.isDatabaseConnectionAlive();
        assertEquals(expResult, result);
    }

    /**
     * Test of findFilesInFolder method, of class GlobantService.
     */
    @org.junit.Test
    @Ignore
    public void testFindFilesInFolder() {
        System.out.println("findFilesInFolder");
        String folderName = "";
        GlobantService instance = new GlobantService();
        List<String> expResult = null;
        List<String> result = instance.findFilesInFolder(folderName);
        assertEquals(expResult, result);
    }

    /**
     * Test of listFilesInGivenFolder method, of class GlobantService.
     */
    @org.junit.Test
    @Ignore
    public void testListFilesInGivenFolder() {
        System.out.println("listFilesInGivenFolder");
        File folder = null;
        GlobantService instance = new GlobantService();
        List<String> expResult = null;
        List<String> result = instance.listFilesInGivenFolder(folder);
        assertEquals(expResult, result);
    }
    
}
