package cn.bupt.devgroup.Controller;

import cn.bupt.devgroup.Model.KeyWord;
import cn.bupt.devgroup.Model.annotation.SysLog;
import cn.bupt.devgroup.Service.KeyWordService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author zhuangxu
 * @date 2019/12/5 15:06
 */
@Controller
@RequestMapping("/keyWordController")
public class KeyWordController {
    @Resource
    KeyWordService keyWordService;

    @SysLog(description = "增加关键词")
    @RequestMapping("/insertKeyWord")
    public void insertKeyWord(KeyWord keyWord){
        if(StringUtils.isNotBlank(keyWord.getKeyWord())){
            keyWordService.insertKeyWord(keyWord);
        }
    }

    @SysLog(description = "删除关键词")
    @RequestMapping("/removeKeyWord")
    public void removeKeyWord(KeyWord keyWord){
        if(StringUtils.isNotBlank(keyWord.getKeyWord())){
            keyWordService.removeKeyWord(keyWord);
        }
    }

}
