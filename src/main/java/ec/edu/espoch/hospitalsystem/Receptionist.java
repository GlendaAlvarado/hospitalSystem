
package ec.edu.espoch.hospitalsystem;

public class Receptionist {
    //métodos
    public void registerPatient(Patient patient ){
        System.out.println("Patient registered: "+patient.personalData);
    }
    public void assignAppointment(Patient patient , Doctor doctor  ){
        if (doctor.doctorAvailable) {
            System.out.println("Appointment assigned");
        } else {
            System.out.println("Doctor not available");
        }
    }
}
