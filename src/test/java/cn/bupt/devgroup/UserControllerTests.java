package cn.bupt.devgroup;

import cn.bupt.devgroup.Controller.UserController;
import cn.bupt.devgroup.Model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author zhuangxu
 * @date 2019/12/4 10:58
 */
@SpringBootTest
public class UserControllerTests {
    @Resource
    UserController userController;
    @Test
    public void testLoginUser(){
        User user=User.builder().password("456123").userName("testAspect").build();
        userController.loginUser(user);
    }

}
