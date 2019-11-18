/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.plymouth.isad.library;

import java.util.Collection;
import library.MockLib;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import plymouth.isad.libary.Book;
import plymouth.isad.libary.Person;
import plymouth.isad.libary.Reader;

/**
 *
 * @author dhirst1
 */
public class PersonTest {
    
    public PersonTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void TestgetName(){
        Reader aPerson = new Reader("john");
        assertEquals("testing if the name of the per5son is equal to john",
                "john", aPerson.getName());
        MockLib lib = new MockLib();
        Collection<Book> books = lib.getBooks();
        boolean result =aPerson.borrowBook(books.iterator().next(), lib);
        assertTrue("book has been borrowed", result);
        
        
    }
}
