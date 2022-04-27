package com.example.filesyncdemo.config.init;

import com.example.filesyncdemo.config.util.SftpUtil;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SftpInit implements InitializingBean {

    @Autowired
    private SftpUtil sftpUtil;

    @Override
    public void afterPropertiesSet() throws Exception {
        boolean exist = sftpUtil.checkFileExist("/root/software/logs/aa.txt");

    }
}
