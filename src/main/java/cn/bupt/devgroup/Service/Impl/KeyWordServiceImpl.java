package cn.bupt.devgroup.Service.Impl;

import cn.bupt.devgroup.Mapper.KeyWordMapper;
import cn.bupt.devgroup.Model.KeyWord;
import cn.bupt.devgroup.Service.KeyWordService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author zhuangxu
 * @date 2019/12/5 14:56
 */
@Component
public class KeyWordServiceImpl implements KeyWordService {
    @Resource
    KeyWordMapper keyWordMapper;

    @Override
    public int insertKeyWord(KeyWord keyWord) {
        return keyWordMapper.inserKeyWord(keyWord);
    }

    @Override
    public int removeKeyWord(KeyWord keyWord) {
        return keyWordMapper.removeKeyWord(keyWord);
    }
}
