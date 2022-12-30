package com.mobile.mobileshop.service;

import com.mobile.mobileshop.dto.MobileDto;
import com.mobile.mobileshop.entity.Mobile;

import java.util.List;

public interface MobileService {

    //Entity

    Mobile saveDetails(Mobile mobile);
    List<Mobile> getDetails();

    //Dto

   // MobileDto getDto(Mobile mobile);



}
