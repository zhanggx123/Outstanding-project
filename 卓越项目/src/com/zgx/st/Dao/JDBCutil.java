package com.zgx.st.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCutil {

  static {
    try {
      Class.forName("com.mysql.jdbc.Driver");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
  public Connection getConnection(){

    Connection connection=null;
    try{
      connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
    }catch (Exception e){
      e.printStackTrace();
    }
    return connection;
  }
  public  void colseConnection(Connection connection, Statement statement, ResultSet resultSet){

    if(connection!=null){
      try{
        connection.close();
      }catch (Exception e){
        e.printStackTrace();
      }

    }
    if(statement!=null){
      try{
        statement.close();
      }catch (Exception e){
        e.printStackTrace();
      }
    }
    if(resultSet!=null){
      try{
        resultSet.close();
      }catch (Exception e){
        e.printStackTrace();
      }

    }

  }

}
