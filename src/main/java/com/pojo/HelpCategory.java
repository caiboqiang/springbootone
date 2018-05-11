package com.pojo;

import javax.validation.constraints.Min;

public class HelpCategory {
    private Short helpCategoryId;

    private String name;
    @Min(value = 20)
    private Short parentCategoryId;

    private String url;

    public Short getHelpCategoryId() {
        return helpCategoryId;
    }

    public void setHelpCategoryId(Short helpCategoryId) {
        this.helpCategoryId = helpCategoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Short getParentCategoryId() {
        return parentCategoryId;
    }

    public void setParentCategoryId(Short parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    @Override
    public String toString() {
        return "HelpCategory{" +
                "helpCategoryId=" + helpCategoryId +
                ", name='" + name + '\'' +
                ", parentCategoryId=" + parentCategoryId +
                ", url='" + url + '\'' +
                '}';
    }
}