package com.example.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 一只芬达 on 2019/3/7.
 */
public interface BaseService<T, PK extends Serializable> {

    /**
     * 保存数据
     *
     * @param object
     */
    T save(T object);

    /**
     * 返回全部数据
     *
     * @return
     */
    List<T> findAll();

    /**
     * 返回一条对象数据
     *
     * @return
     */
    T findOne(PK id);

    /**
     * 通过ID，对数据进行删除
     *
     * @param id
     */
    void delete(PK id);

    /**
     * 删除数据
     *
     * @param idList
     */
    void deleteLog(List<PK> idList);

    /**
     * 查询数据分页信息
     *
     * @param pageable
     * @return
     */
    Page<T> findPage(Pageable pageable);

    /**
     * 查询数据分页信息
     * @param selJPQL
     * @param pageable
     * @return
     */
    Page<T> findPage(Specification<T> selJPQL, Pageable pageable);
}