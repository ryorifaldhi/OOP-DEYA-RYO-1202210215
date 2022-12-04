package TP_RYORIFALDHI;

public class MainApp {
    
    public static void main(String[] args) {
        Perangkat device = new Perangkat("Adata", 2, 1.80);
        Laptop laptopSaya = new Laptop("Seagate", 8, 2.40, true);
        Handphone handphoneSaya = new Handphone("Sandisk", 3, 2.20, false);

        device.informasi();
        
        laptopSaya.informasi();
        laptopSaya.bukaGame("Dota 2");
        laptopSaya.kirimEmail("niceyuk@gmail.com");
        laptopSaya.kirimEmail("aanarji@gmail.com", "rusmangc@gmail.com");

        handphoneSaya.informasi();
        handphoneSaya.call(628122122);
        handphoneSaya.kirimSMS(62852112);
        handphoneSaya.kirimSMS(628121212, 629292211);
        
    }
}
