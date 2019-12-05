package cn.bupt.devgroup.Mapper;

import cn.bupt.devgroup.Model.KeyWord;
import org.apache.ibatis.annotations.Mapper;


/**
 * @author zhuangxu
 * @date 2019/12/5 14:58
 */
@Mapper
public interface KeyWordMapper {
    public int inserKeyWord(KeyWord keyWord);
    public int removeKeyWord(KeyWord keyword);
}
