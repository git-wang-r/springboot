package com.offcn.demo.service;


import com.offcn.demo.dao.pojo.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonService {

    public void save(Person person);


    public void update(Person person);


    public void delete(Long id);


    public List<Person> getAll();


    public Person findOne(Long id);
}

