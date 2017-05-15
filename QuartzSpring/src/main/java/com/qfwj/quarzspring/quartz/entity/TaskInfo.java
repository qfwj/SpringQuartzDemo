package com.qfwj.quarzspring.quartz.entity;

/**
 * Created by zhbo on 2017/5/13.
 */
public class TaskInfo {
    /*id*/
    private int id = 0;
    /*jobName 名称*/
    private String jobName;
    /*jobGroup 分组*/
    private String jobGroup;
    /*jobDescription 描述	*/
    private String jobDescription;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobGroup() {
        return jobGroup;
    }

    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /*jobStatus 状态*/
    private String jobStatus;
    /*cronExpression cron表达式*/
    private String cronExpression;
    /*createTime 创建时间*/
    private String createTime;
}
