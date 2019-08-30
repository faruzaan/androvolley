package com.faruzaan.androidvolleylistview;

public class DataJenisMakanan {
    private String noid,nama,desk,gambar;

    public DataJenisMakanan(){}
    public DataJenisMakanan(String noid, String nama, String desk, String gambar) {
        this.noid = noid;
        this.nama = nama;
        this.desk = desk;
        this.gambar = gambar;
    }

    public String getNoid() {
        return noid;
    }

    public void setNoid(String noid) {
        this.noid = noid;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDesk() {
        return desk;
    }

    public void setDesk(String desk) {
        this.desk = desk;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }
}
