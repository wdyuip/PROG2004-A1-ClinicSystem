public class Patient {
    private String patientName;
    private String patientId;
    private String phone;

    public Patient(String patientName, String patientId, String phone) {
        this.patientName = patientName;
        this.patientId = patientId;
        this.phone = phone;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void showPatientInfo() {
        System.out.println("患者：" + patientName + "，患者ID：" + patientId + "，联系电话：" + phone);
    }
}
