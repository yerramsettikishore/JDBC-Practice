import java.sql.*;
public class Main
{
    private static final String url="jdbc:mysql://localhost:3306/data";

    private static final String user="root";

    private static final String pswd="Chinna@777";
    public static void main(String ag[])
    {
        try
        {
            // Load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }


        // create connection
        try
        {
            Connection con=DriverManager.getConnection(url,user,pswd);

            // create Statement

            Statement st=con.createStatement();

            // write a query



            ResultSet result=st.executeQuery("select * from Simple");

            while(result.next())
            {
                int id=result.getInt("id");
                String names=result.getString("names");
                int age=result.getInt("age");
                double marks=result.getDouble("marks");

                System.out.println("Id : "+id);
                System.out.println("Name : "+names);
                System.out.println("Age : "+age);
                System.out.println("Marks : "+marks);

            }



        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }

    }
}