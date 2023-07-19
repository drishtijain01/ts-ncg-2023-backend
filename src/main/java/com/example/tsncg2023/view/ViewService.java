package com.example.tsncg2023.view;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ViewService {
    private List<View> views = new ArrayList<>(Arrays.asList(
            new View("1","Poverty Headcount ($1.90 a day)","Pie","India","1.0.HCount.1.90usd", "18_July_2009", "20_July_2015"),
            new View("2","Middle Class ($10-50 a day) Headcount","Bar","USA", "1.0.HCount.Mid10to50", "15_Aug_2010", "16_Aug_2018"),
            new View("3","Official Moderate Poverty Rate-National", "Pie","Africa","1.0.HCount.Poor4uds","16_Aug_2001","12_AUg_2019")
    ));

    public List<View> getViews() {
        return views;
    }

    public View getView(String viewId){
        return views.stream().filter(view -> view.getViewId().equals(viewId)).findFirst().get();
    }

    public void addView(View view) {
        views.add(view);
    }

    public void deleteView(String viewId) {
        views.removeIf(view -> view.getViewId().equals(viewId));
    }
}


