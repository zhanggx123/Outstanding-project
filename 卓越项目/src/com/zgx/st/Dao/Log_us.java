package com.zgx.st.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Log_us {

    public static boolean checked(String user,String password){
        JDBCutil jd=new JDBCutil();
        Connection con = jd.getConnection();
        String sql="select password from us where user=? ";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,user);
            ResultSet res = pst.executeQuery();
            while(res.next()){
                String str=res.getString("password");
                if(str.equals(password))
                    return  true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return false;
    }

}
