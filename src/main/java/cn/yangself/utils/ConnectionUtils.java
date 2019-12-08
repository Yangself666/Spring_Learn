package cn.yangself.utils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionUtils {
    private ThreadLocal<Connection> tl =new ThreadLocal<Connection>();

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * 获取当前线程上的连接
     * @return
     */
    public Connection getThreadConnection(){
        //1.先从threadLocal上获取
        Connection conn = tl.get();
        //2.判断当前线程上是否有连接
        if(conn == null){
            //3.从数据源中获取一个连接，并且存入ThreadLocal中
            try {
                conn = dataSource.getConnection();
                //4.把Connection存入ThreadLocal中
                tl.set(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }
}
