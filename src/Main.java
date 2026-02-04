import java.sql.*;

public class Main{

    private static final String url="jdbc:mysql://localhost:3306/data";
    private static final String user="root";
    private static final String psd="Chinna@777";

    public static void main(String args[])
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            Connection con = DriverManager.getConnection(url, user, psd);

            Statement st=con.createStatement();

            String query="select * from Simple";

            ResultSet result=st.executeQuery(query);

            while(result.next())
            {
                int id =result.getInt("id");
                String names=result.getString("names");
                int age=result.getInt("age");
                double marks=result.getDouble("marks");

                System.out.println(id);
                System.out.println(names);
                System.out.println(age);
                System.out.println(marks);


            }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }

 }