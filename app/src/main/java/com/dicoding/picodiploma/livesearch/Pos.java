package com.dicoding.picodiploma.livesearch;

import com.google.gson.annotations.SerializedName;

public class Pos  {

    @SerializedName("nama") private String nama;
    @SerializedName("alamat") private String alamat;
    @SerializedName("kecamatan") private String kecamatan;
    @SerializedName("kota") private String kota;
    @SerializedName("keterangan") private String keterangan;
    @SerializedName("penerima") private String penerima;
    @SerializedName("tgl_kirim") private String tgl_kirim;
    @SerializedName("tgl_terima") private String tgl_terima;

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public String getKota() {
        return kota;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public String getPenerima() {
        return penerima;
    }

    public String getTgl_kirim() {
        return tgl_kirim;
    }

    public String getTgl_terima() {
        return tgl_terima;
    }
}
