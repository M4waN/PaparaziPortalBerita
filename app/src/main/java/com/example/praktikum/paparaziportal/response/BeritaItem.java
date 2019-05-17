package com.example.praktikum.paparaziportal.response;


import com.google.gson.annotations.SerializedName;


public class BeritaItem{

	@SerializedName("jumlahUnduh_berita")
	private String jumlahUnduhBerita;

	@SerializedName("id_kategori")
	private String idKategori;

	@SerializedName("jumlahBaca_berita")
	private String jumlahBacaBerita;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("gambar_berita")
	private String gambarBerita;

	@SerializedName("judul_berita")
	private String judulBerita;

	@SerializedName("isi_berita")
	private String isiBerita;

	@SerializedName("status_berita")
	private String statusBerita;

	@SerializedName("keterangan_kategori")
	private String keteranganKategori;

	@SerializedName("id_penulis")
	private String idPenulis;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("judul_kategori")
	private String judulKategori;

	@SerializedName("slug_berita")
	private String slugBerita;

	@SerializedName("id_berita")
	private String idBerita;

	public void setJumlahUnduhBerita(String jumlahUnduhBerita){
		this.jumlahUnduhBerita = jumlahUnduhBerita;
	}

	public String getJumlahUnduhBerita(){
		return jumlahUnduhBerita;
	}

	public void setIdKategori(String idKategori){
		this.idKategori = idKategori;
	}

	public String getIdKategori(){
		return idKategori;
	}

	public void setJumlahBacaBerita(String jumlahBacaBerita){
		this.jumlahBacaBerita = jumlahBacaBerita;
	}

	public String getJumlahBacaBerita(){
		return jumlahBacaBerita;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setGambarBerita(String gambarBerita){
		this.gambarBerita = gambarBerita;
	}

	public String getGambarBerita(){
		return gambarBerita;
	}

	public void setJudulBerita(String judulBerita){
		this.judulBerita = judulBerita;
	}

	public String getJudulBerita(){
		return judulBerita;
	}

	public void setIsiBerita(String isiBerita){
		this.isiBerita = isiBerita;
	}

	public String getIsiBerita(){
		return isiBerita;
	}

	public void setStatusBerita(String statusBerita){
		this.statusBerita = statusBerita;
	}

	public String getStatusBerita(){
		return statusBerita;
	}

	public void setKeteranganKategori(String keteranganKategori){
		this.keteranganKategori = keteranganKategori;
	}

	public String getKeteranganKategori(){
		return keteranganKategori;
	}

	public void setIdPenulis(String idPenulis){
		this.idPenulis = idPenulis;
	}

	public String getIdPenulis(){
		return idPenulis;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public void setJudulKategori(String judulKategori){
		this.judulKategori = judulKategori;
	}

	public String getJudulKategori(){
		return judulKategori;
	}

	public void setSlugBerita(String slugBerita){
		this.slugBerita = slugBerita;
	}

	public String getSlugBerita(){
		return slugBerita;
	}

	public void setIdBerita(String idBerita){
		this.idBerita = idBerita;
	}

	public String getIdBerita(){
		return idBerita;
	}

	@Override
 	public String toString(){
		return 
			"BeritaItem{" + 
			"jumlahUnduh_berita = '" + jumlahUnduhBerita + '\'' + 
			",id_kategori = '" + idKategori + '\'' + 
			",jumlahBaca_berita = '" + jumlahBacaBerita + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",gambar_berita = '" + gambarBerita + '\'' + 
			",judul_berita = '" + judulBerita + '\'' + 
			",isi_berita = '" + isiBerita + '\'' + 
			",status_berita = '" + statusBerita + '\'' + 
			",keterangan_kategori = '" + keteranganKategori + '\'' + 
			",id_penulis = '" + idPenulis + '\'' + 
			",updated_at = '" + updatedAt + '\'' + 
			",judul_kategori = '" + judulKategori + '\'' + 
			",slug_berita = '" + slugBerita + '\'' + 
			",id_berita = '" + idBerita + '\'' + 
			"}";
		}
}