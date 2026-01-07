class ClinicStaff {

    // private instance variables (attributes)
    private String staffId;
    private String name;

    // public static variable
    public static int staffCount = 0;

    // constructor ที่ 1 (default)
    public ClinicStaff() {
        this.staffId = "";
        this.name = "";
        staffCount++;
    }

    // constructor ที่ 2 (รับค่า)
    public ClinicStaff(String staffId, String name) {
        this.staffId = staffId;
        this.name = name;
        staffCount++;
    }

    // ===== Getter / Setter =====
    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // ===== Methods ตาม UML =====
    public void registerVisit(String studentId) { //ลงทะเบียนตรวจ
        System.out.println("Staff " + name + " " + staffId +
                " registered visit for student ID: " + studentId);
    }

    public void callQueue() { //เรียกคิว
        System.out.println("Staff " + name + " " + staffId + " is calling the next queue.");
    }
}
