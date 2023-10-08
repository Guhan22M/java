class Student{
    String name;
    int roll_no;
    int total;

    void avg(){
        int avg;
        System.out.println("Student name is "+name);
        System.out.println("Student roll number is "+roll_no);
        System.out.println("Stydent total is "+total);
        avg=total/6;
        System.out.println("Student average is "+avg);
    }
}
public class method_invoking{

    static void printline(){
        System.out.println("--------------------------");
    }
    public static void main(String args[]){
        Student student = new Student();
        student.name = "guhan";
        student.roll_no=44;
        student.total=532;
        student.avg();
        printline();
        Student stud1 = new Student();
        stud1.name="Virat";
        stud1.roll_no=18;
        stud1.total=550;
        stud1.avg();
        printline();
        Student stud2 = new Student();
        stud2.name="devilliers";
        stud2.roll_no=17;
        stud2.total=585;
        stud2.avg();
        printline();
    }
}