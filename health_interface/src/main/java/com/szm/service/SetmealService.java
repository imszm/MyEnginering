package com.szm.service;

import com.szm.entity.PageResult;
import com.szm.entity.QueryPageBean;
import com.szm.pojo.Setmeal;

import java.util.List;
import java.util.Map;

public interface SetmealService {
    public void add(Setmeal setmeal, Integer[] checkgroupIds);

    public PageResult pageQuery(QueryPageBean queryPageBean);

    public List<Setmeal> findAll();

    public Setmeal findById(int id);

    List<Map<String, Object>> findSetmealCount();
}