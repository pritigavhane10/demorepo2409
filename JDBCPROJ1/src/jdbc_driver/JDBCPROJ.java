package jdbc_driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCPROJ {
	 static final String QUERY = "SELECT * FROM course";
	public static void main(String[] args) {
		PreparedStatement p = null;
        ResultSet rs = null;
       

		try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/courseid", "root", "admin");
                         
            String sql = "delete from course where name = 'mrunal'";
            		
            p = conn.prepareStatement(sql);
            rs = p.executeQuery(QUERY);
 
           System.out.println("name\tinstruct\tduration\tfees");
 
            // Condition check
            while (rs.next()) {
 
                String name = rs.getString("name");
                String insturct = rs.getString("instructor");
                int duration = rs.getInt("duration");
                int fees = rs.getInt("fees");
                System.out.println(name + "\t\t" + insturct + "\t\t" + duration + "\t\t" + fees);
            }
                         
            conn.close(); 
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
	}

}