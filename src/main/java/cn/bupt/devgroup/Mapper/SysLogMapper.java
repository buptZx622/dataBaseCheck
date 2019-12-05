package cn.bupt.devgroup.Mapper;

import cn.bupt.devgroup.Model.SysOperateLog;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhuangxu
 * @date 2019/12/5 15:19
 */
@Mapper
public interface SysLogMapper {
    int insertSysLog(SysOperateLog sysOperateLog);
}
