package cn.bupt.devgroup.Model;

import lombok.*;

import java.util.Date;

/**
 * @author zhuangxu
 * @date 2019/12/4 10:21
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SysOperateLog {

    /**
     * 方法名
     */
    private String methodName;
    /**
     * 方法描述
     */
    private String methodDescription;
    /**
     * 方法操作时间
     */
    private Date operateTime;
}
