public class Laptop extends Perangkat {
    protected boolean webcam;

    public Laptop(String drive, int ram, double processor, boolean webcam) {
        super(drive, ram, processor);
    }

    @Override
    public void informasi() {
        if (webcam) {
            System.out.println("Laptop ini memiliki drive tipe " + (drive) + " dengan RAM sebesar " + (ram) + " GB dan processor dengan kecepatan " + (processor) + " GHz. Laptop ini memiliki Webcam.\n");
        } 
        else {
            System.out.println("Laptop ini memiliki drive tipe " + (drive) + " dengan RAM sebesar " + (ram) + " GB dan processor dengan kecepatan " + (processor) + " GHz. Laptop ini tidak memiliki Webcam.\n");
        }
    }

    public void bukaGame(String nama_game) {
        System.out.println("Laptop berhasil membuka game " + nama_game + ".");
    }
    public void KirimEmail(String email) {
        System.out.println("Laptop berhasil mengirim email ke " + email + ".");
    }
    public void KirimEmail(String email1, String email2) {
        System.out.println("Laptop berhasil mengirim email dari " + email1 + "ke " + email2 + ".");
    }
}
