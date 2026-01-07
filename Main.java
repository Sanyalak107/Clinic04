import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // สร้าง object
        Student s1 = new Student();
        Student s2 = new Student("66001", "Boom", "Engineering", "None");

        // ใช้ setter กำหนดตัวแปร
        s1.setSID("66000");
        s1.setName("Kuy");
        s1.setFaculty("Science");
        s1.setcd("Asthma");

        // ใช้ method
        s1.viewMedicalHistory();
        System.out.println();
        s2.viewMedicalHistory();

        // ใช้ static variable
        System.out.println("\nTotal students: " + Student.studentCount);
        System.out.println("----------------------------");
        ////////////////////////////////
        ClinicStaff c1 = new ClinicStaff();
        ClinicStaff c2 = new ClinicStaff("ST01", "Smalldick");

        // ใช้ setter
        c1.setStaffId("ST00");
        c1.setName("bigdick");
        // เรียก method
        c1.registerVisit("66000");
        c1.callQueue();

        System.out.println();

        c2.registerVisit("66001");
        c2.callQueue();

        // ใช้ static variable
        System.out.println("\nTotal staff: " + ClinicStaff.staffCount);
        System.out.println("----------------------------");
        ////////////////////////////////////

        //Constructorเปล่า
        Visit v1 = new Visit();
        v1.setVisitId("V001");
        v1.setDate(new Date());
        v1.setTemperature(36.8);
        v1.setBloodPressure("120/80");
        v1.setStatus("Normal");

        //Constructorใส่ค่า
        Visit v2 = new Visit(
                "V002",
                new Date(), //วันที่
                38.2, //อุณหภูมิ
                "140/90", //ความดันเลือด
                "Fever" //สถานะคนไข้
        );
        //ค่าสถาใหม่แทนสถานะเดิมของobject updateStatus
        v2.updateStatus("Under Treatment");//อยู่ระหว่างระษา

        v1.showVisitInfo();
        System.out.println();
        v2.showVisitInfo();
        System.out.println();
        System.out.println("Visit count: " + Visit.visitCount);
        System.out.println("----------------------------");
    }
}
