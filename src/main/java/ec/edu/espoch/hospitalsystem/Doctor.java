
package ec.edu.espoch.hospitalsystem;

public class Doctor {
    //atributos 
    public Boolean doctorAvailable;
    
    //métodos
    public void assignTreatment(Patient patient ){
        System.out.println("Treatment assigned");
    }
    public void reviewTestResult(){
        System.out.println("Reviewing test result");
    }
    public void updatediagnosis(){
        System.out.println("Diagnosis updated");
    }
    public void requestLaboratoryTest(Patient patient ){
        System.out.println("Laboratory test requested");
    }
}
