import java.util.ArrayList;

public class Clinic {
    private String clinicName;
    private ArrayList<MedicalPractitioner> doctorList;
    private ArrayList<Appointment> appointmentList;

    public Clinic(String clinicName) {
        this.clinicName = clinicName;
        doctorList = new ArrayList<>();
        appointmentList = new ArrayList<>();
    }

    public void addDoctor(MedicalPractitioner doctor) {
        doctorList.add(doctor);
    }

    public void addAppointment(Appointment appointment) {
        appointmentList.add(appointment);
    }

    public void showAllDoctors() {
        System.out.println("\n=== Doctors at " + clinicName + " ===");
        for(MedicalPractitioner d : doctorList) {
            d.showInfo();
        }
    }

    public void showAllAppointments() {
        System.out.println("\n=== All Appointments ===");
        if(appointmentList.isEmpty()){
            System.out.println("No appointments found.");
            return;
        }
        for(Appointment a : appointmentList) {
            a.showAppointmentDetails();
        }
    }

    public void searchAppointmentByPatientId(String patientId){
        boolean found = false;
        for(Appointment a : appointmentList){
            if(a.getPatient().getPatientId().equals(patientId)){
                System.out.println("\nFound appointment:");
                a.showAppointmentDetails();
                found = true;
            }
        }
        if(!found){
            System.out.println("No appointment matches this patient ID.");
        }
    }

    public void deleteAppointmentByPatientId(String patientId){
        boolean removed = false;
        for(int i = 0; i < appointmentList.size(); i++){
            Appointment a = appointmentList.get(i);
            if(a.getPatient().getPatientId().equals(patientId)){
                appointmentList.remove(i);
                removed = true;
                System.out.println("Appointment deleted.");
                break;
            }
        }
        if(!removed){
            System.out.println("Cannot find appointment with this patient ID.");
        }
    }
}
