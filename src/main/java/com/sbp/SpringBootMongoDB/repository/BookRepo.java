package com.sbp.SpringBootMongoDB.repository;

import com.sbp.SpringBootMongoDB.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepo extends MongoRepository<Book, Integer> {

}
