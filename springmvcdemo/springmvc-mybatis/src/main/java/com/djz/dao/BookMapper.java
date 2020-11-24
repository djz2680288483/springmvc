package com.djz.dao;

import com.djz.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author djz
 * @date 2020/11/23 -9:33
 */
public interface BookMapper {

    int addBook(Books book);

    int updateBookById(Books books);

    int deleteBookById(@Param("bookId") int bookId);

    Books selectBookById(@Param("bookId") int bookId);

    List<Books> selectAllBooks();

    List<Books> queryBookByName(@Param("bookName")  String bookName);
}
