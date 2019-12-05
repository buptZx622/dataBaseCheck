package cn.bupt.devgroup.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhuangxu
 * @date 2019/12/5 17:15
 */
@RequestMapping("/testJsp")
@Controller
public class TestJsp {
    @RequestMapping("/test")
    public String testJsp(){
        return "index";
    }
}
