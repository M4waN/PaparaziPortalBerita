package com.example.praktikum.paparaziportal;

import android.content.ClipData;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.praktikum.paparaziportal.network.ApiServices;
import com.example.praktikum.paparaziportal.network.InitRetrovit;
import com.example.praktikum.paparaziportal.response.BeritaItem;
import com.example.praktikum.paparaziportal.response.ResponseBerita;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {


//    SwipeRefreshLayout swipe;
    private RecyclerView recyclerView;
    android.support.v7.widget.Toolbar toolbar;
    ImageView toolbarTitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bn_main);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

//        swipe = (SwipeRefreshLayout) findViewById(R.id.swipe_refresh_layout);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView = findViewById(R.id.rvListBerita);
        recyclerView.setLayoutManager(manager);
        tampilBerita();

    }
    private void tampilBerita() {
        ApiServices api = InitRetrovit.getInstance();
        Call<ResponseBerita> beritaCall = api.request_show_all_berita();

        beritaCall.enqueue(new Callback<ResponseBerita>() {
            @Override
            public void onResponse(Call<ResponseBerita> call, Response<ResponseBerita> response) {
                if (response.isSuccessful()) {
                    Log.d("response api", response.body().toString());
                    List<BeritaItem> data_berita = response.body().getBerita();
                    boolean status = response.body().isStatus();

                    if (status) {
                        AdapterBerita adapter = new AdapterBerita(MainActivity.this, data_berita);
                        recyclerView.setAdapter(adapter);

//                        swipe.setOnRefreshListener(MainActivity.this);
//                        swipe.post(new Runnable() {
//                            @Override
//                            public void run() {
//                                swipe.setRefreshing(true);
//
//
//
//                            }
//                        });
                    } else {
                        Toast.makeText(MainActivity.this, "Tidak ada berita untuk saat ini", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<ResponseBerita> call, Throwable t) {
                t.printStackTrace();

            }
        });
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.home_menu:
                break;
//            case R.id.search_menu:
//                Intent login_menu = new Intent(MainActivity.this, LoginActivity.class);
//                startActivity(login_menu);
//                break;
            case R.id.account_menu:
                Intent account_menu = new Intent(MainActivity.this, AccountActivity.class);
                startActivity(account_menu);
                break;
        }
        return false;
    }


//    private void setBeritaList() {
//        swipe.setRefreshing(false);
//        tampilBerita();
//
//    }
}
