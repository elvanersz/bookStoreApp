package com.elvan.bookStore.repository;

import com.elvan.bookStore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Long>
{
}
