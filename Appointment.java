public class Appointment {
    private Patient patient;
    private MedicalPractitioner doctor;
    private String date;
    private String time;

    public Appointment(Patient patient, MedicalPractitioner doctor, String date, String time) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public MedicalPractitioner getDoctor() {
        return doctor;
    }

    public void setDoctor(MedicalPractitioner doctor) {
        this.doctor = doctor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void showAppointmentDetails() {
        System.out.println("Appointment Date: " + date + " Time: " + time);
        patient.showPatientInfo();
        doctor.showInfo();
    }
}
