package edu.icet.ecom.service;

import edu.icet.ecom.model.dto.Book;
import edu.icet.ecom.model.entity.BookEntity;
import edu.icet.ecom.repository.BookRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    ModelMapper mapper = new ModelMapper();

    public void getAll(){
        bookRepository.findAll();
    }

    public void add(){
        BookEntity book = new BookEntity(
                1L,
                "Madol Duwa",
                "Martin Wickramasunghe",
                "Sarasavi",
                "978-955-31-0525-7",
                "Sinhala Literature",
                12
        );
        System.out.println("add method");
        bookRepository.save(book);
//        System.out.println(bookRepository.findAll());
    }

    public Book searchById(String bookId){
        Optional<BookEntity> byId = bookRepository.findById(Long.parseLong(bookId));

        BookEntity bookEntity = byId.get();

//        return new Book(
//                bookEntity.getId(),
//                bookEntity.getTitle(),
//                bookEntity.getAuthor(),
//                bookEntity.getPublisher(),
//                bookEntity.getIsbn(),
//                bookEntity.getCategory(),
//                bookEntity.getAvailableCopies()
//        );

        return mapper.map(bookEntity,Book.class);
    }

    public void add(Book book) {
        BookEntity bookEntity = mapper.map(book, BookEntity.class);
        bookRepository.save(bookEntity);
    }

}
