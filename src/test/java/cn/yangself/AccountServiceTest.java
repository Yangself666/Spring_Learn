package cn.yangself;

import cn.yangself.domain.Account;
import cn.yangself.service.IAccountService;
import config.SpringConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 使用Junit单元测试我们的配置
 * Spring整合junit的配置
 *      1、导入spring整合junit的jar包（坐标）
 *      2、使用Junit提供的一个注解把原有的main方法替换，替换成Spring提供的
 *          @Runwith
 *      3、告知spring的运行器，spring和ioc创建是基于xml还是注解的，并且说明位置
 *          @ContextConfiguration
 *                  Location:指定xml文件的位置，加上classpath关键字，便是在类路径下
 *                  classes:指定注解类所在地位置
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class AccountServiceTest {

    @Autowired
    private IAccountService service;

    @Test
    public void testFindAll() {
        //3.执行方法
        List<Account> accounts = service.findAllAccount();
        for (Account account : accounts
        ) {
            System.out.println(account);
        }
    }

    @Test
    public void testFindOne() {
        //3.执行方法
        Account account = service.findAccountById(1);
        System.out.println(account);
    }

    @Test
    public void testSave() {
        Account account = new Account();
        account.setName("刘弘扬");
        account.setMoney(6000f);
        //3.执行方法
        service.saveAccount(account);
    }

    @Test
    public void testUpdate() {
        //3.执行方法
        Account account = service.findAccountById(4);
        account.setMoney(20000f);
        service.updateAccount(account);
    }

    @Test
    public void testDelete() {
        //3.执行方法
        service.deleteAccount(5);
    }
}
