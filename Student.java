public class Student {

    // attributes (private instance)
    private String SID;
    private String name;
    private String faculty; //คณะ
    private String congenitalDisease; //โรคประจำ

    // public static variable
    public static int studentCount = 0;

    // constructor เปล่า
    public Student() {
        studentCount++;
    }

    // constructor รับค่า
    public Student(String SID, String name,String faculty, String cd) {
        this.SID = SID;
        this.name = name;
        this.faculty = faculty;
        this.congenitalDisease = cd;
        studentCount++;
    }

    // getter / setter
    public String getSID() { return SID; }
    public void setSID(String SID) { this.SID = SID; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getFaculty() { return faculty; }
    public void setFaculty(String faculty) { this.faculty = faculty; }

    public String getcd() { return congenitalDisease; }
    public void setcd(String cd) {
        this.congenitalDisease = cd;
    }

    // methods
    public void requestService() {
        System.out.println(name + " is requesting service.");
    }

    public void viewMedicalHistory() {
        System.out.println("ID: " + SID);
        System.out.println("Name: " + name);
        System.out.println("Faculty: " + faculty);
        System.out.println("Disease: " + congenitalDisease);
    }
}
