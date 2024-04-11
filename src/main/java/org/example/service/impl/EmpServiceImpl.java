package org.example.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.example.mapper.EmpMapper;
import org.example.pojo.Emp;
import org.example.pojo.PageBean;
import org.example.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    EmpMapper empMapper;

    @Override
    public PageBean page(Integer page, Integer pageSize) {
        Integer count = empMapper.count();
        Integer start = (page-1)*pageSize;
        List<Emp> empList = empMapper.page(start, pageSize);
        PageBean pageBean = new PageBean(count, empList);
        log.info("pageBean=========>", pageBean);
        return pageBean;
    }
}
