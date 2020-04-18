package cn.sdu.icat.bookdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.sdu.icat.bookdemo.dal.mapper")
public class BookdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookdemoApplication.class, args);
    }

}
