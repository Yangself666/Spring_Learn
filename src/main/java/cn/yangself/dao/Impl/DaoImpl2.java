package cn.yangself.dao.Impl;

import cn.yangself.dao.IDao;
import org.springframework.stereotype.Component;

@Component
public class DaoImpl2 implements IDao {
    public void saveUser() {
        System.out.println("成功保存了用户！222222222222");
    }
}
