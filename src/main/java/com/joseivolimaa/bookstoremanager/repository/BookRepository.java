package com.joseivolimaa.bookstoremanager.repository;

import com.joseivolimaa.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
