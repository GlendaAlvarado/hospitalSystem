package ec.edu.espoch.hospitalsystem;

public class Administrator {
    public void generateReport(Patient patient){
        System.out.println("Report generated");
        patient.showReport();
    }
}
