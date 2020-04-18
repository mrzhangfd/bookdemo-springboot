package cn.sdu.icat.bookdemo.service;

import cn.sdu.icat.bookdemo.dal.mapper.BookMapper;
import cn.sdu.icat.bookdemo.model.Book;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author icatzfd
 * Created on 2020/4/17 14:05.
 */
public interface BookService {

    /**
     * 获取所有书
     * @return
     */
    List<Book> listBook();

    /**
     * 分页查询书籍
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo<Book> bookPageInfo(int pageNum,int pageSize);

    /**
     * 增加书
     * @param name
     * @param author
     */
    void addBook(String name, String author);

    /**
     * 根据id查找书
     * @param id
     * @return
     */
    Book findById(Integer id);

    /**
     * 更新书籍
     * @param book
     */
    void update(Book book);

    /**
     * 删除书籍
     * @param id
     */
    void deleteById(Integer id);

}
