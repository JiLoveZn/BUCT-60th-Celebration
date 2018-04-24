package com.miniprograms.buct_mini_program.Web;


import com.miniprograms.buct_mini_program.entity.Announcement;
import com.miniprograms.buct_mini_program.service.AnnouncementService;
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
public class AnnouncementController {
    @Autowired
    private AnnouncementService announcementService;

    @RequestMapping(value = "/listannouncement", method = RequestMethod.GET)
    private Map<String, Object> listAnnouncement(){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<Announcement> list = announcementService.getAnnouncement();
        modelMap.put("announcementList", list);
        return modelMap;
    }
    @RequestMapping(value = "/getannouncementbyid", method = RequestMethod.GET)
    private Map<String, Object> getAnnouncementById(Integer anId) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        Announcement announcement = announcementService.getAnnouncementById(anId);
        modelMap.put("announcement", announcement);
        return modelMap;
    }
    @RequestMapping(value = "/addannouncement", method = RequestMethod.POST)
    private Map<String, Object> addAnnouncement(@RequestBody Announcement announcement){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", announcementService.addAnnouncement(announcement));
        return modelMap;
    }
    @RequestMapping(value = "/modifyannouncement", method = RequestMethod.POST)
    private Map<String, Object> modifyAnnouncement(@RequestBody Announcement announcement){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", announcementService.modifyAnnouncement(announcement));
        return modelMap;
    }
    @RequestMapping(value = "/removeannouncement", method = RequestMethod.GET)
    private Map<String, Object> removeAnnouncement(Integer anId){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", announcementService.deleteAnnouncement(anId));
        return modelMap;
    }
}
