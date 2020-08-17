package com.leaves.service.impl;

import com.leaves.mapper.UserMapper;
import com.leaves.service.UserService;
import com.leaves.user.User;
import com.leaves.utils.Msg;
import com.leaves.utils.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


    @Override
    public Msg selectAllUser() {
        List<User> users = userMapper.selectAllUser();
        if (!users.isEmpty()){
            for (User user:users) {
                log.info(user.toString()+"");
            }
            //ResultUtil.success(users);
            return ResultUtil.success(users);
        }else {
            log.info("users为空");
            return ResultUtil.success(201,"users表为空");
        }
    }
}
