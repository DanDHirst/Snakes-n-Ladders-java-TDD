/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.plymouth.isad.library.integration;

import java.io.IOException;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import plymouth.isad.libary.Book;
import plymouth.isad.libary.Library;
import plymouth.isad.libary.Reader;

/**
 *
 * @author dhirst1
 */
public class TestReader {
    
    public TestReader() {
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
    public void libTest() throws IOException{
        Reader John = new Reader("John");
        assertEquals("testing if the name of the per5son is equal to john",
                "John", John.getName());
        Library lib = new Library();
        lib.loadBooks();
        Collection <Book> books = lib.getBooks();
        boolean result = John.borrowBook(books.iterator().next(), lib);
        assertTrue("test lib is borrowed", result);
    }
}
