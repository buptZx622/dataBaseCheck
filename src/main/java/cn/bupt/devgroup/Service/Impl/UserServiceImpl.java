package cn.bupt.devgroup.Service.Impl;

import cn.bupt.devgroup.Mapper.UserMapper;
import cn.bupt.devgroup.Model.User;
import cn.bupt.devgroup.Service.UserService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author zhuangxu
 * @date 2019/12/3 16:57
 */
@Component
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public int loginUser(User user) {
        return userMapper.loginUserMapper(user);
    }

    @Override
    public int removeUser(String userName) {
        return userMapper.removeUser(userName);
    }
}
