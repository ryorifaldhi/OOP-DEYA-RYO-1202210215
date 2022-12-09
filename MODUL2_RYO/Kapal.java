package MODUL2;

public class Kapal extends TransportasiAir {
    protected String mesin;
    public Kapal(int jumlahKursi, int biaya, String mesin){
    super(jumlahKursi, biaya);
    this.mesin = mesin;    
    }
    
    @Override
    public void informasi(){
        System.out.println("Transportasi Air jenis Kapal dengan kursi berjumlah "+ this.jumlahKursi + " ditetapkan dengan biaya sebesar Rp. " + this.biaya);
    }

    @Override
    public void berlayar(){
        System.out.println("Transportasi Air jenis Kapal sedang berlayar menggunakan " + this.mesin + " dengan kecepatan yang tidak stabil");
    }

    public void berlayar(int kecepatan){
        System.out.println("Transportasi Air jenis Kapal sedang berlayar menggunakan " + this.mesin + " dengan kecepatan yang stabil di kisaran " + kecepatan + " knot");
    }

    @Override
    public void berlabuh(){
        System.out.println("Transportasi Air jenis Kapal berlabuh di pantai");
    }
}
