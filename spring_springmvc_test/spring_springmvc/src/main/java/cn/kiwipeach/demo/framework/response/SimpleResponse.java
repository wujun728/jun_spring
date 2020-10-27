/*
 * Copyright 2017 KiWiPeach.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.kiwipeach.demo.framework.response;

import cn.kiwipeach.demo.enums.business.BusinessEnums;

/**
 * Create Date: 2018/01/16
 * Description: 单个返回实体对象类
 *
 * @author kiwipeach [1099501218@qq.com]
 */
public class SimpleResponse<T> extends BaseResponse {
    /**
     * 实体数据
     */
    private T data;

    /**
     * 默认构造
     */
    public SimpleResponse() {
    }

    /**
     * 成功构造函数1
     *
     * @param data 返回数据
     */
    public SimpleResponse(T data) {
        super(true);
        this.data = data;
    }

    /**
     * 失败构造
     *
     * @param code    失败code
     * @param message 失败message
     */
    public SimpleResponse(String code, String message) {
        super(code, message);
    }

    /**
     * 失败构造
     *
     * @param isSuccess 是否失败
     * @param codeEnum  失败枚举信息
     */
    public SimpleResponse(boolean isSuccess, BusinessEnums codeEnum) {
        super(isSuccess, codeEnum);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}