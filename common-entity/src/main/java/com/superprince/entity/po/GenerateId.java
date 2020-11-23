package com.superprince.entity.po;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class GenerateId {

    private String idType;
    private Date date;
    private Integer maxCode;

}
