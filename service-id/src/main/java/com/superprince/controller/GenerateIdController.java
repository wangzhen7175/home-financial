package com.superprince.controller;

import com.superprince.service.GenerateIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "/generateId")
public class GenerateIdController {

    @Autowired
    private GenerateIdService generateIdService;

    /**
     * 自动生成id
     * @param idType
     * @return
     */
    @RequestMapping(value = "/id",method = RequestMethod.GET)
    public String login(@RequestParam @Value("idType") @NonNull String idType){

        return generateIdService.generateId(idType);

    }
}
