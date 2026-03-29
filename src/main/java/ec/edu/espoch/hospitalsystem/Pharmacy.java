package ec.edu.espoch.hospitalsystem;

public class Pharmacy {
    //atributos
    public boolean medicineInStock;
    
    //metodos
    public void deliverMedicine(){
        if (medicineInStock) {
            System.out.println("Medicine delivered");
        } else {
            System.out.println("Medicine not in stock");
        }
    }
    public void updateQuantity(){
        System.out.println("Quantity updated");
    }
}
