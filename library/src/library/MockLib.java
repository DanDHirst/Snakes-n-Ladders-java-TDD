/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.ArrayList;
import java.util.Collection;
import plymouth.isad.libary.Book;
import plymouth.isad.libary.ILibrary;

/**
 *
 * @author dhirst1
 */
public class MockLib implements ILibrary {

    Collection<Book> books;
    public MockLib(){
        books = new ArrayList<>();
        Book aBook = new Book("Harry Potter and the Philosopher's Stone", "J. K. Rowling", false);
        addBook(aBook);
        Book aBook2 = new Book("The Da Vinci Code", "Dan Brown", false);
        addBook(aBook2);
        
        
    }
    @Override
    public Collection<Book> getBooks() {
       return this.books;
    }
    public void addBook(Book book){
        books.add(book);
    }
//    public void borrowBook(Book aBook){
//        for (Book book : books){
//            if(book.getTitle() == aBook.getTitle() && book.isLoaned() == false){
//                book.loan();
//            }
//        }
//    }
    
    
}
