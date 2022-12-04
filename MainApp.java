public class MainApp {
    //Main CLass
    public static void main(String[] args) {        

        Perangkat perangkat = new Perangkat(null, 3, 2.40);
        perangkat.informasi();
        
        System.out.println("======================================================================================");
        
        Laptop lap = new Laptop("Geasate", 8, 2.40, true);
        //object lap dari class Laptop
        lap.informasi();
        lap.bukaGame("GENSHIN IMPACT");
        lap.KirimEmail("raihanIPKlebihDARI4amin@yahoo.com");
        lap.KirimEmail("Manusia@gmail.com", "ManusiaTapiBedaOrang@gmail.com");
        
        System.out.println("======================================================================================");
        
        Handphone phone = new Handphone("Dansisk", 3, 2.20, false);
        //object phone dari class Handphone
        phone.informasi();
        phone.telepon(62010101);
        phone.kirimSMS(62101010);
        phone.kirimSMS(62010101, 62101010);
    }
}
