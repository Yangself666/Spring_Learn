package cn.yangself.test;

import cn.yangself.service.IService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    /**
     * 获取spring的Ioc核心容器，并根据id获取对象
     *
     * ApplicationContext的三个常用实现类：
     *      ClassPathXmlApplicationContext:他可以家在类路径下的配置文件，要求配置文件必须在类路径下
     *      FileSystemXmlApplicationContext:他可以家在磁盘任意路径下的配置文件（必须有访问权限）
     *      AnnotationConfigApplicationContext:它是用于读取注解创建容器的。
     * @param args
     */
    public static void main(String[] args) {
        //获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        IService service = (IService)ac.getBean("serviceImpl");
        service.saveUser();
    }
}
