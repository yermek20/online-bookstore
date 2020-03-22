package kz.example.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kz.example.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
