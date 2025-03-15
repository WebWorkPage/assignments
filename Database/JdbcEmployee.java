import java.sql.*; //connectiom, statement, resultset classes from java.sql package/folder

public class JdbcEmployee {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/formdb";
		String username="root";
		String password="Hello@99";
		
		try {
			Connection con = DriverManager.getConnection(url, username, password);
			Statement st = con.createStatement();
			String sqlInsert = "insert into data_employee values (101, 'Jenny', 25, 10000),"
					+ "(102, 'Jacky', 30, 20000),"
					+ "(103, 'Joe', 20, 40000),"
					+ "(104, 'John', 40, 80000),"
					+ "(105, 'Shammer', 25, 90000)";
			int count = st.executeUpdate(sqlInsert);
			System.out.println(count + "records added");
			
			ResultSet rs = st.executeQuery("select * from data_employee");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+ " "+rs.getString(2)+" " +rs.getInt(3)+" "+rs.getInt(4));
			}
		}
	    catch(SQLException e) {
	    	e.printStackTrace();
	    }
	}

}

//install Jdbc driver to run java database prg/make connection between ur java prgm and mysql. The mysql Jdbc driver is called mysql connector present in mysql site
//make connection obj to connect java prgm to database 
//write query using createStatement()
//to insert, update, delete query- use executeUpdate() from statement class - returns int datatype
//to select - use executeQuery() -> returns data in table format -> stored in ResultSet to access data from table 
//To print data from table - use getString() / getInt() from ResultSet obj 
// The cursor will be initially before the first row, to move the cursor to next row forward use -> next() of ResultSet obj
//next() - return type boolean - returns false if no row present further