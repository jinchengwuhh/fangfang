package com.example.ff.demo.test.util;

import lombok.Data;
import io.swagger.annotations.ApiModel;
import java.io.Serializable;

@ApiModel("条件查找分页")
@Data
public class labVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String labId;

    private String labName;

    private String state;

    private String place;

    private String info;

    private String time;
}
