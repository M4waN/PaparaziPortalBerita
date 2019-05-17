package com.example.praktikum.paparaziportal.network;

import com.example.praktikum.paparaziportal.response.ResponseBerita;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiServices {
   @GET("berita")
    Call<ResponseBerita> request_show_all_berita();

    @FormUrlEncoded
    @POST("login")
    Call<ResponseBody> loginRequest(@Field("useroremail") String email,
                                    @Field("password") String password);

    // Fungsi ini untuk memanggil API http://10.0.2.2/mahasiswa/register.php
    @FormUrlEncoded
    @POST("register")
    Call<ResponseBody> registerRequest(@Field("nama") String nama,
                                    @Field("email") String email,
                                    @Field("username") String username,
                                    @Field("password") String password);
}
