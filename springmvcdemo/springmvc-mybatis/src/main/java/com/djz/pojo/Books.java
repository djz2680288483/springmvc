package com.djz.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author djz
 * @date 2020/11/23 -9:08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    private int bookId;
    private String bookName;
    private double price;
    private int bookCount;
    private String author;

}
