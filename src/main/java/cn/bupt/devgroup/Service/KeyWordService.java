package cn.bupt.devgroup.Service;

import cn.bupt.devgroup.Model.KeyWord;

/**
 * @author zhuangxu
 * @date 2019/12/5 14:54
 */
public interface KeyWordService {
    int insertKeyWord(KeyWord keyWord);
    int removeKeyWord(KeyWord keyWord);
}
