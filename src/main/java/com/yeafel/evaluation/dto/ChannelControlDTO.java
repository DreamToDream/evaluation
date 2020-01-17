package com.yeafel.evaluation.dto;

import lombok.Data;

/**
 * Created by thc on 2019/10/12 23:14
 */
@Data
public class ChannelControlDTO {

    private Long channelControlId;


    private Long semesterId;


    private String semesterName;


    /**  通道状态    0、未开启   1、已开启  */
    private Integer channelState;

    public Long getChannelControlId() {
        return channelControlId;
    }

    public void setChannelControlId(Long channelControlId) {
        this.channelControlId = channelControlId;
    }

    public Long getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(Long semesterId) {
        this.semesterId = semesterId;
    }

    public String getSemesterName() {
        return semesterName;
    }

    public void setSemesterName(String semesterName) {
        this.semesterName = semesterName;
    }

    public Integer getChannelState() {
        return channelState;
    }

    public void setChannelState(Integer channelState) {
        this.channelState = channelState;
    }
}
