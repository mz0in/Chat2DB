package com.alibaba.ctoo.opensource.domain.api.enums;

import com.alibaba.easytools.base.enums.BaseEnum;

import lombok.Getter;

/**
 * 文章状态
 *
 * @author 是仪
 */
@Getter
public enum ArticleStatusEnum implements BaseEnum<String> {
    /**
     * 草稿
     */
    DRAFT("草稿"),

    /**
     * 已发布
     */
    RELEASE("已发布"),

    ;

    final String description;

    ArticleStatusEnum(String description) {
        this.description = description;
    }

    @Override
    public String getCode() {
        return this.name();
    }
}