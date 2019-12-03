package cn.bupt.devgroup;

import cn.bupt.devgroup.Model.User;
import cn.bupt.devgroup.Service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author zhuangxu
 * @date 2019/12/3 17:12
 */
@SpringBootTest
public class UserTests {
    @Resource
    UserService userService;
    @Test
    public void testLoginUser(){
        User user= User.builder().userName("test").password("123456").build();
        userService.loginUser(user);
    }
    @Test
    public void testRemoveUser(){
        userService.removeUser("test");
    }
}
