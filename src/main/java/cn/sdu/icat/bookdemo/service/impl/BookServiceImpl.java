package cn.sdu.icat.bookdemo.service.impl;

import cn.sdu.icat.bookdemo.dal.mapper.BookMapper;
import cn.sdu.icat.bookdemo.model.Book;
import cn.sdu.icat.bookdemo.service.BookService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author icatzfd
 * Created on 2020/4/17 14:07.
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookMapper bookMapper;

    @Override
    public List<Book> listBook() {
        return bookMapper.selectAll();
    }

    @Override
    public PageInfo<Book> bookPageInfo(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Book> allBook = bookMapper.selectAll();
        PageInfo<Book> bookPageInfo = new PageInfo<Book>(allBook);
        return bookPageInfo;

    }

    @Override
    public void addBook(String name, String author) {
        bookMapper.insert(name, author);
    }

    @Override
    public Book findById(Integer id) {
        return bookMapper.selectById(id);
    }

    @Override
    public void update(Book book) {
        bookMapper.update(book);
    }

    @Override
    public void deleteById(Integer id) {
        bookMapper.deleteById(id);
    }
}
