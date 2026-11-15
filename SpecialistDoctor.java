public class SpecialistDoctor extends MedicalPractitioner {
    private String hospitalAffiliation;

    public SpecialistDoctor(String name, String id, String specialty, String hospitalAffiliation) {
        super(name, id, specialty);
        this.hospitalAffiliation = hospitalAffiliation;
    }

    public String getHospitalAffiliation() {
        return hospitalAffiliation;
    }

    public void setHospitalAffiliation(String hospitalAffiliation) {
        this.hospitalAffiliation = hospitalAffiliation;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Specialist, Affiliated hospital: " + hospitalAffiliation);
    }
}
