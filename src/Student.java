public class Student {

    private int id;
    private String name;
    private int age;
    private String course;

    public Student() {}

    public Student(String name,int age,String course){

        this.name=name;
        this.age=age;
        this.course=course;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

}
