package com.space.aspect.service.impl;

import com.space.aspect.anno.SysLog;
import com.space.aspect.bo.SysLogBO;
import com.space.aspect.service.SysLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: Sunshine Insurance Group Co., Ltd.</p>
 *
 * @author lbb
 * @version 1.0
 * 修改记录：
 * 修改序号，修改日期，修改人，修改内容
 */
@Service
public class SysLogServiceImpl implements SysLogService{



    private static final Logger logger = LoggerFactory.getLogger(SysLogService.class);

    @SysLog("测试")
    @Override
    public String doWork(String name) {


        System.out.println("一系列方法-------------------------");

        return name;
    }
}
