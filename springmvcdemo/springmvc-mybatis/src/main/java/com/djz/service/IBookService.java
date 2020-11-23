package com.djz.service;

import com.djz.pojo.Books;

import java.util.List;

/**
 * @author djz
 * @date 2020/11/23 -9:31
 */
public interface IBookService {

    int addBook(Books book);

    int updateBookById(Books books);

    int deleteBookById(int bookId);

    Books selectBookById(int bookId);

    List<Books> selectAllBooks();
}
