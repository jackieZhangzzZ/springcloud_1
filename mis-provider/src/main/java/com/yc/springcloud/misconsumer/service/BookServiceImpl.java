package com.yc.springcloud.misconsumer.service;

import com.yc.springcloud.misconsumer.dao.BookMapper;
import com.yc.springcloud.misconsumer.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired(required = false)
    private BookMapper bookMapper;

    @Override
    public Book getBook(Integer id) {
        return bookMapper.selectByPrimaryKey(id);
    }
}
