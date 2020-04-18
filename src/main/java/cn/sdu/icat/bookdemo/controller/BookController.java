package cn.sdu.icat.bookdemo.controller;

import cn.sdu.icat.bookdemo.model.Book;
import cn.sdu.icat.bookdemo.service.BookService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author icatzfd
 * Created on 2020/4/17 8:54.
 */
@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/test")
    public @ResponseBody
    List<Book> listAll() {
        List<Book> list = bookService.listBook();
        return bookService.listBook();
    }

    /**
     * 分页查询
     * @param pageNum 页数
     * @param pageSize 每页大小
     * @return
     */
    @GetMapping("/getAll/{pageNum}/{pageSize}")
    public @ResponseBody
    PageInfo<Book> listPage(@PathVariable("pageNum") Integer pageNum, @PathVariable("pageSize") Integer pageSize) {

        return bookService.bookPageInfo(pageNum, pageSize);
    }

    @PostMapping("/addBook")
    public @ResponseBody
    String addBook(@RequestBody Book book) {
        bookService.addBook(book.getName(),book.getAuthor());
        return "success";
    }

    @GetMapping("/getBookById/{id}")
    public @ResponseBody
    Book getBookById(@PathVariable("id") Integer id){
        return bookService.findById(id);
    }

    @PutMapping("/updateBook")
    public String updateBook(@RequestBody Book book){
        bookService.update(book);
        return "success";
    }

    @DeleteMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable("id") Integer id){
        bookService.deleteById(id);
        return "success";
    }
}
