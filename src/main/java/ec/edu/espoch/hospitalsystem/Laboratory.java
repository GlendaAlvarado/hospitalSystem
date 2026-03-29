package ec.edu.espoch.hospitalsystem;

public class Laboratory {
    //atributos
    public boolean equipmentAvailable;
    //metodos
    public void processTest(){
        if (equipmentAvailable) {
            System.out.println("Test processed");
        } else {
            System.out.println("Equipment not available");
        }
    }
    public void uploadResult(){
       System.out.println("Result uploaded");
    }
}
