package com.djz.service;

import com.djz.pojo.Books;

import java.util.List;

/**
 * @author djz
 * @date 2020/11/23 -9:31
 */
public interface IBookService {

    void addBook(Books book);

    void updateBookById(Books books);

    void deleteBookById(int bookId);

    Books selectBookById(int bookId);

    List<Books> selectAllBooks();
}
