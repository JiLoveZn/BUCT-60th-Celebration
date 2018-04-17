package com.miniprograms.buct_mini_program.Web;

import com.miniprograms.buct_mini_program.entity.Alum;
import com.miniprograms.buct_mini_program.service.AlumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/superadmin")
public class AlumController {
    @Autowired
    private AlumService alumService;

    @RequestMapping(value = "/getalumbywxid", method = RequestMethod.GET)
    private Map<String, Object> getAlumByWxId(String wxId) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        Alum alum = alumService.getAlumByWxId(wxId);
        modelMap.put("alum", alum);
        return modelMap;
    }
    @RequestMapping(value = "/addalum", method = RequestMethod.POST)
    private Map<String, Object> addAlum(@RequestBody Alum alum){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", alumService.addAlum(alum));
        return modelMap;
    }
    @RequestMapping(value = "/modifyalum", method = RequestMethod.POST)
    private Map<String, Object> modifyAlum(@RequestBody Alum alum){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", alumService.modifyAlum(alum));
        return modelMap;
    }
    @RequestMapping(value = "/removealum", method = RequestMethod.GET)
    private Map<String, Object> removeAlum(String wxId){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", alumService.deleteAlum(wxId));
        return modelMap;
    }
}
