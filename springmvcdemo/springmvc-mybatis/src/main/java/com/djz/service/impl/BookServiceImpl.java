package com.djz.service.impl;

import com.djz.pojo.Books;
import com.djz.dao.BookMapper;
import com.djz.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author djz
 * @date 2020/11/23 -9:31
 */
public class BookServiceImpl implements IBookService {
    //service 调dao层
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public void addBook(Books book) {

    }

    public void updateBookById(Books books) {

    }

    public void deleteBookById(int bookId) {

    }

    public Books selectBookById(int bookId) {
        return null;
    }

    public List<Books> selectAllBooks() {


        return bookMapper.selectAllBooks();
    }
}
