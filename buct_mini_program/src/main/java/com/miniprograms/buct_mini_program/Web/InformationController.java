package com.miniprograms.buct_mini_program.Web;


import com.miniprograms.buct_mini_program.entity.Information;
import com.miniprograms.buct_mini_program.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/superadmin")
public class InformationController {
    @Autowired
    private InformationService informationService;

    @RequestMapping(value = "/listinformation", method = RequestMethod.GET)
    private Map<String, Object> listInformation(){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<Information> list = informationService.getInformation();
        modelMap.put("informationList", list);
        return modelMap;
    }
    @RequestMapping(value = "/getinformationbyid", method = RequestMethod.GET)
    private Map<String, Object> getInformationById(Integer inId) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        Information information = informationService.getInformationById(inId);
        modelMap.put("information", information);
        return modelMap;
    }
    @RequestMapping(value = "/addinformation", method = RequestMethod.POST)
    private Map<String, Object> addInformation(@RequestBody Information information){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", informationService.addInformation(information));
        return modelMap;
    }
    @RequestMapping(value = "/modifyinformation", method = RequestMethod.POST)
    private Map<String, Object> modifyInformation(@RequestBody Information information){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", informationService.modifyInformation(information));
        return modelMap;
    }
    @RequestMapping(value = "/removeinformation", method = RequestMethod.GET)
    private Map<String, Object> removeInformation(Integer inId){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", informationService.deleteInformation(inId));
        return modelMap;
    }
}
