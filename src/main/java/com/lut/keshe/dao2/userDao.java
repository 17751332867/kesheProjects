package com.lut.keshe.dao2;

import com.lut.keshe.pojo.user;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**
 * Created by ASUS on 2021/7/5.
 */
@Mapper
@Repository
public interface userDao {

    @Select("select * from user where userid=#{userId} and password=#{password}")
    user login(@Param("userId") int userId, @Param("password") String password);

    @Select("select * from user where userid=#{userid}")
    user selectuserByID(int userid);

    @Delete("delete from user where userid=#{userid}")
    boolean deleteuser(int userid);

    @Update("update user set(password)=(#{password}) where userID=#{ID}")
    boolean changePassword(int ID,String password);

    @Insert("insert into user(userid,password) values(#{userid},#{password})")
    boolean adduser(@Param("userid") int userid,@Param("password") String password);

}
