package com.yeafel.evaluation.tree;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.yeafel.evaluation.dataobject.Option;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *  指标结点
 * Created by thc on 2019/10/8 20:47
 */
@Data
public class IndexNode {

    @JsonProperty("name")
    public String indexName;

    @JsonProperty("id")
    public Long indexId;

    public boolean spread = false;  //是否展开状态（默认false）

    @JsonIgnore
    public Long parentId;

    /** 权重. */
    private BigDecimal weight;

    /** 是否生效 (0、不生效)(1、生效)*/
    private Integer isEffective;

    @JsonProperty("href")
    public String url;

    @JsonProperty("children")
    public List<IndexNode> indexNodeList = new ArrayList<>();

    /** 对应的选项.  从选项表中取*/
    private List<Option> optionList;


    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public Long getIndexId() {
        return indexId;
    }

    public void setIndexId(Long indexId) {
        this.indexId = indexId;
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

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<IndexNode> getIndexNodeList() {
        return indexNodeList;
    }

    public void setIndexNodeList(List<IndexNode> indexNodeList) {
        this.indexNodeList = indexNodeList;
    }

    public List<Option> getOptionList() {
        return optionList;
    }

    public void setOptionList(List<Option> optionList) {
        this.optionList = optionList;
    }
}
