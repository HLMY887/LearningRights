package xyz.hlmy.common.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import xyz.hlmy.common.constant.Constant;
import xyz.hlmy.common.constant.SysConstant;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: LearningRights
 * @ClassName: R
 * @Author: lipenghui
 * @Description: 统一响应
 * @Date: 2022/11/11 15:33
 */
public class R {

    /**
     * 创建成功地响应结果
     *
     * @return String
     */
    public static String ok() {
        JSONObject successResult = new JSONObject();
        successResult.put(SysConstant.RESPONSE_CODE, Constant.SUCCESS.getCode());
        successResult.put(SysConstant.RESPONSE_MESSAGE, SysConstant.MESSAGE.get(Constant.SUCCESS.getCode()));
        return successResult.toJSONString();
    }

    /**
     * 创建成功地响应结果
     */
    public static String ok(Map<String, Object> data) {
        JSONObject successResult = new JSONObject();
        successResult.put(SysConstant.RESPONSE_CODE, Constant.SUCCESS.getCode());
        successResult.put(SysConstant.RESPONSE_MESSAGE, SysConstant.MESSAGE.get(Constant.SUCCESS.getCode()));
        successResult.put(SysConstant.RESPONSE_DATA, data);
        return successResult.toJSONString();
    }

    /**
     * 创建成功地响应结果 附带条数
     *
     * @param data 数据
     * @return String
     */
    public static <T> String ok(List<T> data, int count) {
        JSONObject successResult = new JSONObject();
        successResult.put(SysConstant.RESPONSE_CODE, Constant.SUCCESS.getCode());
        successResult.put(SysConstant.RESPONSE_MESSAGE, SysConstant.MESSAGE.get(Constant.SUCCESS.getCode()));
        successResult.put(SysConstant.RESPONSE_DATA, JSONObject.parseArray(JSON.toJSONString(data)));
        successResult.put(SysConstant.RESPONSE_COUNT, count);
        return successResult.toJSONString();
    }

    /**
     * 创建失败的响应结果
     *
     * @param errorCode 信息代码
     * @return String
     */
    public static String err(Constant errorCode) {
        JSONObject failResult = new JSONObject();
        failResult.put(SysConstant.RESPONSE_CODE, errorCode.getCode());
        failResult.put(SysConstant.RESPONSE_MESSAGE, SysConstant.MESSAGE.get(errorCode.getCode()));
        return failResult.toJSONString();
    }

    /**
     * 创建失败的响应结果
     */
    public static String err(Constant errorCode, String errorMessage) {
        JSONObject failResult = new JSONObject();
        failResult.put(SysConstant.RESPONSE_CODE, errorCode.getCode());
        failResult.put(SysConstant.RESPONSE_MESSAGE, errorMessage);
        return failResult.toJSONString();
    }
}
