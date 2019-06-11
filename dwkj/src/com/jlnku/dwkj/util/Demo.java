package com.jlnku.dwkj.util;

import java.sql.Connection;
import java.sql.SQLException;

public class Demo {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = DbcpUtil.getConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {

        System.out.println(conn);
        }

    }
}
