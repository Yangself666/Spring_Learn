package cn.yangself.service.impl;

import cn.yangself.dao.IDao;
import cn.yangself.service.IService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component

public class ServiceImpl implements IService {
    @Resource(name = "daoImpl1")
    private IDao daoImpl2 ;
    public void saveUser() {
        daoImpl2.saveUser();
    }

}
