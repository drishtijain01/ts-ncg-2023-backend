package com.example.tsncg2023.view;

public class View {
    private String viewId;
    private String name;
    private String chartType;
    private String country;
    private String indicator;
    private String startDate;
    private String endDate;

    public View(String viewId, String name, String chartType, String country, String indicator, String startDate, String endDate) {
        this.viewId = viewId;
        this.name = name;
        this.chartType = chartType;
        this.country = country;
        this.indicator = indicator;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void setViewId(String viewId) {
        this.viewId = viewId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChartType(String chartType) {
        this.chartType = chartType;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setIndicator(String indicator) {
        this.indicator = indicator;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getViewId() {
        return viewId;
    }

    public String getName() {
        return name;
    }

    public String getChartType() {
        return chartType;
    }

    public String getCountry() {
        return country;
    }

    public String getIndicator() {
        return indicator;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }




}
