public class Handphone extends Perangkat {
    protected boolean fingerprint;
    
    public Handphone (String drive, int ram, double processor, boolean fingerprint) {
        super(drive, ram, processor);
    }

    @Override
    public void informasi() {
        if (fingerprint){
            System.out.println("Handphone ini memiliki drive " + drive + " dengan ram sebesar " + ram + " GB dan processor dengan kecepatan " + processor + " GHz. Hp ini memiliki fingerprint.\n");
        } 
        else {
            System.out.println("Handphone ini memiliki drive " + drive + " dengan ram sebesar " + ram + " GB dan processor dengan kecepatan " + processor + " GHz. Hp ini TIDAK memiliki fingerprint.\n");
        }
    }
    public void telepon(int no_hp) {
        System.out.println("Handphone berhasil menyambungkan telepon ke No "+ no_hp + ".");
    }
    public void kirimSMS(int no_hp) {
        System.out.println("Handphone berhasil mengirimkan SMS ke No " + no_hp + ".");
    }
    public void kirimSMS(int no_hp1, int no_hp2) {
        System.out.println("Handphone berhasil mengirimkan SMS dari No " + no_hp1 + "ke No " + no_hp2 +".");
    }
}
