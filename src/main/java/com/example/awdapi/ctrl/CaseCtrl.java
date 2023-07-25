package com.example.awdapi.ctrl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/v1/case")
public class CaseCtrl {
    
    @RequestMapping(method=RequestMethod.POST)
    public String CreateCase() {
        return "POST";
    }

    @RequestMapping(method = RequestMethod.PUT)
    public String UpdateCase(){
        return "PUT";
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<String> ListCase(){
        return new ArrayList<>();
    }
    
}
