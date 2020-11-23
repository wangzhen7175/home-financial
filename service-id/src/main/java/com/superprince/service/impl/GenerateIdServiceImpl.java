package com.superprince.service.impl;



import com.superprince.commonutil.util.StringUtils;
import com.superprince.commonutil.util.TimeUtils;
import com.superprince.entity.po.GenerateId;
import com.superprince.mapper.GenerateIdMapper;
import com.superprince.service.GenerateIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;


@Service
public class GenerateIdServiceImpl implements GenerateIdService {

    @Autowired
    private GenerateIdMapper generateIdMapper;

    @Transactional
    @Override
    public synchronized String  generateId (String idType) {

        //获取当日8位日期格式
        String dateStr = TimeUtils.getDateString8(new Date());
        Date date = TimeUtils.getDate8(new Date());

        GenerateId generateId =  generateIdMapper.getOneByIdType(idType);
        if(generateId == null){

            generateId = new GenerateId();
            generateId.setDate(date);

            generateId.setIdType(idType);

            generateId.setMaxCode(0);

            generateIdMapper.insertOne(generateId);
        }
        Integer maxCode = 1;
        if(date.compareTo(generateId.getDate())== 0){//日期相等

            maxCode = generateId.getMaxCode();

            generateIdMapper.updateMaxCode(idType, maxCode + 1);
        }else {
            generateId.setDate(date);

            generateId.setIdType(idType);

            generateId.setMaxCode(maxCode + 1);

            generateIdMapper.updateOne(generateId);
        }

        String maxCodeStr = String.format("%05d", maxCode);

        String id = StringUtils.joinString(idType, dateStr, maxCodeStr);

        return id;
    }
}
