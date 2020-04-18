package cn.sdu.icat.bookdemo.controller;

import cn.sdu.icat.bookdemo.model.Book;
import cn.sdu.icat.bookdemo.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author icatzfd
 * Created on 2020/4/18 10:15.
 */
@SpringBootTest
class BookControllerTest {

    @Autowired
    BookService bookService;

    @Test
    void addBookTest(){
        bookService.addBook("b21","a21");
    }

    @Test
    public void pageBookInfo() {
        int pageNum = 2;
        int pageSize = 3;
        System.out.println(bookService.bookPageInfo(pageNum, pageSize));
    }

    @Test
    public void findById(){
        System.out.println(bookService.findById(1));
    }

    @Test
    public void update(){
        Book book=new Book();
        book.setId(4);
        book.setAuthor("aa4");
        book.setName("bb4");
        bookService.update(book);
    }

    @Test
    public void delete(){
        bookService.deleteById(21);
    }
}