package cn.bupt.devgroup.Service;

import cn.bupt.devgroup.Model.User;

/**
 * @author zhuangxu
 * @date 2019/12/3 16:56
 */
public interface UserService {
    public int loginUser(User user);
    public int removeUser(String userName);
}
