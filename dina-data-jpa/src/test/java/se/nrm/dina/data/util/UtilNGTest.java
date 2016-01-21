/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nrm.dina.data.util;

import java.util.HashMap;
import java.util.Map; 
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass; 
import org.testng.annotations.BeforeClass; 
import org.testng.annotations.Test;
import se.nrm.dina.data.exceptions.DinaException;
import se.nrm.dina.datamodel.Accession;
import se.nrm.dina.datamodel.Collectionobject;
import se.nrm.dina.datamodel.Division;
import se.nrm.dina.datamodel.EntityBean;

/**
 *
 * @author idali
 */ 
public class UtilNGTest {
    
    private Util testInstance;
    
    public UtilNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
 
    /**
     * Test of getInstance method, of class Util.
     */
    @Test
    public void testGetInstance() {
        System.out.println("testGetInstance");
         
        Util result = Util.getInstance();
        assertNotNull(result);
    }

    /**
     * Test of convertClassNameToClass method, of class Util.
     */
    @Test
    public void testConvertClassNameToClass() {
        
        System.out.println("testConvertClassNameToClass");
        
        String classname = "Accession";
        testInstance = new Util();
        Class expResult = Accession.class;
        Class result = testInstance.convertClassNameToClass(classname);
        assertEquals(result, expResult); 
        assertEquals(result.getSimpleName(), classname);
    }

    /**
     * Test of reformClassName method, of class Util.
     */
    @Test
    public void testReformClassName() {
        System.out.println("testReformClassName");
        
        String s = "collectionObject";
        
        testInstance = new Util();
        
        String expResult = "Collectionobject";
        String result = testInstance.reformClassName(s);
        assertEquals(result, expResult); 
    }

    /**
     * Test of createNewInstance method, of class Util.
     */
    @Test
    public void testCreateNewInstance() {
        System.out.println("testCreateNewInstance");
        
        String classname = "Accession";
        testInstance = new Util(); 
        Accession result = testInstance.createNewInstance(classname);
        assertNotNull(result);
        assertEquals(result.getClass().getSimpleName(), classname);
    }
    
        /**
     * Test of createNewInstance method, of class Util.
     */
    @Test
    public void testFailedCreateNewInstance() {
        System.out.println("testCreateNewInstance");
        
        String classname = "Accessions";
        testInstance = new Util(); 
        try {
            testInstance.createNewInstance(classname);
            fail("Expected a DinaException to be thrown");
        } catch (DinaException e) {
            assertEquals(e.getMessage(), "The entity name is wrong");
        } 
    }

    /**
     * Test of validateEntityName method, of class Util.
     */
    @Test
    public void testValidateEntityName() {
        System.out.println("testValidateEntityName");
        
        String entityName = "accession";
        
        testInstance = new Util();
        String expResult = "Accession";
        String result = testInstance.validateEntityName(entityName);
        assertEquals(result, expResult); 
    }
    
    /**
     * Test of validateEntityName method, of class Util.
     */
    @Test
    public void testInvalidateEntityName() {
        System.out.println("testInvalidateEntityName");

        String entityName = "accessions";

        testInstance = new Util();
        try {
            testInstance.validateEntityName(entityName);
            fail("Expected a DinaException to be thrown");
        } catch (DinaException e) {
            assertEquals(e.getMessage(), "The entity name is wrong");
        }
    }


    /**
     * Test of isFieldsValid method, of class Util.
     */
    @Test
    public void testIsFieldsValid() {
        System.out.println("testIsFieldsValid");
        
        Class clazz = Accession.class;
        
        Map<String, String> map = new HashMap();
        map.put("accessionCondition", null);
        map.put("accessionNumber", null);
        map.put("dateAccessioned", null);
        map.put("dateReceived", null);
         
        testInstance = new Util();
        boolean expResult = true;
        boolean result = testInstance.isFieldsValid(clazz, map);
        assertEquals(result, expResult);
    }

