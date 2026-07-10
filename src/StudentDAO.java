import java.sql.*;

public class StudentDAO {

    Connection con=DBConnection.getConnection();

    public void addStudent(Student s){

        try{

            String sql="INSERT INTO students(name,age,course) VALUES(?,?,?)";

            PreparedStatement ps=con.prepareStatement(sql);

            ps.setString(1,s.getName());
            ps.setInt(2,s.getAge());
            ps.setString(3,s.getCourse());

            ps.executeUpdate();

            System.out.println("Student Added Successfully");

        }

        catch(Exception e){

            e.printStackTrace();

        }

    }

    public void viewStudents(){

        try{

            String sql="SELECT * FROM students";

            Statement st=con.createStatement();

            ResultSet rs=st.executeQuery(sql);

            while(rs.next()){

                System.out.println(

                rs.getInt("id")+" "

                +rs.getString("name")+" "

                +rs.getInt("age")+" "

                +rs.getString("course")

                );

            }

        }

        catch(Exception e){

            e.printStackTrace();

        }

    }

    public void updateStudent(int id,String course){

        try{

            String sql="UPDATE students SET course=? WHERE id=?";

            PreparedStatement ps=con.prepareStatement(sql);

            ps.setString(1,course);

            ps.setInt(2,id);

            ps.executeUpdate();

            System.out.println("Updated");

        }

        catch(Exception e){

            e.printStackTrace();

        }

    }

    public void deleteStudent(int id){

        try{

            String sql="DELETE FROM students WHERE id=?";

            PreparedStatement ps=con.prepareStatement(sql);

            ps.setInt(1,id);

            ps.executeUpdate();

            System.out.println("Deleted");

        }

        catch(Exception e){

            e.printStackTrace();

        }

    }

}
