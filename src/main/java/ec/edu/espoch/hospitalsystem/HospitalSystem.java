package ec.edu.espoch.hospitalsystem;
import java.util.Scanner;
public class HospitalSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Patient patient = new Patient();
        patient.personalData = "Maria Sanchez";
        patient.medicalRecord = "Penicilina";
        patient.healthStatus= "Stable";

        Doctor doctor = new Doctor();
        doctor.doctorAvailable = true;

        Receptionist receptionist = new Receptionist();
        Laboratory lab = new Laboratory();
        lab.equipmentAvailable = true;

        Pharmacy pharmacy = new Pharmacy();
        pharmacy.medicineInStock = true;

        Administrator admin = new Administrator();

        int option;

        do {
            System.out.println("--- MENU ---");
            System.out.println("1. Register Patient");
            System.out.println("2. Assign Appointment");
            System.out.println("3. Request Test");
            System.out.println("4. Process Test");
            System.out.println("5. Deliver Medicine");
            System.out.println("6. Generate Report");
            System.out.println("7. Exit");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    receptionist.registerPatient(patient);
                    break;
                case 2:
                    receptionist.assignAppointment(patient, doctor);
                    break;
                case 3:
                    doctor.requestLaboratoryTest(patient);
                    break;
                case 4:
                    lab.processTest();
                    lab.uploadResult();
                    break;
                case 5:
                    pharmacy.deliverMedicine();
                    pharmacy.updateQuantity();
                    break;
                case 6:
                    admin.generateReport(patient);
                    
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while (option != 0);
        sc.close();
    }
}
