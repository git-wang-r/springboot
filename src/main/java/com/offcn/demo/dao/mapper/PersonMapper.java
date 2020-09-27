package com.offcn.demo.dao.mapper;


import com.offcn.demo.dao.pojo.Person;
import org.apache.ibatis.annotations.*;


import java.util.List;

@Mapper
public interface PersonMapper {
    @Insert("insert into PERSON(name,age) values(#{name},#{age})")
    public void save(Person person);

    @Update("update PERSON set name=#{name},age=#{age} where id=#{id}")
    public void update(Person person);

    @Delete("delete from PERSON where id=#{id}")
    public void delete(Long id);

    @Select("select * from PERSON")
    public List<Person> getAll();

    @Select("select * from PERSON where id=#{id}")
    public Person findOne(Long id);
}
