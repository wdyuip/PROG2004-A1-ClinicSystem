public class GP extends MedicalPractitioner {
    private String homeVisitArea;

    public GP(String name, String id, String specialty, String homeVisitArea) {
        super(name, id, specialty);
        this.homeVisitArea = homeVisitArea;
    }

    public String getHomeVisitArea() {
        return homeVisitArea;
    }

    public void setHomeVisitArea(String homeVisitArea) {
        this.homeVisitArea = homeVisitArea;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("GP, Home visit area: " + homeVisitArea);
    }
}
