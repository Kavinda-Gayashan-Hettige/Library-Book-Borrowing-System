package edu.icet.ecom.controller;


import edu.icet.ecom.model.dto.Book;
import edu.icet.ecom.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("book")
@RestController
public class BookController {

    @Autowired
    BookService bookService ;


    @GetMapping("/all")
    public void getAllBookDetails(){
         bookService.getAll();
    }

    @PostMapping("/add")
    public  void add() {
        System.out.println("add method in BookController");
        bookService.add();
    }
    @GetMapping("get/{id}")
    public Book searchById(@PathVariable String bookId){
        return bookService.searchById(bookId);
    }
//    @PostMapping("/add")
    public void addBook(Book book){
        bookService.add(book);
    }
}
