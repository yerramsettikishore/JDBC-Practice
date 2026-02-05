package statement;
import java.sql.*;
public class InsertUsingStatement
{
    private static final String url="jdbc:mysql://localhost:3306/data";
    private static final String user="root";
    private static final String pswd="Chinna@777";

    public static void main(String args[])
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            Connection con=DriverManager.getConnection(url,user,pswd);

            Statement st=con.createStatement();

            String query=String.format("insert into Simple(id,names,age,marks) values(%d,'%s',%d,%f)",4,"Nani",23,55.6);

            int result=st.executeUpdate(query);

            if(result>0)
            {
                System.out.println("Successfully inserted");
            }
            else
            {
                System.out.println("Not inserted");
            }
            st.close();
            con.close();

        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
