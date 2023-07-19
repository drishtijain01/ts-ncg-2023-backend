package com.example.tsncg2023.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.Arrays;
import java.util.List;
@RestController
public class ViewController {
    @Autowired
    private ViewService viewService;
    @RequestMapping(value = "/view")
    public List<View> getAllViews() {
        return viewService.getViews();
    }

    @RequestMapping("view/{viewId}")
    public View getView(@PathVariable String viewId){
        return viewService.getView(viewId);
    }
    @RequestMapping (method= RequestMethod.POST, value="/view")
    public void addView (@RequestBody View view) {
        viewService.addView(view);
    }

    @RequestMapping (method= RequestMethod.DELETE, value="/view/{viewId}")
    public void deleteView (@PathVariable String viewId) {
        viewService.deleteView(viewId);
    }
}
