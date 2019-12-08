package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 *  该类是一个配置类，它的作用和xml一样
 *  spring中的新注解
 * @Configuration
 *      作用：指定当前类是一个配置累
 *      细节：当配置类作为AnnotationConfigApplicationContext对象创建的参数时，该注解可以不写
 *
 * @ComponentScan
 *      作用：用于通过注解指定spring在创建容器时要扫描的包
 *      属性：value：他和basePackages的作用时一样的，都是用于指定创建容器时要扫描的包
 * @Bean
 *      作用：用于把当前方法的返回值作为bean对象存入spring的ioc容器中
 *      属性：
 *          name：用于指定bean的id。默认值是当前方法的名称。
 *      细节：当我们使用注解配置方法时，如果方法有参数，spring框架回去容器中查找有没有可用的bean对象
 *      查找的方式和@Autowired注解的作用是一样的。
 * @Import
 *      作用：用于导入其他的配置类
 *      属性：
 *          value：用于指定其他配置类的字节码
 *                  当我们使用Import的注解之后，有Import注解的类就是父配置类，而导入的都是子配置类
 */
//@Configuration
@ComponentScan("cn.yangself")
@Import(JdbcConfig.class)
public class SpringConfiguration {

}
