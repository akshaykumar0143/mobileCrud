package com.mobile.mobileshop.controller;

import com.mobile.mobileshop.dto.MobileDto;
import com.mobile.mobileshop.entity.Mobile;
import com.mobile.mobileshop.service.MobileService;
import com.mobile.mobileshop.service.MobileServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MobileController {

    @Autowired
    private MobileServiceImpl mobileService;

    // entity

    @GetMapping("/allMobiles")
    public List<Mobile> getDetails(){
        return mobileService.getDetails();

    }

    @PostMapping("/save")
    public Mobile saveMobile(@RequestBody Mobile mobile) {
      return   mobileService.saveDetails(mobile);
    }

//    // DTO Calling
//
//    @GetMapping("/dto")
//    public MobileDto getDto(@RequestBody  Mobile mobile ) {
//        return mobileService.getDto(mobile);
    }

