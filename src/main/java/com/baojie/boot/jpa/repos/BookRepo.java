package com.baojie.boot.jpa.repos;

import com.baojie.boot.jpa.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepo extends JpaRepository<Book,Long> {

    List<Book> findByReader(String reader);

}
