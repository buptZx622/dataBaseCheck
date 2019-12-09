package cn.bupt.devgroup.Mapper;

import cn.bupt.devgroup.Model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author zhuangxu
 * @date 2019/12/3 17:03
 */
@Mapper
public interface UserMapper {
    public int loginUserMapper(User user);
    public int removeUser(String userName);
    //public List<Map<String,Object>> selectAll(@Param("dataSource") String dataSource,@Param("tableName") String tableName);
    public List<Map<String,Object>> selectAll(@Param("tableName") String tableName);
}
