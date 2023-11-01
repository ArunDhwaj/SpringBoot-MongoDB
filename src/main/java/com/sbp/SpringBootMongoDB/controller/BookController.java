package com.sbp.SpringBootMongoDB.controller;

import com.sbp.SpringBootMongoDB.model.Book;
import com.sbp.SpringBootMongoDB.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookRepo repo;

    @PostMapping("/book")
    public String saveBook(@RequestBody Book book){
        repo.save(book);
        return "Book saved succesfully";
    }

    @GetMapping("/books")
    public List<Book> getBooks(){
        return repo.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id){
        repo.deleteById(id);
        return "Deleted Successfully";
    }
}
