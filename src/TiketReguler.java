class TiketReguler extends Tiket {
    public TiketReguler(int harga, String fasilitas) {
        super("Reguler", harga, fasilitas);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Tiket Reguler - Harga: " + getHarga() + ", Fasilitas: " + getKategori());
    }
}
