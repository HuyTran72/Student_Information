import java.util.*;

public class Student {
    private int SID;
    private String Name;
    private int Year;
    private Map<String, Integer> Grades;
    private float GPA;

    public Student() {
    }
    
    public Student(int SID, String Name, int Year, Map<String, Integer> Grades) {
        this.SID = SID;
        this.Name = Name;
        this.Year = Year;
        this.Grades = Grades;
        CalculateGPA();
    }
    
    public int getSID() {
        return SID;
    }
    
    public void setSID(int SID) {
        this.SID = SID;
    }
    
    public String getName() {
        return Name;
    }
    
    public void setName(String Name) {
        this.Name = Name;
    }
    
    public int getYear() {
        return Year;
    }
    
    public void setYear(int Year) {
        this.Year = Year;
    }
    
    public Map<String, Integer> getGrades() {
        return Grades;
    }
    
    public void setGrades(Map<String, Integer> Grades) {
        this.Grades = Grades;
    }

    public float getGPA() {
        return GPA;
    }
    
    public void printInfo() {
        System.out.println("SID: " + SID);
        System.out.println("Name: " + Name);
        System.out.println("Year: " + Year);
        System.out.println("GPA: " + GPA);
    }

    public void CalculateGPA() {
        int sum = 0;
        for (Map.Entry<String, Integer> entry : Grades.entrySet()) {
            sum = sum + entry.getValue();
        }
        GPA = sum / Grades.size();
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setSID(1111);
        s1.setName("Student_1");
        s1.setYear(3);

        Map<String, Integer> Grades_s1 = new HashMap<>();
        Grades_s1.put("Math", 100);
        Grades_s1.put("Physics", 94);
        Grades_s1.put("Chemistry", 92);
        s1.setGrades(Grades_s1);
        s1.CalculateGPA();
        s1.printInfo();

        System.out.println();

        Map<String, Integer> Grades_s2 = new HashMap<>();
        Grades_s2.put("Math", 96);
        Grades_s2.put("Physics", 75);
        Grades_s2.put("Chemistry", 100);
        Student s2 = new Student(2222, "Student_2", 4, Grades_s2);
        s2.printInfo();
    }
}

