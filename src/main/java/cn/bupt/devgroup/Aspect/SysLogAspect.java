package cn.bupt.devgroup.Aspect;

import cn.bupt.devgroup.Model.SysOperateLog;
import cn.bupt.devgroup.Model.annotation.SysLog;
import cn.bupt.devgroup.Service.SysLogService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @author zhuangxu
 * @date 2019/12/4 10:34
 */
@Aspect
@Component
public class SysLogAspect {
    @Resource
    SysLogService sysLogService;

    @Pointcut("execution(* cn.bupt.devgroup.Controller.*Controller.*(..))")
    public void logPointCut() {
    }

    @Around("logPointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("****************************");
        Object result = point.proceed();
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();
        String name = method.getName();
        System.out.println("Method Name:" + name);
        if(method.getAnnotation(SysLog.class)!=null) {
            SysLog log = method.getAnnotation(SysLog.class);
            SysOperateLog sysOperateLog=SysOperateLog.builder().operateTime(new Date()).methodName(name).methodDescription(log.description()).build();
            sysLogService.insertSysLog(sysOperateLog);
        }
        return result;
    }

}
