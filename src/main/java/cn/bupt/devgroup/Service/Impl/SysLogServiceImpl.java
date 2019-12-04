package cn.bupt.devgroup.Service.Impl;

import cn.bupt.devgroup.Model.SysOperateLog;
import cn.bupt.devgroup.Service.SysLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author zhuangxu
 * @date 2019/12/4 13:50
 */
@Component
@Slf4j
public class SysLogServiceImpl implements SysLogService {

    @Override
    public int insertSysLog(SysOperateLog sysOperateLog) {
        return 0;
    }
}
