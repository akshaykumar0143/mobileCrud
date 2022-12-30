package com.mobile.mobileshop.service;

import com.mobile.mobileshop.entity.Mobile;
import com.mobile.mobileshop.repository.MobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MobileServiceImpl implements MobileService {

    @Autowired
    private MobileRepository mobileRepo;

    @Override
    public Mobile saveDetails(Mobile mobile) {
        return  mobileRepo.save(mobile);

    }

    @Override
    public List<Mobile> getDetails() {
        return mobileRepo.findAll();
    }

    //DTO

//    @Override
//    public MobileDto getDto(Mobile mobile) {
//        MobileDto dto= new MobileDto();
//        dto.setModel(dto.getModel());
//        dto.setSalePrice(dto.getSalePrice());
//        dto.setName(dto.getName());
//        return getDto(mobile);
    }



