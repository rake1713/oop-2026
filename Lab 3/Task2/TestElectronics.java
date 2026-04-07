public class TestElectronics {
    public static void main(String[] args) {
        Flashlight light = new Flashlight();
        light.charge();

        Smartphone phone = new Smartphone();
        phone.charge();      
        phone.transferData(); 

        Chargeable device = phone; 
        device.charge(); 
        //device.transferData(); 
    }
}