package com.yeafel.evaluation.tree;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 *  功能结点
 * Created by thc on 2019/9/23 2:42
 */

@Data
public class ActionNode {

    @JsonProperty("name")
    public String actionName;

    @JsonProperty("id")
    public Long actionId;

    public boolean spread = false;  //是否展开状态（默认false）

    @JsonIgnore
    public Long parentId;

    @JsonProperty("href")
    public String url;

    @JsonProperty("children")
    public List<ActionNode> actionNodeList = new ArrayList<>();

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public Long getActionId() {
        return actionId;
    }

    public void setActionId(Long actionId) {
        this.actionId = actionId;
    }

    public boolean isSpread() {
        return spread;
    }

    public void setSpread(boolean spread) {
        this.spread = spread;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<ActionNode> getActionNodeList() {
        return actionNodeList;
    }

    public void setActionNodeList(List<ActionNode> actionNodeList) {
        this.actionNodeList = actionNodeList;
    }
}
