package com.itheima.jdbc;

import sun.security.util.Password;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author Rosalyn
 * @create 2020-03-03 16:47
 */
public class JdbcDemo1 {
    public static void main(String[] args) throws Exception{
        //1.注册驱动
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        //2.获取连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eesy","root", "0211");
        //3.获取操作的预处理对象
        PreparedStatement pstm = conn.prepareStatement("select * from account");
        //4.执行SQL，得到结果集
        ResultSet rs = pstm.executeQuery();
        //5.遍历结果集
        while (rs.next()){
            System.out.println(rs.getString("name"));
        }
        //6.释放资源
        rs.close();
        pstm.close();
        conn.close();

    }
}
