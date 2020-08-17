package com.leaves;

import java.sql.*;

public class cx {
    public static void main(String[] args) {
        try {

            DriverManager.registerDriver(new org.postgresql.Driver());

            String url = "jdbc:postgresql://localhost:5432/lb";

            String user = "leaves";

            String password = "123456";

            Connection conn = DriverManager.getConnection(url, user, password);

            Statement statement = conn.createStatement();

            String sql = "select * from lbuser";

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                System.out.println(resultSet.next()+"*****");

                /*System.out.println(resultSet.getString("id"));

                System.out.println(resultSet.getString("username"));*/

            }

        } catch (SQLException e1) {

            e1.printStackTrace();

        }
    }
}
