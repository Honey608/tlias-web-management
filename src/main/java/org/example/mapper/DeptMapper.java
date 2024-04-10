package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.pojo.Dept;

import java.util.List;

@Mapper
public interface DeptMapper {
    List<Dept> list();

    Integer delete(Integer id);

    Integer  add(Dept dept);
}
