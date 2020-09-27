package com.offcn.demo.service.Impl;


import com.offcn.demo.dao.mapper.PersonMapper;
import com.offcn.demo.dao.pojo.Person;
import com.offcn.demo.service.PersonService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonMapper personMapper;

    @Override
    public void save(Person person) {
        System.out.println("进入service层");
        personMapper.save(person);
    }

    @Override
    public void update(Person person) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Person> getAll() {
        return null;
    }

    @Override
    public Person findOne(Long id) {

        return personMapper.findOne(id);
    }
}
