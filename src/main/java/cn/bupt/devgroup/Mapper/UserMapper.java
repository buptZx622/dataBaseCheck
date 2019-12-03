package cn.bupt.devgroup.Mapper;

import cn.bupt.devgroup.Model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhuangxu
 * @date 2019/12/3 17:03
 */
@Mapper
public interface UserMapper {
    public int loginUserMapper(User user);
    public int removeUser(String userName);
}
