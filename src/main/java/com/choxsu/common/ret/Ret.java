package com.choxsu.common.ret;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author choxsu
 * @date 2019/7/19
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ret {
    /**
     * 参数错误码
     */
    private static final int PARAM_ERR = 10010;
    /**
     * 系统错误
     */
    private static final int SYS_ERR = 10011;

    private Integer status;
    private String msg;
    private Object data;


    public static Ret build() {
        return new Ret();
    }

    public static Ret ok(String msg, Object data) {
        return new Ret(1, msg, data);
    }

    public static Ret ok(String msg) {
        return new Ret(1, msg, null);
    }

    public static Ret error(String msg, Object data) {
        return new Ret(0, msg, data);
    }

    public static Ret error(String msg) {
        return new Ret(0, msg, null);
    }

    public static Ret paramError() {
        return new Ret(PARAM_ERR, "参数错误，请检查参数！", null);
    }

    public static Ret sysError() {
        return new Ret(SYS_ERR, "系统错误，请联系管理员！", null);
    }

}
