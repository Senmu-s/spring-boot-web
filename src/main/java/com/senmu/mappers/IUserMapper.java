package com.senmu.mappers;

import com.senmu.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface IUserMapper {

    @Insert("insert into users(id,name,age) values(#{id},#{name},#{age})")
    void insert(User user);
}
