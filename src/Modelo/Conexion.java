package Modelo;

import java.sql.*;

public class Conexion {

    public Connection con;
    public static final String URL = "jdbc:mysql://localhost:3306/fabrica";
    public static final String USER = "root";
    public static final String CLAVE = "";

    public static Connection getConexion() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, CLAVE);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }

    public static ResultSet getTabla(String consulta) {
        Connection con = getConexion();
        Statement st;
        ResultSet datos = null;
        try {
            st = con.createStatement();
            datos = st.executeQuery(consulta);
        } catch (SQLException e) {
            System.out.print(e.toString());
        }
        return datos;
    }

    /**
     * @return the con
     */
    public Connection getCon() {
        return con;
    }

    /**
     * @param con the con to set
     */
    public void setCon(Connection con) {
        this.con = con;
    }

}
