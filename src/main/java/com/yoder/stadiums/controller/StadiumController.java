package com.yoder.stadiums.controller;

import com.yoder.stadiums.app.model.Stadium;
import com.yoder.stadiums.app.service.StadiumService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by Gareth Yoder on 5/7/2017.
 */
@Controller
public class StadiumController {

    @Resource
    private StadiumService stadiumService;

    @RequestMapping("/")
    public String index(Map<String, Object> model) {
        try {
            List<Stadium> stadiumList = stadiumService.getStadium();
            model.put("message", stadiumList.get(0).getName());
        } catch (IOException e) {
            model.put("message", "Oops, there was an issue");
        }
        return "index";
    }

    @RequestMapping("/stadiums/{stadiumID}")
    public String hi(Map<String, Object> model, @PathVariable final Integer stadiumID) {
        try {
            List<Stadium> stadiumList = stadiumService.getStadium();
            Stadium stadium = stadiumList.stream().filter(o -> o.getStadiumID().equals(stadiumID)).findAny().orElse(null);
            model.put("message", stadium.getName() + " (" + stadiumID + ")");
        } catch (IOException e) {
            model.put("message", "Oops, there was an issue");
        }

        return "index";
    }

}
