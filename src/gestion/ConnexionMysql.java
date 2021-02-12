package gestion;

import java.sql.*;
import javax.swing.*;

public class ConnexionMysql {
	Connection cnx =null ;
	public static Connection ConnexionDB() {
		try {
		    Class.forName("com.mysql.jdbc.Driver");
		    Connection cnx = DriverManager.getConnection("jdbc:mysql://localhost/gbiblio", "root", "");
		    return cnx;
		    }catch(Exception e )
		    {
		            JOptionPane.showMessageDialog(null, e);	
		            return null;
		            
		}
	}
	

}
