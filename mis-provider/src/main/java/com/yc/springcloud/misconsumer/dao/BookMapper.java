package com.yc.springcloud.misconsumer.dao;

import com.yc.springcloud.misconsumer.domain.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookMapper extends MisBaseMapper<Book>{
}
