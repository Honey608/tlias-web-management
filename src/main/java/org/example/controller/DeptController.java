package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.pojo.Dept;
import org.example.pojo.Result;
import org.example.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/depts")
public class DeptController {
    @Autowired
    DeptService deptService;

    /*
    * 查询
    * */
    @GetMapping
    public Result list(){
        List<Dept> list = deptService.list();
        return Result.success(list);
    }

    /*
    * 删除
    * */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        deptService.delete(id);
        return Result.success();
    }

    /*
    * 新增
    * */
    @PostMapping
    public Result add(@RequestBody Dept dept){
        deptService.add(dept);
        return Result.success();
    }

}
