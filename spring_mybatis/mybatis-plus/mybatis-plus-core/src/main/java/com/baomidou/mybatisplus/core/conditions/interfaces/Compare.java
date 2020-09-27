/*
 * Copyright (c) 2011-2020, hubin (jobob@qq.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.baomidou.mybatisplus.core.conditions.interfaces;

import java.io.Serializable;
import java.util.Map;
import java.util.function.BiPredicate;

/**
 * <p>
 * 查询条件封装
 * 比较值
 * </p>
 *
 * @author hubin miemie HCL
 * @since 2017-05-26
 */
public interface Compare<This, R> extends Serializable {

    /**
     * ignore
     */
    default <V> This allEq(Map<R, V> params) {
        return allEq(params, true);
    }

    /**
     * ignore
     */
    default <V> This allEq(Map<R, V> params, boolean null2IsNull) {
        return allEq(true, params, null2IsNull);
    }

    /**
     * map 所有非空属性等于 =
     *
     * @param condition   执行条件
     * @param params      map 类型的参数, key 是字段名, value 是字段值
     * @param null2IsNull 是否参数为 null 自动执行 isNull 方法, false 则忽略这个字段\
     * @return children
     */
    <V> This allEq(boolean condition, Map<R, V> params, boolean null2IsNull);

    /**
     * ignore
     */
    default <V> This allEq(BiPredicate<R, V> filter, Map<R, V> params) {
        return allEq(filter, params, true);
    }

    /**
     * ignore
     */
    default <V> This allEq(BiPredicate<R, V> filter, Map<R, V> params, boolean null2IsNull) {
        return allEq(true, filter, params, null2IsNull);
    }

    /**
     * 字段过滤接口，传入多参数时允许对参数进行过滤
     *
     * @param condition   执行条件
     * @param filter      返回 true 来允许字段传入比对条件中
     * @param params      map 类型的参数, key 是字段名, value 是字段值
     * @param null2IsNull 是否参数为 null 自动执行 isNull 方法, false 则忽略这个字段
     * @return children
     */
    <V> This allEq(boolean condition, BiPredicate<R, V> filter, Map<R, V> params, boolean null2IsNull);

    /**
     * ignore
     */
    default This eq(R column, Object val) {
        return eq(true, column, val);
    }

    /**
     * 等于 =
     *
     * @param condition 执行条件
     * @param column    字段
     * @param val       值
     * @return children
     */
    This eq(boolean condition, R column, Object val);

    /**
     * ignore
     */
    default This ne(R column, Object val) {
        return ne(true, column, val);
    }

    /**
     * 不等于 <>
     *
     * @param condition 执行条件
     * @param column    字段
     * @param val       值
     * @return children
     */
    This ne(boolean condition, R column, Object val);

    /**
     * ignore
     */
    default This gt(R column, Object val) {
        return gt(true, column, val);
    }

    /**
     * 大于 >
     *
     * @param condition 执行条件
     * @param column    字段
     * @param val       值
     * @return children
     */
    This gt(boolean condition, R column, Object val);

    /**
     * ignore
     */
    default This ge(R column, Object val) {
        return ge(true, column, val);
    }

    /**
     * 大于等于 >=
     *
     * @param condition 执行条件
     * @param column    字段
     * @param val       值
     * @return children
     */
    This ge(boolean condition, R column, Object val);

    /**
     * ignore
     */
    default This lt(R column, Object val) {
        return lt(true, column, val);
    }

    /**
     * 小于 <
     *
     * @param condition 执行条件
     * @param column    字段
     * @param val       值
     * @return children
     */
    This lt(boolean condition, R column, Object val);

    /**
     * ignore
     */
    default This le(R column, Object val) {
        return le(true, column, val);
    }

    /**
     * 小于等于 <=
     *
     * @param condition 执行条件
     * @param column    字段
     * @param val       值
     * @return children
     */
    This le(boolean condition, R column, Object val);

    /**
     * ignore
     */
    default This between(R column, Object val1, Object val2) {
        return between(true, column, val1, val2);
    }

    /**
     * BETWEEN 值1 AND 值2
     *
     * @param condition 执行条件
     * @param column    字段
     * @param val1      值1
     * @param val2      值2
     * @return children
     */
    This between(boolean condition, R column, Object val1, Object val2);

    /**
     * ignore
     */
    default This notBetween(R column, Object val1, Object val2) {
        return notBetween(true, column, val1, val2);
    }

    /**
     * NOT BETWEEN 值1 AND 值2
     *
     * @param condition 执行条件
     * @param column    字段
     * @param val1      值1
     * @param val2      值2
     * @return children
     */
    This notBetween(boolean condition, R column, Object val1, Object val2);

    /**
     * ignore
     */
    default This like(R column, Object val) {
        return like(true, column, val);
    }

    /**
     * LIKE '%值%'
     *
     * @param condition 执行条件
     * @param column    字段
     * @param val       值
     * @return children
     */
    This like(boolean condition, R column, Object val);

    /**
     * ignore
     */
    default This notLike(R column, Object val) {
        return notLike(true, column, val);
    }

    /**
     * NOT LIKE '%值%'
     *
     * @param condition 执行条件
     * @param column    字段
     * @param val       值
     * @return children
     */
    This notLike(boolean condition, R column, Object val);

    /**
     * ignore
     */
    default This likeLeft(R column, Object val) {
        return likeLeft(true, column, val);
    }

    /**
     * LIKE '%值'
     *
     * @param condition 执行条件
     * @param column    字段
     * @param val       值
     * @return children
     */
    This likeLeft(boolean condition, R column, Object val);

    /**
     * ignore
     */
    default This likeRight(R column, Object val) {
        return likeRight(true, column, val);
    }

    /**
     * LIKE '值%'
     *
     * @param condition 执行条件
     * @param column    字段
     * @param val       值
     * @return children
     */
    This likeRight(boolean condition, R column, Object val);
}