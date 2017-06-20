package com.yoder.stadiums.app.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yoder.stadiums.app.model.Stadium;
import com.yoder.stadiums.app.service.StadiumService;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Gareth Yoder on 6/19/2017.
 */

@Service("stadiumService")
public class StadiumServiceImpl implements StadiumService, Serializable {

    private static final long serialVersionUID = 1L;

    public List<Stadium> getStadium() throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        InputStream stadium2016JsonInputStream = new ClassPathResource("/static/Stadium-2016.json").getInputStream();

        return mapper.readValue(stadium2016JsonInputStream,  new TypeReference<List<Stadium>>(){});
    }

}
