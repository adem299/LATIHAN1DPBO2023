public class Mahasiswa {
    // name mhs
    private String name;
    // NIM mhs
    private String NIM;
    // prodi mhs
    private String prodi;
    // fakultas
    private String fakultas;

    Mahasiswa() {} // konstruktor Mahasiswa

    Mahasiswa(String name, String NIM, String prodi, String fakultas) {
        // konstruktor langsung isi attribut
        this.name = name;
        this.NIM = NIM;
        this.prodi = prodi;
        this.fakultas = fakultas;
    }

    /* Getter and setter */

    // setter
    public void setName(String nm) {
        this.name = nm;
    }

    public void setNIM(String nim) {
        this.NIM = nim;
    }

    public void setProdi(String prd) {
        this.prodi = prd;
    }

    public void setFakultas(String fklts) {
        this.fakultas = fklts;
    }

    // getter
    public String getName() {
        return name;
    }

    public String getNIM() {
        return NIM;
    }

    public String getProdi() {
        return prodi;
    }
    public String getFakultas() {
        return fakultas;
    }
    
}
