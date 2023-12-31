package com.prakhar.security.repository;

import com.prakhar.security.model.Author;
import com.prakhar.security.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
