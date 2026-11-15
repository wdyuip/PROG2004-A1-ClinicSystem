import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Clinic myClinic = new Clinic("City Health Clinic");

        GP drBrown = new GP("Dr.Brown", "GP001", "General Practice", "North District");
        SpecialistDoctor drLee = new SpecialistDoctor("Dr.Lee", "SP001", "Cardiology", "Central Hospital");
        myClinic.addDoctor(drBrown);
        myClinic.addDoctor(drLee);

        int option = 0; // 给初始值，修复这个报错
        do {
            System.out.println("\n===== Clinic Menu =====");
            System.out.println("1. View all doctors");
            System.out.println("2. View all appointments");
            System.out.println("3. Create new appointment");
            System.out.println("4. Search appointment by patient ID");
            System.out.println("5. Delete appointment by patient ID");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.nextLine();
                continue;
            }
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    myClinic.showAllDoctors();
                    break;
                case 2:
                    myClinic.showAllAppointments();
                    break;
                case 3:
                    System.out.println("\n--- Create New Appointment ---");

                    String pName;
                    do {
                        System.out.print("Enter patient name: ");
                        pName = scanner.nextLine().trim();
                    } while (pName.isEmpty());

                    String pId;
                    do {
                        System.out.print("Enter patient ID: ");
                        pId = scanner.nextLine().trim();
                    } while (pId.isEmpty());

                    String pPhone;
                    do {
                        System.out.print("Enter patient phone: ");
                        pPhone = scanner.nextLine().trim();
                    } while (pPhone.isEmpty());
                    Patient newPatient = new Patient(pName, pId, pPhone);

                    System.out.println("\nSelect Doctor:");
                    System.out.println("1. Dr.Brown (GP001, GP)");
                    System.out.println("2. Dr.Lee (SP001, Specialist)");
                    System.out.print("Enter doctor number: ");
                    int docChoice = scanner.nextInt();
                    scanner.nextLine();

                    MedicalPractitioner selectedDoc;
                    if(docChoice == 1){
                        selectedDoc = drBrown;
                    }else{
                        selectedDoc = drLee;
                    }

                    String appDate;
                    do {
                        System.out.print("Enter appointment date: ");
                        appDate = scanner.nextLine().trim();
                    } while (appDate.isEmpty());

                    String appTime;
                    do {
                        System.out.print("Enter appointment time: ");
                        appTime = scanner.nextLine().trim();
                    } while (appTime.isEmpty());

                    Appointment newApp = new Appointment(newPatient, selectedDoc, appDate, appTime);
                    myClinic.addAppointment(newApp);
                    System.out.println("Appointment created successfully!");
                    break;

                case 4:
                    System.out.print("\nEnter patient ID to search: ");
                    String searchId = scanner.nextLine().trim();
                    myClinic.searchAppointmentByPatientId(searchId);
                    break;

                case 5:
                    System.out.print("\nEnter patient ID to delete appointment: ");
                    String delId = scanner.nextLine().trim();
                    myClinic.deleteAppointmentByPatientId(delId);
                    break;

                case 0:
                    System.out.println("Program exiting...");
                    break;

                default:
                    System.out.println("Invalid option, please select again.");
            }
        } while (option != 0);

        scanner.close();
    }
}
