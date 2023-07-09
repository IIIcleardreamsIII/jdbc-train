package com.JDBCTRY;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTRY {
    public static void main (String[] args) throws ClassNotFoundException, SQLException {
        //1.加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.连接信息url,用户信息
        String url = "jdbc:mysql://localhost:3306/student";
        String username = "root";
        String password = "666";
        //3.连接,获得数据库对象connection
        Connection connection = DriverManager.getConnection(url, username, password);
        //4.获取执行sql的对象
        Statement statement = connection.createStatement();
//        //5.执行sql
//        String sql = "select * from student where student_sex = '男'";
//        ResultSet resultSet = statement.executeQuery(sql);
//        while (resultSet.next ()){
//            System.out.println ( resultSet.getInt ("student_id")+"\t"+resultSet.getString ("student_name")+ "\t" +resultSet.getString ("student_class"));
//        }
//
//        Statement statement = connection.createStatement ();
//        String sql = "insert into student(name,id) values('杨骜捷','2021404187')";
//        int num = statement.executeUpdate (sql);
//        if(num>0) {
//            System.out.println ("成功");
//        }
//        String sql2 = "select * from student";
//        ResultSet resultSet = statement.executeQuery(sql2);
//        while (resultSet.next ()){
//            System.out.println (resultSet.getInt ("id")+"\t"+resultSet.getString ("name"));
//        }
        String sql3 = "drop table student.student";
        int i = statement.executeUpdate (sql3);
        if (i>0){
            System.out.println ("true");
        }



    }
}
