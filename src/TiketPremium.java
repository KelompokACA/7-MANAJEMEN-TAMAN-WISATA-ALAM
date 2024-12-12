class TiketPremium extends Tiket {
    public TiketPremium(int harga, String fasilitas) {
        super("Premium", harga, fasilitas);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Tiket Premium - Harga: " + getHarga() + ", Fasilitas: " + getKategori());
    }
}
