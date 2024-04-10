package org.example.service;

import org.example.pojo.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> list();

    Integer delete(Integer id);

     void add(Dept dept);
}
