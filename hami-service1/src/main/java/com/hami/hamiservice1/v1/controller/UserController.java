package com.hami.hamiservice1.v1.controller;

import com.hami.hamiservice1.v1.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import user.User;

@RestController
@RequestMapping("user")
@ApiModel(value = "栏目1", description = "栏目ColumnVo1")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 根据用户Id 查
     * @return
     */
    @RequestMapping(value = "/selectUserById",method = RequestMethod.POST)
    @ApiOperation(value = "社区资讯", notes = "社区资讯")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "userId", value = "用户ID", required = true, dataType = "string"),
          })
    public User selectUserById(String userId){
        return userService.selectUserById(userId);
    }

}
