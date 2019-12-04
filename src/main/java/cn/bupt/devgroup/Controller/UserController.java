package cn.bupt.devgroup.Controller;

import cn.bupt.devgroup.Model.User;
import cn.bupt.devgroup.Model.annotation.SysLog;
import cn.bupt.devgroup.Service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author zhuangxu
 * @date 2019/12/4 10:24
 */
@Controller
@Slf4j
@RequestMapping("/userController")
public class UserController {
    @Resource
    UserService userService;

    @SysLog(description = "注册用户")
    @RequestMapping("/loginUser")
    public void loginUser(User user){
       userService.loginUser(user);
    }
}
