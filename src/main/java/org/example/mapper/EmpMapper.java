package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.pojo.Emp;

import java.util.List;

@Mapper
public interface EmpMapper {
    @Select("select count(*) from emp")
    Integer count();

    @Select("select * from emp limit #{start}, #{pageSize}")
    List<Emp> page(Integer start, Integer pageSize);
}
