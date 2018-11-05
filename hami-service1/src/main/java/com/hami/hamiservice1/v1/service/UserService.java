package com.hami.hamiservice1.v1.service;

import com.hami.hamiservice1.v1.mapping.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import user.User;


@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    /**
     * 根据用户Id 查
     * @param userId
     * @return
     */
    public User selectUserById(String userId){
        return userMapper.selectUserById(userId);
    }

}
