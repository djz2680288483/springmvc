package com.djz.controller;

import com.djz.pojo.Books;
import com.djz.service.IBookService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author djz
 * @date 2020/11/23 -9:37
 */
@Controller
@RequestMapping("/book")
@Data
public class BookController {
    @Autowired
    @Qualifier("bookServiceImpl")
    private IBookService service;

    @RequestMapping("/list")
    public String getAll(Model model) {
       List<Books> list=service.selectAllBooks();
       model.addAttribute("list",list);
        return "book";
    }


}