    /**
     * Test of isFieldsValid method, of class Util.
     */
    @Test
    public void testIsFieldsValidFailed() {
        System.out.println("testIsFieldsValid");

        Class clazz = Accession.class;

        Map<String, String> map = new HashMap();
        map.put("accessionConditions", null);
        map.put("accessionNumber", null);
        map.put("dateAccessioned", null);
        map.put("dateReceived", null);
         
        testInstance = new Util();  
        try {
            testInstance.isFieldsValid(clazz, map);
            fail("field name invalid");
        } catch(DinaException e) {
            assertTrue(true);
        }  
    }

    /**
     * Test of isIntField method, of class Util.
     */
    @Test
    public void testIsIntField() {
        System.out.println("isIntField");
        
        Class clazz = Collectionobject.class;
        String fieldName = "collectionMemberID";
        testInstance = new Util();
         
        boolean result = testInstance.isIntField(clazz, fieldName);
        assertTrue(result);
    }

    /**
     * Test of isEntity method, of class Util.
     */
    @Test
    public void testIsEntity() {
        System.out.println("isEntity");
    
        Class clazz = Accession.class;
        String fieldName = "divisionID";
        testInstance = new Util(); 
        boolean result = testInstance.isEntity(clazz, fieldName);
        assertTrue(result);
    }

    /**
     * Test of isCollection method, of class Util.
     */
    @Test
    public void testIsCollection() {
        System.out.println("isCollection");
        
        Class clazz = Accession.class;
        String fieldName = "deaccessionList";
        testInstance = new Util(); 
        
        boolean result = testInstance.isCollection(clazz, fieldName);
        assertTrue(result);
    }

    /**
     * Test of getEntity method, of class Util.
     */
    @Test
    public void testGetEntity() {
        System.out.println("getEntity");
        
        Class clazz = Accession.class;
        String fieldName = "divisionID";
        
        testInstance = new Util(); 
        EntityBean result = testInstance.getEntity(clazz, fieldName);
        assertTrue(result instanceof Division); 
    }

    /**
     * Test of validateFields method, of class Util.
     */
    @Test
    public void testValidateFields() {
        System.out.println("validateFields");
        
        Class clazz = Accession.class;
        String fieldName = "accessionNumber";
        
        testInstance = new Util(); 
        boolean result = testInstance.validateFields(clazz, fieldName);
        assertTrue(result);
    }

    /**
     * Test of getIDFieldName method, of class Util.
     */
    @Test
    public void testGetIDFieldName_EntityBean() {
        System.out.println("getIDFieldName");
        
        EntityBean bean = new Accession();
        String expResult = "accessionID";
        
        testInstance = new Util(); 
        String result = testInstance.getIDFieldName(bean);
        assertEquals(result, expResult); 
    }

    /**
     * Test of getIDFieldName method, of class Util.
     */
    @Test
    public void testGetIDFieldName_String() {
        System.out.println("getIDFieldName");
        
        String entityName = "Accession";
        testInstance = new Util();
        String expResult = "accessionID";
        String result = testInstance.getIDFieldName(entityName);
        assertEquals(result, expResult); 
    }

    /**
     * Test of isNumric method, of class Util.
     */
//    @Test
    public void testIsNumric() {
        System.out.println("isNumric");
        
        String s = "20";
        testInstance = new Util(); 
        boolean result = testInstance.isNumric(s);
        assertTrue(result);
         
        s = "ttt";
        result = testInstance.isNumric(s);
        assertFalse(result);
    }

    /**
     * Test of maxLimit method, of class Util.
     */
    @Test
    public void testMaxLimit() {
        System.out.println("maxLimit");
        
        int limit = 5;
        testInstance = new Util();
         
        int result = testInstance.maxLimit(limit);
        assertEquals(result, limit); 
        
        limit = 300; 
        result = testInstance.maxLimit(limit);
        assertEquals(result, 200); 
        
        limit = 0;
        result = testInstance.maxLimit(limit);
        assertEquals(result, 50); 
        
    }
    
}