package com.szm.service;

import com.szm.entity.PageResult;
import com.szm.entity.QueryPageBean;
import com.szm.pojo.CheckItem;

import java.util.List;

//服务接口
public interface CheckItemService {
    public void add(CheckItem checkItem);
    public PageResult pageQuery(QueryPageBean queryPageBean);
    public void deleteById(Integer id);
    public void edit(CheckItem checkItem);
    public CheckItem findById(Integer id);
    public List<CheckItem> findAll();
}
