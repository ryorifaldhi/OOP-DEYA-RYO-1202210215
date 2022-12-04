package TP_RYORIFALDHI;

public class Laptop extends Perangkat {
    protected boolean webcam;

    public Laptop(String drive, int ram, double processor, boolean webcam) {
        super(drive, ram, processor);
        this.webcam = webcam;
    }

    @Override
    public void informasi() {
        
        System.out.println("Laptop memiliki drive tipe " + drive + " dengan ram sebesar "+ram+" GB dan processor secepat "+processor+ " Ghz");
        if (webcam == true) {
            System.out.println("Selain itu laptop ini juga memiliki Webcam");
        } else {
            System.out.println("Laptop tidak memiliki webcam");
        }
    }

    public void bukaGame(String nama_game) {
        System.out.println("Laptop berhasil membuka game " + nama_game);
    }

    public void kirimEmail(String email) {
        System.out.println("Laptop berhasil mengirim email ke " +email);

    }
    
    public void kirimEmail(String email1, String email2) {
        System.out.println("Laptop berhasil mengirim email ke " +email1+ " dan " +email2+"\n");
    }
    
}
