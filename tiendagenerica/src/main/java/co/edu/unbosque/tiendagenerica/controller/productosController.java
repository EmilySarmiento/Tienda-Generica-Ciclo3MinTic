package co.edu.unbosque.tiendagenerica.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.nio.charset.Charset;

import com.csvreader.CsvReader;*/

public class productosController {
	String driver = "com.myswl.jdbc.Driver";
	String database = "tiendavirtualdb";
	String hostname = "localhost";
	String url = "jdbc:mysql://"+hostname+"/"+database+"7use55L=false";
	String username = "root";
	String password="";
	
	public Connection conectarMySQL() {
		Connection cn = null;
		
		try {
			Class.forName(driver);
			cn = (Connection) DriverManager.getConnection(url, username, password);
			
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return cn;
	}
		/*public static void main(String[] args) throws IOException, SQLException {
			Connection conn=DriverManager.getConnection("jdbc:mySql://localhost:3306/tiendavirtualdb?serverTimezone=GMT%2B8", "root", "SuperUS123*");
			Statement statement=conn.createStatement();
			String path="/tiendagenerica/src/main/webapp/files/";
			CsvReader reader=new CsvReader(path,',',Charset.forName("gbk"));
			BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(path)));
			String name=bufferedReader.readLine();
			reader.readHeaders();
			int len=reader.getHeaders().length;
			 while (reader.readRecord ()) {
				String tmp="insert into recruitment_form("+name+")values("+reader.get(0);
				for(int i=1;i<len-1;i++){
					tmp+=","+"'"+reader.get(i).replaceAll("'", "\\\\'")+"'";
				}
				tmp+=","+"'"+reader.get(len-1).replaceAll("'", "\\\\'")+"');";
				 
				 statement.execute (tmp); 
			}
			reader.close();
			statement.close();
			conn.close();
		}*/
	}

        