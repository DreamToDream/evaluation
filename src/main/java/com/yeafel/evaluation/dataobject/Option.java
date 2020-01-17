package com.yeafel.evaluation.dataobject;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * 选项表：（Option）
 * Created by thc on 2019/9/13 11:19
 */
@Entity
@Data
@Table(name = "[Option]")
public class Option {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long optionId;

    /** 指标id. */
    private Long indexId;


    /** 选项描述. */
    private String description;


    /** 选项的分数. */
    private BigDecimal optionScore;

    public Long getOptionId() {
        return optionId;
    }

    public void setOptionId(Long optionId) {
        this.optionId = optionId;
    }

    public Long getIndexId() {
        return indexId;
    }

    public void setIndexId(Long indexId) {
        this.indexId = indexId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getOptionScore() {
        return optionScore;
    }

    public void setOptionScore(BigDecimal optionScore) {
        this.optionScore = optionScore;
    }
}
