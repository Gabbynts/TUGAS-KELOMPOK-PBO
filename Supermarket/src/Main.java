public class Supermarket {

    private String namaProduk;
    private String namaSupplier;
    private String lokasiSupplier;
    private String hargaJual;
    private int stokProduk;
    private String hargaBeli;

    float hargaJualConv = Float.parseFloat(hargaJual);
    float hargaBeliConv = Float.parseFloat(hargaBeli);

    public String getNamaProduk() {
        return namaProduk;
    }

    public String getNamaSupplier() {
        return namaSupplier;
    }

    public String getLokasiSupplier() {
        return lokasiSupplier;
    }

    public float gethargaJual() {
        return hargaJual;
    }

    public String getStokProduk() {
        return stokProduk;
    }

    public float getHargaBeli() {
        return hargaBeli;
    }
}