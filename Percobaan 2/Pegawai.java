public class Pegawai {
    protected String nama; // Mengubah aksesibilitas dari private menjadi protected
    public double gaji;
}

public class Manajer extends Pegawai {
    public String departemen;
    
    public void IsiData(String n, String d) {
        nama = n; // Mengakses atribut protected nama dari kelas induk Pegawai
        departemen = d;
    }
}
