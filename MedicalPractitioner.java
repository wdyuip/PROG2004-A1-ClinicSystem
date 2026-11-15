public class MedicalPractitioner {
    private String name;
    private String id;
    private String specialty;

    public MedicalPractitioner(String name, String id, String specialty) {
        this.name = name;
        this.id = id;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void showInfo() {
        System.out.println("医生姓名：" + name + "，编号：" + id + "，方向：" + specialty);
    }
}
