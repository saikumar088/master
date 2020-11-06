package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class jdbcconnection {


	public static void main(String[] args) throws SQLException {
		
		
		//DriverManager.getConnection(url,"user","password");
		//connection url
		//"jdbc:mysql://"+host+":"+port+"/databasename";
		String host="localhost";
		 String  port = "3306";
		
		// step1
		Connection mySql= DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/Employeeportal","root","root");
		
	//step 2
		Statement s=mySql.createStatement();
		
		//step 3
		ResultSet results= s.executeQuery("select count(1) as cnt  from employeeinfo where age>=30");
		
//step 4 
		while (results.next())
			
		{
			
			
			//System.out.println(results.getString("name"));
			
			results.getInt("cnt");
		}
		
		
		
	//step 5
		
		//mySql.close();
		
		
//*******************************aggregated values fetch		
		
	/*	
		import java.sql.*;
		class Get 
		{
		    public static void main(String[] args) throws Exception
		    {
		        Class.forName("com.mysql.jdbc.Driver");
		           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		           Statement st=con.createStatement();
		           ResultSet rs=st.executeQuery("Select Max(id) from items");
		            int id=0;
		               if(rs.next()){
		                    id=rs.getInt("Max(id)");

		               }
		               System.out.println(id);
		               ResultSet rs1=st.executeQuery("Select * from items where id="+id+"");
		                   while(rs1.next()){
		                       System.out.println(rs1.getString(1)+" "+rs1.getString(2)+" "+rs1.getString(3)+" "+rs1.getString(4));
		                   }
		    }
		}
		
		
		*/
		
		
		

	}

}


