package cn.sdu.icat.bookdemo.dal.mapper;

import cn.sdu.icat.bookdemo.model.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author icatzfd
 * Created on 2020/4/17 8:59.
 */
@Mapper
@Component
public interface BookMapper {

    Book selectById(@Param("id") int id);

    List<Book> selectAll();

    List<Book> selectPage();

    void insert(@Param("name") String name, @Param("author") String author);

    void update(@Param("book") Book book);

    void deleteById(@Param("id") int id);

}
