package com.yoder.stadiums.app.service;

import com.yoder.stadiums.app.model.Stadium;

import java.io.IOException;
import java.util.List;

/**
 * Created by Gareth Yoder on 6/19/2017.
 */
public interface StadiumService {

    /**
     * Retrieves a list of the 2016 stadiums
     * @return the list of stadiums
     */
    List<Stadium> getStadium() throws IOException;
}
