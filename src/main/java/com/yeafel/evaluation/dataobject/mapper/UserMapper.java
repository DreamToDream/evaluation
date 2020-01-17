package com.yeafel.evaluation.dataobject.mapper;

import com.yeafel.evaluation.dataobject.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by thc on 2019/9/26 22:29
 */
public interface UserMapper {

    List<User> findUsersIfUsernameIsNotNull(@Param("username") String username);
}
