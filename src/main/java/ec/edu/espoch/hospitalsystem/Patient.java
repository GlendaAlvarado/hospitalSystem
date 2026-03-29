package ec.edu.espoch.hospitalsystem;

public class Patient {
    //atributos 
 public String personalData; 
 public String medicalRecord;
 public String allergies;
 public String healthStatus;
 //métodos
 public Boolean checkAllergy(String medicine  ){
     return medicalRecord.contains(medicine);
 }
}
