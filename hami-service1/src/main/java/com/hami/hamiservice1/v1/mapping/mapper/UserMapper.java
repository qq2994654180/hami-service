package com.hami.hamiservice1.v1.mapping.mapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import user.User;

import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface UserMapper {
    User selectUserById(String userId);
}
