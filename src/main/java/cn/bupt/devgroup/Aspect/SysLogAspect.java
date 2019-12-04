package cn.bupt.devgroup.Aspect;

import cn.bupt.devgroup.Model.SysOperateLog;
import cn.bupt.devgroup.Model.annotation.SysLog;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author zhuangxu
 * @date 2019/12/4 10:34
 */
@Aspect
@Component
public class SysLogAspect {

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
            System.out.println("log description:" + log.description());
        }
        return result;
    }

}
