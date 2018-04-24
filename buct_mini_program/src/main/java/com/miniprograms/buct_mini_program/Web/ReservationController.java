package com.miniprograms.buct_mini_program.Web;

import com.miniprograms.buct_mini_program.entity.Reservation;
import com.miniprograms.buct_mini_program.service.ReservationService;
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
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    @RequestMapping(value = "/listreservation", method = RequestMethod.GET)
    private Map<String, Object> getReservation() {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<Reservation> reservationList = reservationService.getReservationList();
        modelMap.put("reservationList", reservationList);
        return modelMap;
    }
    @RequestMapping(value = "/addreservation", method = RequestMethod.POST)
    private Map<String, Object> addReservation(@RequestBody Reservation reservation){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", reservationService.addReservation(reservation));
        return modelMap;
    }
    @RequestMapping(value = "/removereservation", method = RequestMethod.GET)
    private Map<String, Object> removeReservation(Integer reId){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", reservationService.deleteReservation(reId));
        return modelMap;
    }
}
