package com.zhong.flyweight;

public class Manager implements Employee {

    private  String department;
    private  String reportContent;

    @Override
    public void report() {
        System.out.println(reportContent);
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public Manager(String department) {
        this.department = department;
    }

}
