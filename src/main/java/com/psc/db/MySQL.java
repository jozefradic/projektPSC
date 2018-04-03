package com.psc.db;

import java.sql.*;


public class MySQL {

    private Connection conn;
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/tipos";
    private String username = "root";
    private String password = "";

    public String getPscByObec(String obec) throws Exception {

        Class.forName(driver).newInstance();
        conn = DriverManager.getConnection(url, this.username, this.password);

        String query = "SELECT Psc from postcodes where Obec like '" +obec+ "'";
        System.out.println(query);
        PreparedStatement ps = conn.prepareStatement(query);


        ResultSet rs = ps.executeQuery();

        String result = rs.getString("obec");

        return result;
    }

    public String getObecByPsc(String psc) throws Exception {

        Class.forName(driver).newInstance();
        conn = DriverManager.getConnection(url, this.username, this.password);

        String query = "SELECT Psc from postcodes where Obec like '" +psc+ "'";
        System.out.println(query);
        PreparedStatement ps = conn.prepareStatement(query);


        ResultSet rs = ps.executeQuery();

        String result = rs.getString("psc");

        return result;
    }
}


