package cn.bupt.devgroup.Model;

import lombok.*;

/**
 * @author zhuangxu
 * @date 2019/12/3 16:49
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private String userName;
    private String password;
    /**
     * 账户有效标识符 0：无效  1：有效
     */
    private Integer status;
}
