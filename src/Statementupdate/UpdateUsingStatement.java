package Statementupdate;
import java.sql.*;

public class UpdateUsingStatement
{
    private static final String url="jdbc:mysql://localhost:3306/data";
    private static final String user="root";
    private static final String pswd="Chinna@777";

    public static void main(String arggs[])
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
            Connection con= DriverManager.getConnection(url,user,pswd);

            Statement st=con.createStatement();

            String query=String.format("update Simple set names='%s' where id=%d","Yerramsetti",2);

            int res=st.executeUpdate(query);

            if(res>0)
            {
                System.out.println("updated successfully");
            }
            else
            {
                System.out.println("not updated ");
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
