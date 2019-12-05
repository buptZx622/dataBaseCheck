package cn.bupt.devgroup.Service.Impl;

import cn.bupt.devgroup.Mapper.SysLogMapper;
import cn.bupt.devgroup.Model.SysOperateLog;
import cn.bupt.devgroup.Service.SysLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author zhuangxu
 * @date 2019/12/4 13:50
 */
@Component
@Slf4j
public class SysLogServiceImpl implements SysLogService {
    @Resource
    SysLogMapper sysLogMapper;

    @Override
    public int insertSysLog(SysOperateLog sysOperateLog) {
        return sysLogMapper.insertSysLog(sysOperateLog);
    }
}
