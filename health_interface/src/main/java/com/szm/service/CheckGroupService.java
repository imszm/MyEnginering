package com.szm.service;

import com.szm.entity.PageResult;
import com.szm.entity.QueryPageBean;
import com.szm.pojo.CheckGroup;

import java.util.List;

public interface CheckGroupService {
    public void add(CheckGroup checkGroup, Integer[] checkitemIds);
    public PageResult pageQuery(QueryPageBean queryPageBean);
    public CheckGroup findById(Integer id);
    public List<Integer> findCheckItemIdsByCheckGroupId(Integer id);
    public void edit(CheckGroup checkGroup, Integer[] checkitemIds);
    public List<CheckGroup> findAll();
}
