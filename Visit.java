import java.util.Date;

public class Visit {

    //static variable
    public static int visitCount = 0;

    //instance variables
    private String visitId;
    private Date date;
    private double temperature; //อุณหภูมิ
    private String bloodPressure; //ความดัน
    private String status; //สถานะ

    // Constructor 1
    public Visit() {
        visitCount++;
    }

    // Constructor 2 parameter
    public Visit(String visitId, Date date, double tpt,
                 String bp, String status) {
        this.visitId = visitId;
        this.date = date;
        this.temperature = tpt;
        this.bloodPressure = bp;
        this.status = status;
        visitCount++;
    }

    //getters / setters
    public String getVisitId() {
        return visitId;
    }
    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public double getTemperature() {
        return temperature;
    }
    public void setTemperature(double tpt) {
        this.temperature = tpt;
    }
    public String getBloodPressure() {
        return bloodPressure;
    }
    public void setBloodPressure(String bp) {
        this.bloodPressure = bp;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    //method
    public void updateStatus(String newstatus) {
        this.status = newstatus;
    }
    //โชว์ข้อมูล
    public void showVisitInfo() {
    System.out.println("Visit ID: " + visitId);
    System.out.println("Date: " + date);
    System.out.println("Temperature: " + temperature);
    System.out.println("Blood Pressure: " + bloodPressure);
    System.out.println("Status: " + status);
}

}

