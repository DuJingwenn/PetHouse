package com.pethouse.controller;


import com.pethouse.common.dto.SwiperInfo;
import com.pethouse.common.lang.Result;
import com.pethouse.entity.PetInfo;
import com.pethouse.service.PetInfoService;
import com.pethouse.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Daven
 * @since 2021-10-05
 */
@RestController
@RequestMapping("/pet-info")
public class PetInfoController {
    @Autowired
    PetInfoService petInfoService;
    HashMap<Integer, String> map=new HashMap<>();

    @RequestMapping("/one")
    public PetInfo getOne(){
        return petInfoService.getById(1);
    }
    @RequestMapping("/swiperInfo")
    public Result getSwiperImages() {
        List<PetInfo> list = petInfoService.list();
        ArrayList<SwiperInfo> res=new ArrayList<SwiperInfo>();
        for (PetInfo pet:list){
            SwiperInfo swiperInfo=new SwiperInfo();
            swiperInfo.setPetId(pet.getPetId());
            swiperInfo.setPetPic(pet.getPetPic());
            res.add(swiperInfo);
        }
        return Result.succ(200,"请求成功",res);
    }

}
