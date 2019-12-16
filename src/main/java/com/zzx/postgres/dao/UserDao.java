package com.zzx.postgres.dao;

import com.zzx.postgres.po.UserPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {

    @Select("SELECT * FROM \"public\".\"user\" where id=1")
    List<UserPO> all();
}
