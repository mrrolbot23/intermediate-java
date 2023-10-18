package Week1Practice;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
        name = "noname";
        age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class PartTimeStudent extends Student{
    private int creditHour;


    public PartTimeStudent(String name, int age, int creditHour) {
        super(name, age);
        this.creditHour = creditHour;
    }

    public PartTimeStudent() {
        creditHour = 0;

    }


    public int getCreditHour() {
        return creditHour;
    }

    @Override
    public String toString() {
        return super.toString() + ", creditHours=" + creditHour;
    }

    public void setCreditHour(int creditHour) {
        this.creditHour = creditHour;
    }
}

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Edwin", 32);

        PartTimeStudent partTimeStudent = new PartTimeStudent("Jose", 45, 12);

        System.out.println(student.getName());

        System.out.println("Part-time student credit hours: " + partTimeStudent.getCreditHour());

        PartTimeStudent partTimeStudent1 = new PartTimeStudent();

        System.out.println("Part-time with default constructor: " + partTimeStudent1);

    }
}
