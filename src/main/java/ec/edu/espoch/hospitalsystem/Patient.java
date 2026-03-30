package ec.edu.espoch.hospitalsystem;

public class Patient {
    //atributos 
 public String personalData; 
 public String medicalRecord;
 public String allergies;
 public String healthStatus;
 //métodos
 public Boolean checkAllergy( ){
     return !medicalRecord.isEmpty();
 }
 public void showReport(){
     System.out.println("Patient Report:");
     System.out.println("Name: " + personalData);
     System.out.println("Health Status: " + healthStatus);
       if (checkAllergy()) {
          System.out.println("Allergies: " + medicalRecord);
        }else {
           System.out.println("Allergies: None");
        }
    }
}
