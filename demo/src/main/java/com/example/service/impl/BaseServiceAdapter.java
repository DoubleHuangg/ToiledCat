package com.example.service.impl;

/**
 * Created by 一只芬达 on 2019/3/7.
 */

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.transaction.annotation.Transactional;
import com.example.service.BaseService;
import com.example.repository.BaseRepository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

/**
 * 基础service 所有service继承该类
 * 提供基础的实体操作方法
 * 使用JpaRepository&lt;T,PK&gt;进行业务对象的CRUD操作,子类需重载getEntityDao()函数提供该DAO.
 *
 * @param <T>
 * @param <PK>
 * @author ty
 */
public abstract class BaseServiceAdapter<T, PK extends Serializable> implements BaseService<T, PK> {

    protected abstract BaseRepository getRepository();


    /**
     * 保存对象信息
     *
     * @param obj
     */
    public T save(T obj) {
        return (T) getRepository().save(obj);
    }

    /**
     * 返回全部数据
     *
     * @return
     */
    @Transactional(readOnly = true)
    public List<T> findAll() {
        return getRepository().findAll();
    }

    /**
     * 返回一条对象数据
     *
     * @return
     */
    @Transactional(readOnly = true)
    public T findOne(PK id) {
        Optional<T> optional = getRepository().findById(id);
        if (!optional.isPresent()) {
            return null;
        }
        return (T) optional.get();
    }

    /**
     * 通过ID，对数据进行删除
     *
     * @param id
     */
    @Transactional(readOnly = false)
    public void delete(PK id) {
        getRepository().deleteById(id);
    }

    @Transactional(readOnly = false)
    public void deleteLog(List<PK> idList) {
        for (PK id : idList) {
            getRepository().deleteById(id);
        }
    }

    /**
     * 查询数据分页信息
     *
     * @param pageable
     * @return
     */
    @Transactional(readOnly = true)
    public Page<T> findPage(Pageable pageable) {
        Page<T> page = getRepository().findAll(pageable);
        return page;
    }


    /**
     * 查询数据分页信息
     *
     * @param selJPQL
     * @param pageable
     * @return
     */
    @Transactional(readOnly = true)
    public Page<T> findPage(Specification<T> selJPQL, Pageable pageable) {
        Page<T> page = getRepository().findAll(selJPQL, pageable);
        return page;
    }
}