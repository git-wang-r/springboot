package com.offcn.demo.controller;


import com.offcn.demo.dao.pojo.Person;
import com.offcn.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/person")
public class personController {
  /*  @Autowired
    JdbcTemplate jdbcTemplate;*/


    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private PersonService personService;
   /* @GetMapping("/{id}")
    public List<Person> findone(@PathVariable("id") Long id){
        return  jdbcTemplate.query("select *from person where id=? ", new BeanPropertyRowMapper(Person.class), id);

    }*/
    @PostMapping("/")
    public String save(Person person){

            personService.save(person);

        return "success";
    }
    @GetMapping("/{id}")
    public Person findall(@PathVariable("id") Long id){


        return personService.findOne(id);

    }

}
