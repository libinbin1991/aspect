package com.space.aspect.service;

import com.space.aspect.bo.SysLogBO;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author zhuzhe
 * @date 2018/6/4 9:41
 * @email 1529949535@qq.com
 */
@Slf4j
@Service
public class SysLogService {
    private static final Logger logger = LoggerFactory.getLogger(SysLogService.class);
    public boolean save(SysLogBO sysLogBO){
        // 这里就不做具体实现了
        logger.info(sysLogBO.getParams());
        return true;
    }
}
