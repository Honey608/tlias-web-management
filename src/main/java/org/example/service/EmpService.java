package org.example.service;

import org.example.pojo.PageBean;

public interface EmpService {
    PageBean page(Integer page, Integer pageSize);
}
