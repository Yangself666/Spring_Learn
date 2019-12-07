package cn.yangself;

import cn.yangself.domain.Account;
import cn.yangself.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 使用Junit单元测试我们的配置
 */
public class AccountServiceTest {
    @Test
    public void testFindAll() {
        //1.获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //2.得到业务层对象
        IAccountService service = ac.getBean("accountService",IAccountService.class);
        //3.执行方法
        List<Account> accounts = service.findAllAccount();
        for (Account account:accounts
             ) {
            System.out.println(account);
        }
    }
    @Test
    public void testFindOne() {
        //1.获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //2.得到业务层对象
        IAccountService service = ac.getBean("accountService",IAccountService.class);
        //3.执行方法
        Account account = service.findAccountById(1);
        System.out.println(account);
    }
    @Test
    public void testSave() {
        Account account = new Account();
        account.setName("刘弘扬");
        account.setMoney(6000f);
        //1.获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //2.得到业务层对象
        IAccountService service = ac.getBean("accountService",IAccountService.class);
        //3.执行方法
        service.saveAccount(account);
    }
    @Test
    public void testUpdate() {
        //1.获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //2.得到业务层对象
        IAccountService service = ac.getBean("accountService",IAccountService.class);
        //3.执行方法
        Account account = service.findAccountById(4);
        account.setMoney(20000f);
        service.updateAccount(account);
    }
    @Test
    public void testDelete() {
        //1.获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //2.得到业务层对象
        IAccountService service = ac.getBean("accountService",IAccountService.class);
        //3.执行方法
        service.deleteAccount(1);
    }
}
