package cn.yangself.dao.Impl;

import cn.yangself.dao.IDao;
import org.springframework.stereotype.Component;

@Component
public class DaoImpl1 implements IDao {
    public void saveUser() {
        System.out.println("成功保存了用户1111111111111！");
    }
}
